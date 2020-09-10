package Practice.Appium_Framework;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC05_AddCourse {
	AndroidDriver<AndroidElement> driver;
	  public TC05_AddCourse(AndroidDriver driver) {
	        this.driver=driver;
	    }
	    
	  public String addCourse() throws InterruptedException {
		 
		  // click on edit of my courses
		  driver.findElement(By.xpath("//*[@text='Edit']")).click();
		  Thread.sleep(4000);
		  //scrolldown to graduate studies.	
		  driver.findElement(By.xpath("//*[@class='android.widget.ImageView']")).click();
		  Thread.sleep(4000);
		  
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Graduate studies\"));");
			
		
		  //Tap on to graduate studies. 
		  WebElement expand =  driver.findElement(By.xpath("//*[@text='Graduate studies]")); 
		  TouchAction t=new TouchAction(driver);
		  t.tap(tapOptions().withElement(element(expand))).perform(); 
		//Scroll down to compute programming and select the checkbox.Apply assert on computer programming. 
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Computer programming\"));"
		  );
		  String selectCourse=driver.findElement(By.xpath("//*[@text='Computer programming]")).getText();
		  driver.findElement(By.xpath("//*[@text='Computer programming]")).click();
		 
		//Click on Done.
		  System.out.println("images "+driver.findElements(By.className("android.widget.Button")).size());
		  driver.findElements(By.className("android.widget.Button")).get(1).click();	  
		  Thread.sleep(8000);
		  return selectCourse;
	  }
	  public boolean checkCourse() throws InterruptedException {
		//put an assert to validate the same course is coming in home screen.
		 boolean courseAppears = driver.findElement(By.xpath("//*[@text='Class 4 math (India)']")).isDisplayed();
		 return courseAppears;
		  
	  }
}
