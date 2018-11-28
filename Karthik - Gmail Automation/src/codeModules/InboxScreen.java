package codeModules;

import org.openqa.selenium.WebDriver;

import classLibrary.ClickActions;
import classLibrary.EnterKeysActions;

public class InboxScreen {

	WebDriver driver;
	
	public InboxScreen(WebDriver driver) {
		this.driver = driver;
	}
	
	public void InboxScreenActions() {
		
		ClickActions clkAct  = new ClickActions(driver);
		EnterKeysActions entKey = new EnterKeysActions(driver);		
		
		//Inbox screen actions 3
		clkAct.Click("inboxScreen", "composeButton");
		clkAct.Click("inboxScreen", "emailRecipients");
		entKey.EnterKeys("inboxScreen", "emailRecipients", "karthik.ktp1988@gmail.com");
		entKey.EnterKeys("inboxScreen", "subjectLine", "Test Automation Email");
		entKey.EnterKeys("inboxScreen", "emailBody", "Hi,\r\n" + 
				"\r\n" + 
				"This is sample text for email.\r\n" + 
				"\r\n" + 
				"Thanks,\r\n" + 
				"Karthik");
		clkAct.Click("inboxScreen", "emailSend");
	}
}
