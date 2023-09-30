package driverFactory;

import com.microsoft.playwright.*;


public class DriverFactory {
         Page page;
       private Browser browser;

        public DriverFactory(String browserName) {
            Playwright playwright = Playwright.create();
            switch (browserName){
                case "chrome":
                  browser  = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                    break;
                case "firefox":
                    browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                    break;
                case "safari":
                    browser=playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));

            }


            BrowserContext browserContext = browser.newContext();
             page = browserContext.newPage();

        }
        public Page getPage(){
            return this.page;
        }

    }

