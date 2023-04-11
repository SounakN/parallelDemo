package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageactions.PageObjectInitialization;

public class MyStepDef3 {
    PageObjectInitialization pageObjectInitialization = null;
    public MyStepDef3(PageObjectInitialization pageObjectInitialization) {
        this.pageObjectInitialization = pageObjectInitialization;
    }

    @Given("user types {string} for flipkart")
    public void userTypes(String url) throws InterruptedException {
        pageObjectInitialization.testPageActions3.goToUrl(url);
    }
    @When("the modal appears close it")
    public void theModalAppearsCloseIt() {
        pageObjectInitialization.testPageActions3.checkForModal();
    }

    @Then("Searches for {string} in Flipkart")
    public void searchesForInAmazon(String toType) throws InterruptedException {
        pageObjectInitialization.testPageActions3.findSearchBar(toType);
    }


}
