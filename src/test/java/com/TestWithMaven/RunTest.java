package com.TestWithMaven;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import utils.AutomationConstants;
import utils.BrowserFactory;
import utils.WebDriverUtil;

import java.util.concurrent.TimeUnit;

/**
 * Created by pc on 04-Feb-17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        tags = {"@smoke1"},
        features= "src/test/resources"
)
public class RunTest {
    static WebDriver driver;
    @BeforeClass
    public static void start() {
        try {
            BrowserFactory.OpenBrowser(AutomationConstants.BROWSER_TYPE, AutomationConstants.URL);
            driver = BrowserFactory.driver;
            driver.manage().timeouts().implicitlyWait(AutomationConstants.MAX_TIMEOUTS, TimeUnit.SECONDS);
            //Assert.assertTrue(WebDriverUtil.isTextPresent("Why Choose IPASS"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void stop() throws InterruptedException {
        Thread.sleep(5000);
        BrowserFactory.closeBrowser();
    }
}
