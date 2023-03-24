package stepDefinitions;

import io.cucumber.java.en.Then;
import pageactions.PageObjectInitialization;

public class MyStepDef2 {
    PageObjectInitialization pageObjectInitialization = null;
    public MyStepDef2(PageObjectInitialization pageObjectInitialization) {
        this.pageObjectInitialization = pageObjectInitialization;
    }

    @Then("Validates the presence of header {string}")
    public void validatesThePresenceOfHeader(String type) {
        pageObjectInitialization.testPageActions2.validateOnNextPage(type);
    }
}
