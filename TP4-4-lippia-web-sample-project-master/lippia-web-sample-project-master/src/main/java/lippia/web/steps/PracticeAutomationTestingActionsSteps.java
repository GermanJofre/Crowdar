package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.PracticeAutomationTestingHomeService;

public class PracticeAutomationTestingActionsSteps extends PageSteps {

    @Given("The client is in practice automationtesting page")
    public void page() {
        PracticeAutomationTestingHomeService.navegarWeb();
    }

    @When("The client click on My Account")
    public void account() {
        PracticeAutomationTestingHomeService.enterMyAccount();
    }

    @And("The client enter empty username (.*)$")
    public void user(String user) {
        PracticeAutomationTestingHomeService.enterUser(user);

    }

    @And("The client now enter valid password (.*)$")
    public void pass(String enter) {
        PracticeAutomationTestingHomeService.enterPass(enter);
    }

    @And("The client click on login button")
    public void clickButton() {
        PracticeAutomationTestingHomeService.clickButton();
    }

    @Then("The client see a error")
    public void error() {
        PracticeAutomationTestingHomeService.error();
    }

}
