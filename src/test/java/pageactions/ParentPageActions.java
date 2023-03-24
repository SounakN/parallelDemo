package pageactions;

import driver.WebBrowserFactory;

public abstract class ParentPageActions {
    public WebBrowserFactory BrowserFactory = null;
    public ParentPageActions(WebBrowserFactory browserFactory) {
        this.BrowserFactory = browserFactory;
    }
}
