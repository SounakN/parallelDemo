package pageactions;

import driver.WebBrowserFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestPageActions2 extends ParentPageActions {
    public WebBrowserFactory webBrowserFactory = null;
    private String googleSearchOutcome_loc = "//span[text()='Steven Wilson']";
    private String amazonSearchOutcome_loc = "//span[contains(text(),'iPhone')]";

    public TestPageActions2(WebBrowserFactory browserFactory) {
        super(browserFactory);
        this.webBrowserFactory = browserFactory;
    }

    public void validateOnNextPage(String type){
        WebElement validatePresence_elem = null;
        if(type.equals("Google")){
            validatePresence_elem = webBrowserFactory.getDriver().findElement(By.xpath(googleSearchOutcome_loc));
        }else{
            validatePresence_elem = webBrowserFactory.getDriver().findElement(By.xpath(amazonSearchOutcome_loc));
        }
        Assertions.assertNotNull(validatePresence_elem);
        Assertions.assertTrue(validatePresence_elem.isDisplayed());
    }

}
