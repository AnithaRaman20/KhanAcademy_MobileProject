package Practice.Appium_Framework;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC02_SignupPage {
	AndroidDriver<AndroidElement> driver;
	  public TC02_SignupPage(AndroidDriver driver) {
	        this.driver=driver;
	    }
	    
	  public void signUp() throws InterruptedException {
		  	
		  //click on sign in button and then on continue with google
		  
			  driver.findElement(By.xpath("//*[@text='Sign in']")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//*[@text='Continue with Google']")).click();
			  Thread.sleep(3000);
			  //choose the existing account
			  driver.findElement(By.xpath("//*[@text='Anitha Raman']")).click();
			  //verify signed in by checking if my courses are displayed
			  driver.findElement(By.xpath("//*[@text='My courses']")).isDisplayed();
			  
			    }
	  public boolean verifyLogin() throws InterruptedException {
		  	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
		  	 Thread.sleep(3000);
		  	boolean userLogin = driver.findElement(By.xpath("//*[@text='anitha.ram20']")).isDisplayed();
			  Thread.sleep(3000);
			  //go back to home
			  driver.findElement(By.xpath("//*[@class='android.widget.ImageView']")).click();
			  Thread.sleep(3000);
		  	 return userLogin;
	  }

}
