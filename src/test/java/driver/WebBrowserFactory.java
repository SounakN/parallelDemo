package driver;

import org.openqa.selenium.WebDriver;

public class WebBrowserFactory {
	public WebBrowserFactory() {
	};

	public static IDriver DriverService = null;
	private static Browsers BrowserDriver;
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	// To set the browser type through a Singleton Methodology
	public static void setBrowserType(String BrowserType) throws Exception {

		BrowserDriver = Browsers.get(BrowserType);
		if (null == DriverService) {
			switch (BrowserDriver) {

				case CHROME:
					DriverService = new CHDriver();
					break;

				case FIREFOX:
					DriverService = new FFDriver();
					break;

				case EDGE:
					DriverService = new EDGEDriver();
					break;
				default:
					break;
			}
		}

		driver.set(DriverService.get());
	}

	public static synchronized  WebDriver getDriver() {
		return driver.get();
	}

	// To stop the driver
	public static void quit() throws Exception {
		if(DriverService!=null){
			getDriver().quit();
		}

	}

}