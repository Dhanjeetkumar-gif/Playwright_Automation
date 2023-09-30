package hooks;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    String browser="chrome";
    DriverFactory driverFactory;
    @Before
    public void initializeBrowser(){
         driverFactory= new DriverFactory(browser);

    }

    @After
    public void tearDown(){
        driverFactory.getPage().close();
    }
}
