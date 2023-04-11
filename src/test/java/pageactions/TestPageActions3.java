package pageactions;

import driver.WebBrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestPageActions3 extends ParentPageActions {
    WebDriverWait wait = null;
    public WebBrowserFactory webBrowserFactory = null;
    private String flipkart_SearchBar = "//input[@placeholder='Search for products, brands and more']";
    private String flipkart_Modal_cross= "//div/button[text()='Request OTP']//ancestor::div/button";

    public TestPageActions3(WebBrowserFactory browserFactory) {
        super(browserFactory);
        this.webBrowserFactory = browserFactory;
        wait = new WebDriverWait(webBrowserFactory.getDriverService(), Duration.ofSeconds(10));
    }
    public void goToUrl(String url) throws InterruptedException {
        webBrowserFactory.getDriverService().get(url);
    }
    public void checkForModal(){
        WebElement modal = webBrowserFactory.getDriverService().findElement(By.xpath(flipkart_Modal_cross));
        wait.until(ExpectedConditions.elementToBeClickable(modal));
        modal.click();
    }

    public void findSearchBar(String toType) throws InterruptedException {
        WebElement searchBar_elem = null;

        searchBar_elem = webBrowserFactory.getDriverService().findElement(By.xpath(flipkart_SearchBar));


        wait.until(ExpectedConditions.elementToBeClickable(searchBar_elem));
        searchBar_elem.sendKeys(toType);
        searchBar_elem.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }


}
