package classLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import objectRepo.GmailRepo;

public class GetElements {
	
	WebDriver driver;
	GmailRepo gmlRepo = new GmailRepo();

	public GetElements(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement getElementLoginScreen(String elementName) {
		
		
		
		switch(elementName) {
		case "emailId":
			WebElement emlId = driver.findElement(gmlRepo.emailId);
			return emlId;
		case "nextButton":
			WebElement nxtBtn = driver.findElement(gmlRepo.nextButton);
			return nxtBtn;
		case "password":
			WebElement pwdFld = driver.findElement(gmlRepo.password);
			return pwdFld;
		case "showpassword":
			WebElement shwPwdBtn = driver.findElement(gmlRepo.showPassword);
			return shwPwdBtn;
		case "pwdNextButton":
			WebElement pwdNextBtn = driver.findElement(gmlRepo.pwdNextButton);
			return pwdNextBtn;
		default:
			System.out.println("No element name matched for Login screen");
			return null;
		}
				
	}
	
	public WebElement getElementInboxScreen(String elementName) {
				
		switch(elementName) {
		case "composeButton":
			WebElement cmpBtnId = driver.findElement(gmlRepo.composeButton);
			return cmpBtnId;
		case "newMessage":
			WebElement newMsg = driver.findElement(gmlRepo.newMessage);
			return newMsg;
		case "emailRecipients":
			WebElement emlRcp = driver.findElement(gmlRepo.emailRecipients);
			return emlRcp;
		case "subjectLine":
			WebElement sbjLne = driver.findElement(gmlRepo.subjectLine);
			return sbjLne;
		case "emailBody":
			WebElement emlBdy = driver.findElement(gmlRepo.emailBody);
			return emlBdy;
		case "emailSend":
			WebElement emlSnd = driver.findElement(gmlRepo.emailSend);
			return emlSnd;
		default:
			System.out.println("No element name matched for Inbox screen");
			return null;
		}
				
	}
}
