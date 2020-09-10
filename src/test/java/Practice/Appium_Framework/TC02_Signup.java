package Practice.Appium_Framework;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_Signup extends Capability{
	//Scenario to click on signup and sign up with google id
	TC02_SignupPage tc02p;
	@Test(priority=1)
    public void signUpwithGoogle() throws InterruptedException {
		tc02p = new TC02_SignupPage(driver);
		tc02p.signUp();
    }
	//verify the username shown in the app is the same as the user logged in
	@Test(priority=1, dependsOnMethods ="signUpwithGoogle" )
	public void verifyLogin() throws InterruptedException {
		boolean result= tc02p.verifyLogin();
		Assert.assertEquals(result, true);
	}

}
