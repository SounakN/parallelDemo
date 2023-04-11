package pageactions;

import driver.WebBrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestPageActions extends ParentPageActions {
    public WebBrowserFactory webBrowserFactory = null;
    private String amazonSearchBar_loc = "//input[@placeholder='Search Amazon']";

    public TestPageActions(WebBrowserFactory browserFactory) {
        super(browserFactory);
        this.webBrowserFactory = browserFactory;
    }

    public void goToUrl(String url) throws InterruptedException {
        webBrowserFactory.getDriverService().get(url);
    }

    public void findSearchBar(String toType) throws InterruptedException {
        WebElement searchBar_elem = null;
        searchBar_elem = webBrowserFactory.getDriverService().findElement(By.xpath(amazonSearchBar_loc));
        WebDriverWait wait = new WebDriverWait(webBrowserFactory.getDriverService(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchBar_elem));
        searchBar_elem.sendKeys(toType);
        searchBar_elem.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }


}
