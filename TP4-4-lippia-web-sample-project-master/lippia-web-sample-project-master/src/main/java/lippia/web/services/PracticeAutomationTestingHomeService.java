package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeAutomationTestingConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class PracticeAutomationTestingHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterMyAccount() {
        click(PracticeAutomationTestingConstants.MY_ACCOUNT);
    }

    public static void enterUser(String text) {
        setInput(PracticeAutomationTestingConstants.USER, text);
    }
    public static void enterPass(String text) {
        setInput(PracticeAutomationTestingConstants.PASS,text);
    }
    public static void clickButton() {
        click(PracticeAutomationTestingConstants.CLICKBUTTON);
    }

    public static void error() {
        Assert.assertTrue(WebActionManager.isVisible(PracticeAutomationTestingConstants.ERROR));
    }
}
