package Automation.php;

import org.testng.annotations.Test;

public class LogInTest 
{
	

	@Test
	public static void Login() throws Exception 
	{
		Launch l = new Launch();
		BasicCommands bc= new BasicCommands();
		//Launch l =new Launch();
		//HomePage h1= new HomePage();
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
		//bc.signUp();
		l.driver.get(l.prop.getProperty("url"));
		HomePage h= new HomePage();
		h.LogIn();
		LogIn l1= new LogIn();
		l1.loginEmail().sendKeys(l.prop.getProperty("Email"));
		l1.loginPassword().sendKeys(l.prop.getProperty("password"));
		l1.loginButton().click();
		
	
	}	


}
