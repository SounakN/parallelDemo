package stepDefinitions;

import driver.WebBrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageactions.PageObjectInitialization;

public class MyStepdefs {

    PageObjectInitialization pageObjectInitialization = null;
    public MyStepdefs(PageObjectInitialization pageObjectInitialization) {
        this.pageObjectInitialization = pageObjectInitialization;
    }

    @Given("user types {string} for amazon")
    public void userTypes(String url) throws InterruptedException {
        pageObjectInitialization.testPageActions.goToUrl(url);
    }


    @Then("Searches for {string} in Amazon")
    public void searchesForInAmazon(String toType) throws InterruptedException {
        pageObjectInitialization.testPageActions.findSearchBar(toType);
    }
}
