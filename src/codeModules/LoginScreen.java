package codeModules;

import org.openqa.selenium.WebDriver;

import classLibrary.ClickActions;
import classLibrary.EnterKeysActions;

public class LoginScreen {
	
	WebDriver driver;
	
	public LoginScreen(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginScreenActions() {
		
		ClickActions clkAct  = new ClickActions(driver);
		EnterKeysActions entKey = new EnterKeysActions(driver);		
		
		entKey.EnterKeys("loginScreen", "emailId", "karthik.ktp1988@gmail.com");
		clkAct.Click("loginScreen", "nextButton");
		entKey.EnterKeys("loginScreen", "password", "karthi123");
		clkAct.Click("loginScreen", "showpassword");
		clkAct.Click("loginScreen", "pwdNextButton");
	}
}
