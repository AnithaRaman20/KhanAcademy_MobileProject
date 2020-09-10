package Practice.Appium_Framework;

import org.testng.annotations.Test;

public class TC01 extends Capability{
	//scenario to verify covid message present and click on dismiss
			   
	TC01Page tc01p;
	    
		@Test(priority=1)
	    public void verifyMessage() throws InterruptedException {
			tc01p = new TC01Page(driver);
			tc01p.CheckMessage();
	    }
	

}
