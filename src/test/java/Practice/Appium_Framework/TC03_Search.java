package Practice.Appium_Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_Search extends Capability{
	//Scenario 3- Go to search-> type computers-> click on what is computer-> verify topic displayed
	TC03_SearchPage tc03p;
	@Test(priority=1)
    public void verifySearch() throws InterruptedException {
		tc03p = new TC03_SearchPage(driver);
		boolean SearchResults= tc03p.searchCourse();
		Assert.assertEquals(SearchResults, true);

}
}
