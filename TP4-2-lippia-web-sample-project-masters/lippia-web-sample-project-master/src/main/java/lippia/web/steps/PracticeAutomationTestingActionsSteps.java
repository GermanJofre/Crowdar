package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.PracticeAutomationTestingHomeService;

public class PracticeAutomationTestingActionsSteps extends PageSteps {

    @Given("The client is in practice automationtesting page")
    public void page() {
        PracticeAutomationTestingHomeService.navegarWeb();
    }

    @When("The client click on the Shop Menu")
    public void shop() {
        PracticeAutomationTestingHomeService.enterShop();
    }

    @And("The client go back Home Menu")
    public void home() {
        PracticeAutomationTestingHomeService.enterHome();
    }

    @And("The client see only 3 arrivals")
    public void arrivals() {
        PracticeAutomationTestingHomeService.searchArrivals();
    }

    @And("The client click one of the arrivals")
    public void selectArrivals() {
        PracticeAutomationTestingHomeService.selectArrivals();
    }

    @Then("The client see the next page")
    public void nextPage() {
        PracticeAutomationTestingHomeService.nextPage();
    }

}
