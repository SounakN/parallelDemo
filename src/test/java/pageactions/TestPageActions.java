package pageactions;

import driver.WebBrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestPageActions extends ParentPageActions {
    public WebBrowserFactory webBrowserFactory = null;
    private String googleSearchBar_loc = "//input[@name='q']";
    private String amazonSearchBar_loc = "//input[@placeholder='Search Amazon']";

    public TestPageActions(WebBrowserFactory browserFactory) {
        super(browserFactory);
        this.webBrowserFactory = browserFactory;
    }
    public void goToUrl(String url) throws InterruptedException {
        webBrowserFactory.getDriver().get(url);
        Thread.sleep(5000);
    }

    public void findSearchBar(String toType, String type) throws InterruptedException {
        WebElement searchBar_elem = null;
        if(type.equals("Google")){
            searchBar_elem = webBrowserFactory.getDriver().findElement(By.xpath(googleSearchBar_loc));
        }else{
            searchBar_elem = webBrowserFactory.getDriver().findElement(By.xpath(amazonSearchBar_loc));
        }
        searchBar_elem.sendKeys(toType);
        searchBar_elem.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }


}
