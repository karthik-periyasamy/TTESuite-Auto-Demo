package ChromeTestPackage;

import org.openqa.selenium.WebDriver;

import classLibrary.SetupDriver;
import codeModules.InboxScreen;
import codeModules.LoginScreen;

public class GmailLogin {
	
	public static void main(String[] args) {
		
		try {
			
		SetupDriver drv = new SetupDriver();
		WebDriver driver = drv.setDriver();
		
		driver.get("http://gmail.com/");
		
		LoginScreen lgnScn = new LoginScreen(driver);
		lgnScn.LoginScreenActions();
		
		InboxScreen inbScn = new InboxScreen(driver);
		inbScn.InboxScreenActions();
		
		//driver.close();
		
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
