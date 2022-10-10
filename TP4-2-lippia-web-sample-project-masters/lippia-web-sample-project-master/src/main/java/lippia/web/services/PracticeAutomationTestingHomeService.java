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

    public static void enterShop() {
        click(PracticeAutomationTestingConstants.SHOP_ID);
    }

    public static void enterHome() {
        click(PracticeAutomationTestingConstants.HOME_ID);
    }


    public static void searchArrivals() {
        Assert.assertTrue(WebActionManager.isVisible(PracticeAutomationTestingConstants.FIRSTARRIVAL));
        Assert.assertTrue(WebActionManager.isVisible(PracticeAutomationTestingConstants.SECONDARRIVAL));
        Assert.assertTrue(WebActionManager.isVisible(PracticeAutomationTestingConstants.THREEARRIVAL));
    }

    public static void selectArrivals() {
        click(PracticeAutomationTestingConstants.SELECTARRIVALS);
    }

    public static void nextPage() {
        Assert.assertTrue(WebActionManager.isVisible(PracticeAutomationTestingConstants.NEXTPAGE));
    }
}
