package Practice.Appium_Framework;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC01Page {
	AndroidDriver<AndroidElement> driver;
	  public TC01Page(AndroidDriver driver) {
	        this.driver=driver;
	    }
	    
	  public void CheckMessage() throws InterruptedException {
		  Thread.sleep(8000);	
		  //as Whats new info is not coming up always putting it in a condition
		  boolean message= driver.findElementByAndroidUIAutomator("text(\"What\'s New\")").isDisplayed();
		  System.out.println("message is "+message);
		  if(message) {
			  driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
		  }
		  //check if covid related data is displayed
		  Thread.sleep(2000);
		  boolean Cmessage= driver.findElement(MobileBy.AccessibilityId("Warning")).isDisplayed();
		  //boolean Cmessage= driver.findElement(By.xpath("//*[contains(text(), 'COVID')]")).isDisplayed();
		  System.out.println(Cmessage);
			 
		  if(Cmessage) {
			  driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
		  }
		  else
			  System.out.println("Covid information is not avialable");
		  
}
}