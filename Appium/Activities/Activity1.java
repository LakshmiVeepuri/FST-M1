package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {

    AndroidDriver driver;

    WebDriver wait;

    @BeforeClass
    public void setup() throws MalformedURLException {
       // UiAutomator2options options =
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("realme 5");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.coloros.calculator");
        //com.android.calculator2.Calculator"
        options.setAppActivity("com.android.calculator2.Calculator");
        options.noReset();

    //instanciate appium driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        // driver initialization
        driver = new AndroidDriver(appServer, options);


    }
    @Test
    public void addition(){
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_9")).click();


    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
