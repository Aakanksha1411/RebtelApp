package test.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Basetest {
	public AndroidDriver driver;
	AppiumDriverLocalService service;

	@BeforeClass
	public void configure() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//resources//data.properties");
		prop.load(fis);
		String ipAddress = prop.getProperty("ipAddress");
		String Port = prop.getProperty("Port");
		int port = Integer.parseInt(Port);
		String APKpath = prop.getProperty("APKpath");
		String AndroidDeviceName = prop.getProperty("AndroidDeviceName");

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("noReset", true);
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C://Users//aayan//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))

				.withIPAddress(ipAddress).usingPort(port).withTimeout(Duration.ofSeconds(300)).build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setApp(APKpath);

		options.setDeviceName(AndroidDeviceName);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterClass

	public void teardown() {
		driver.quit();
		service.stop();
	}

}
