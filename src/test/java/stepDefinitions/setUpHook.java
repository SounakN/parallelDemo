package stepDefinitions;

import driver.BasicConstants;
import driver.WebBrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.TestInstance;
import pageactions.PageObjectInitialization;
import utilities.EnvUtil;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class setUpHook extends WebBrowserFactory{
    private WebBrowserFactory webBrowserFactory;
    private PageObjectInitialization pageObjectInitialization;
    public setUpHook(WebBrowserFactory webBrowserFactory){
        this.webBrowserFactory =webBrowserFactory;
    }

    @Before
    public void Initiation(Scenario sc) throws Exception {
        EnvUtil.loadProperties("QA");
        System.out.println(sc.getName() + " is being running at :: "+ Thread.currentThread().getId());
        PageObjectInitialization.initializeObjects(webBrowserFactory);
        setBrowserType("Chrome");
    }


    @After
    public void TearDown(Scenario sc) throws Exception {
        quit();
    }
}
