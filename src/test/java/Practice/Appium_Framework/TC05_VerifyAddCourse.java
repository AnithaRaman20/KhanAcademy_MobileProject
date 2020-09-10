package Practice.Appium_Framework;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.Test;

public class TC05_VerifyAddCourse extends Capability {
	//click on get started under mycourse. then scroll down to graduate studies.Tap on to graduate studies.Choose course. Scroll down to compute programming and select the checkbox.Apply assert on computer programming.
	//Click on Done.
	//After that put an assert to validate the same course is coming in home screen.
	TC05_AddCourse tc05;
		String courseName="";
			@Test(priority=1)
		    public void addCourseTest() throws InterruptedException {
				//adds the course
				tc05 = new TC05_AddCourse(driver);
				courseName= tc05.addCourse();	
				

		}
			@Test(priority=1)
		    public void verifyCourseTest() throws InterruptedException {
				//verify course present
				boolean result = tc05.checkCourse();
				Assert.assertEquals(true, result);

		}

}
