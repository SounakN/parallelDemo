package driver;

import org.openqa.selenium.WebDriver;

public class WebBrowserFactory {
    public WebBrowserFactory() {
    }

    ;

    public static ThreadLocal<IDriver> DriverService = new ThreadLocal<>();
    private static Browsers BrowserDriver;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // To set the browser type through a Singleton Methodology
    public static void setBrowserType(String BrowserType) throws Exception {

        BrowserDriver = Browsers.get(BrowserType);
        if(DriverService.get()==null){
            System.out.print("Thread id :: "+Thread.currentThread().getId()+" got in to the block");
            switch (BrowserDriver) {

                case CHROME:
                    DriverService.set(new CHDriver());
                    break;

                case FIREFOX:
                    DriverService.set(new FFDriver());
                    break;

                case EDGE:
                    DriverService.set(new EDGEDriver());
                    break;
                default:
                    break;
            }

        }else{
            System.out.print("Thread id :: "+Thread.currentThread().getId()+" DIDNOT got in to the block");
        }

        driver.set(DriverService.get().get());
    }

    public synchronized WebDriver getDriver() {
        return driver.get();
    }
    public synchronized WebDriver getDriverService() {
        return DriverService.get().get();
    }

    // To stop the driver
    public void quit() throws Exception {
        /*getDriver().quit();*/
        DriverService.get().stopDriver();
    }
}