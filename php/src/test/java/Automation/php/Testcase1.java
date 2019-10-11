package Automation.php;
import org.testng.annotations.Test;
public class Testcase1 extends BasicCommands
{
	//User registration
		@Test
		public static void userRegistration() throws Exception 
		{
			Launch l = new Launch();
			BasicCommands bc= new BasicCommands();
			l.launchPage();
			l.driver.get(l.prop.getProperty("url"));
			bc.signUp();
			
			Resource r1= new Resource();
			r1.FirstName().sendKeys(l.prop.getProperty("FirstName"));
			r1.LastName().sendKeys(l.prop.getProperty("LastName"));
			r1.Mobile().sendKeys(l.prop.getProperty("Mobile"));
			r1.Email().sendKeys(l.prop.getProperty("Email"));
			r1.Password().sendKeys(l.prop.getProperty("password"));
			r1.ConfirmPassword().sendKeys(l.prop.getProperty("ConfirmPassword"));
			r1.SignUp();
		}	

}
