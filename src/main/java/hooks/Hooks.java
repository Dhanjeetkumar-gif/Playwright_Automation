package hooks;

//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import driverFactory.DriverFactory;
import org.junit.After;
import org.junit.Before;


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
