package classLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class EnterKeysActions {

	WebDriver driver;

	public EnterKeysActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterKeys(String screenName, String elementName, String inputText) {

		GetElements getElm = new GetElements(driver);
		
		try {
			switch(screenName) {
			case "loginScreen":

				switch(elementName) {
				case "emailId":
					WebElement emlId = getElm.getElementLoginScreen("emailId");
					emlId.sendKeys(inputText);
					ValidateEnteredKeys(emlId,inputText,"data-initial-value");
					break;
				case "password":
					WebElement pwdFld = getElm.getElementLoginScreen("password");
					pwdFld.sendKeys(inputText);
					ValidateEnteredKeys(pwdFld,inputText,"data-initial-value");
					break;
				default:
					System.out.println("No element name matched in "+ screenName + " for enter keys action");
					break;
				}
				break;
				
			case "inboxScreen":

				switch(elementName) {
				case "emailRecipients":
					WebElement emlRcp = getElm.getElementInboxScreen("emailRecipients");
					emlRcp.sendKeys(inputText);
					break;
				case "subjectLine":
					WebElement sbjLne = getElm.getElementInboxScreen("subjectLine");
					sbjLne.sendKeys(inputText);
					break;
				case "emailBody":
					WebElement emlBdy = getElm.getElementInboxScreen("emailBody");
					emlBdy.sendKeys(inputText);
					System.out.println("Email Body entered");
					try {
						Thread.sleep(5000);
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				default:
					System.out.println("No element name matched in "+ screenName + " for enter keys action");
					break;
				}
				break;

			default:
				System.out.println("No screen name matched for enter keys action");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
	
	public void ValidateEnteredKeys(WebElement elementId, String expectedValue, String attributeName) {
		
		try {
			Thread.sleep(2000);
			Assert.assertEquals(elementId.getAttribute(attributeName),expectedValue);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void ValidateEnteredKeys(WebElement elementId, String expectedValue) {
		
		try {
			Thread.sleep(2000);
			Assert.assertEquals(elementId.getText(),expectedValue);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
