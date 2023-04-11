package pageactions;

import driver.WebBrowserFactory;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestPageActions2 extends ParentPageActions {
    public WebBrowserFactory webBrowserFactory = null;
    private String flipkart_Outcome = "//span[text()='Filters']";
    private String amazonSearchOutcome_loc = "//span[contains(text(),'iPhone')]";

    public TestPageActions2(WebBrowserFactory browserFactory) {
        super(browserFactory);
        this.webBrowserFactory = browserFactory;
    }

    public void validateOnNextPage(String type){
        WebElement validatePresence_elem = null;
        if(type.equals("Flipkart")){
            validatePresence_elem = webBrowserFactory.getDriverService().findElement(By.xpath(flipkart_Outcome));
        }else{
            validatePresence_elem = webBrowserFactory.getDriver().findElement(By.xpath(amazonSearchOutcome_loc));
        }
        Assertions.assertThat(validatePresence_elem).isNotNull();
        Assertions.assertThat(validatePresence_elem.isDisplayed()).isTrue();
    }

}
