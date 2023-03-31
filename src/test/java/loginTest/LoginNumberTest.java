package loginTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginNumberTest {

    private AppiumDriver driver;

    @BeforeMethod
    void beforeMethod() throws MalformedURLException {
        DesiredCapabilities deviceInfo = new DesiredCapabilities();
        deviceInfo.setCapability("platformName","Android");
        deviceInfo.setCapability("version","13");
        deviceInfo.setCapability("deviceName","R5CR90QTJ8J");
        deviceInfo.setCapability("app","C:\\Users\\Jar\\Downloads\\The_Dengi_Build_Version_15.apk");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),deviceInfo);


    }

    @AfterMethod
    void afterMethod(){
        driver.quit();
    }

    @Test
    void testAddNumberPhone() throws InterruptedException {
        Thread.sleep(30000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.EditText")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.EditText")).sendKeys("9231471521");
        Thread.sleep(6000);

        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.EditText")).sendKeys("123");
        Thread.sleep(5000);

        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.tap(PointOption.point(530, 1300)).perform();



    }
}
