package test.features;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import internal.pageobjects.Registerationpage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import test.base.Basetest;

public class Registeration extends Basetest {

	@Test

	public void RegisterUser() throws MalformedURLException {

		Registerationpage start = new Registerationpage(driver);
		start.getstartedbutton();
		start.allowbutton();
		start.setcountry("Sweden (+46)");
		String s = start.enterphonenumber("+46707471573");
		start.verifyphonenumber();
		String s1 = driver.findElement(By.id("com.rebtel.android:id/smsNumber")).getText();
		System.out.println(s1);
		Assert.assertEquals(s, s1);

	}
}
