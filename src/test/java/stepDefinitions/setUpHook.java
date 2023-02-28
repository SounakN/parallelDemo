package stepDefinitions;

import driver.WebBrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class setUpHook extends WebBrowserFactory{
    private WebBrowserFactory webBrowserFactory;

    public setUpHook(WebBrowserFactory webBrowserFactory){
        this.webBrowserFactory =webBrowserFactory;
    }

    @Before
    public void Initiation(Scenario sc) throws Exception {
        System.out.println(sc.getName() + " is being running at :: "+ Thread.currentThread().getId());
        setBrowserType("Chrome");
    }


    @After
    public void TearDown(Scenario sc) throws Exception {
        quit();
    }
}
