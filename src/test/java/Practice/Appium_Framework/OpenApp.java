package Practice.Appium_Framework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OpenApp extends Capability{

	//public static void main(String[] args) throws MalformedURLException, InterruptedException {
	@BeforeTest(alwaysRun=true)
	public void openAPP() throws IOException{
		AndroidDriver<AndroidElement> driver= DesiredCapability();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}


}
