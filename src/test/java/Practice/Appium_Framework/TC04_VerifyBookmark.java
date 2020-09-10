package Practice.Appium_Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_VerifyBookmark extends Capability{
	//Scenario 4-Go to Search ->life skills-> college admissions->Getting started. Book mark the first page. Go to book marks and verify bookmark is added
	TC04_BookmarkPage tc04;
	String bookmarkname="";
		@Test(priority=1)
	    public void addBookmarkTest() throws InterruptedException {
			tc04 = new TC04_BookmarkPage(driver);
			bookmarkname= tc04.addBookmark();			
			

	}

		@Test(priority=2, dependsOnMethods = "addBookmarkTest")
	    public void verifyBookmarkTest() throws InterruptedException {
			boolean bookmarkPresent= tc04.verifyBookmark(bookmarkname);
			Assert.assertEquals(bookmarkPresent, true);		
			

	}
		
		
}
