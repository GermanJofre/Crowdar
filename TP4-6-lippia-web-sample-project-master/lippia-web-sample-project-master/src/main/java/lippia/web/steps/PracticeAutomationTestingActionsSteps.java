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

    @And("The client enter with username (.*)$")
    public void user(String text1) {
        PracticeAutomationTestingHomeService.enterUser(text1);}

    @And("The client enter with password (.*)$")
    public void pass(String text2) {
        PracticeAutomationTestingHomeService.enterPass(text2);
    }

    @And("The client click on login button")
    public void clickButton1() {
        PracticeAutomationTestingHomeService.clickButton1();
    }
    @And("The client must successfully login to the web page")
    public void seePage() {
        PracticeAutomationTestingHomeService.seePage();
    }
    @And("The client click on my Account link")
    public void clickAccount() {
        PracticeAutomationTestingHomeService.clickAccount();
    }
    @And("Click on logout button")
    public void clickButton2() {
        PracticeAutomationTestingHomeService.clickButton2();
    }
    @Then("The client see successfully comes out from the site")
    public void Succesfully() {
        PracticeAutomationTestingHomeService.succesfully();
    }

}
