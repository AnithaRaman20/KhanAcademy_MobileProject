package Practice.Appium_Framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC04_BookmarkPage {
	AndroidDriver<AndroidElement> driver;
	  public TC04_BookmarkPage(AndroidDriver driver) {
	        this.driver=driver;
	    }
	  
		  
	  public String addBookmark() throws InterruptedException {
		  String bookmarkName="";
		  //click on search button 		  
		  driver.findElement(By.xpath("//*[@text='Search']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@text='Life skills']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@text='College admissions']")).click();
		  Thread.sleep(5000);
		//  driver.findElement(By.xpath("//*[@text='Getting started']")).click();
		
		
		 driver.findElement(By.xpath("//*[@text='Introduction: College admissions']")).click();
		  Thread.sleep(3000);
		 
		  
		  bookmarkName=driver.findElement(By.xpath("//*[@text='Introduction: College admissions']")).getText();
		  System.out.println(bookmarkName);
		  driver.findElement(By.className("android.widget.ImageView")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("android:id/button2")).click();
		  return bookmarkName;
	  }

	  public boolean verifyBookmark(String bookmarkName) throws InterruptedException {
		  driver.findElement(By.id("org.khanacademy.android:id/tab_bar_button_bookmarks")).click();
		  String ActualbookmarkName=driver.findElement(By.xpath("//*[@text='Introduction: College admissions']")).getText();
		  //come back to Home screen
		  driver.findElement(By.xpath("//*[@text='Home']")).click();
		  Thread.sleep(3000);
		  if(bookmarkName.equalsIgnoreCase(ActualbookmarkName)) {
			  return true;
		  }
			
		  else
			  return false;
		  
		 
		  
}
}
