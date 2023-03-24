package pageactions;

import driver.WebBrowserFactory;

import java.util.function.Supplier;

public class PageObjectInitialization {
    private static Supplier<ParentPageActions> _testPageActions = null;
    private static Supplier<ParentPageActions> _testPageActions2 = null;
    public static void initializeObjects(WebBrowserFactory browserFactory){
        _testPageActions = ()->  new TestPageActions(browserFactory);
        _testPageActions2 = ()->  new TestPageActions2(browserFactory);
    }
    public TestPageActions testPageActions = (TestPageActions) _testPageActions.get();
    public TestPageActions2 testPageActions2 = (TestPageActions2) _testPageActions2.get();

}
