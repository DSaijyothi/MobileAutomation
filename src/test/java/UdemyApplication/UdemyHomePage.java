package UdemyApplication;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class UdemyHomePage {
    AppiumDriver appiumDriver;
    AndroidDriver androidDriver;

    @Test
    public void LaunchApp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\SaiJyothi D\\IdeaProjects\\Udemy\\src\\main\\resources\\udemy-apkbigs.com.apk");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        androidDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        androidDriver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.udemy.android:id/signin_button\")\n")).click();
        androidDriver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sign in with email\")")).click();
        androidDriver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("saijyothid12@gmail.com");
        androidDriver.findElement(AppiumBy.id("com.udemy.android:id/nextBtn")).click();
        androidDriver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Saijyothi@123");
        androidDriver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.udemy.android:id/signin_button\")")).click();
        androidDriver.findElement(new AppiumBy.ByAccessibilityId("Search tab")).click();
        androidDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        androidDriver.findElement(AppiumBy.id("com.udemy.android:id/search_bar_text")).sendKeys("Appium");
        androidDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        //androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
      Actions action = new Actions(androidDriver);
      action.sendKeys(Keys.ENTER).perform();





    }
}