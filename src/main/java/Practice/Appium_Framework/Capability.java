package Practice.Appium_Framework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability {
	static protected String appPackage;
	static protected String appActivity;
	static protected String deviceName;
	static protected String chromeDriverexe;
	protected static AndroidDriver<AndroidElement> driver;

public static AndroidDriver<AndroidElement> DesiredCapability() throws IOException {
		FileReader fr = new  FileReader(System.getProperty("user.dir")+"//src//main//java//global.properties");
		Properties prop= new Properties();
		prop.load(fr);
		appPackage=prop.getProperty("AppPackage");
		appActivity=prop.getProperty("AppActivity");
		chromeDriverexe=prop.getProperty("ChromeDriverExecutable");
		deviceName=prop.getProperty("DeviceName");
	

		DesiredCapabilities cap= new DesiredCapabilities ();
		//common capabilities required to test an app
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		//chrome driver executable specific to android
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, chromeDriverexe);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity );
        driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		return driver;
	}



}
