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

    @And("The client enter empty email")
    public void email() {
        PracticeAutomationTestingHomeService.enterEmail();

    }

    @And("The client enter empty password")
    public void pass() {
        PracticeAutomationTestingHomeService.enterPass();
    }

    @And("The client click on register button")
    public void clickButton() {
        PracticeAutomationTestingHomeService.clickButton();
    }

    @Then("The client see a warning message")
    public void error() {
        PracticeAutomationTestingHomeService.error();
    }

}
