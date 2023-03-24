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

    @Given("user types {string}")
    public void userTypes(String url) throws InterruptedException {
        pageObjectInitialization.testPageActions.goToUrl(url);
    }

    @Then("Searches for {string} in {string}")
    public void searchesForIn(String toType, String type) throws InterruptedException {
        pageObjectInitialization.testPageActions.findSearchBar(toType,type);
    }

}
