package Practice.Appium_Framework;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC03_SearchPage {
	AndroidDriver<AndroidElement> driver;
	  public TC03_SearchPage(AndroidDriver driver) {
	        this.driver=driver;
	    }
	    
	  public boolean searchCourse() throws InterruptedException {
		  	
		  //click on search button 		  
		  driver.findElement(By.xpath("//*[@text='Search']")).click();
		  Thread.sleep(3000);
		  //enter the keyword to search
		  driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("Computer");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@text='What is a computer?']")).click();
		  Thread.sleep(3000);
		  //verify the searched contents
		  boolean result= driver.findElement(By.xpath("//*[@text='What is a computer?']")).isDisplayed();
		  driver.findElement(By.xpath("//*[@text='Home']")).click();
		  Thread.sleep(3000);
		  return result;
		  
			  
	  }


}
