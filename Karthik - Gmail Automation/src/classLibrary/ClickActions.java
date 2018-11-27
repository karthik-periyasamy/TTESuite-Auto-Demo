package classLibrary;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickActions {

	WebDriver driver;

	public ClickActions(WebDriver driver) {
		this.driver = driver;
	}

	public void Click(String screenName, String elementName) {

		GetElements getElm = new GetElements(driver);

		switch(screenName) {
		case "loginScreen":

			switch(elementName) {
			case "nextButton":
				WebElement nxtBtn = getElm.getElementLoginScreen("nextButton");
				nxtBtn.click();
				break;
			case "showpassword":
				WebElement shwPwdBtn = getElm.getElementLoginScreen("showpassword");
				shwPwdBtn.click();
				break;
			case "pwdNextButton":
				WebElement pwdNextBtn = getElm.getElementLoginScreen("pwdNextButton");
				pwdNextBtn.click();
				break;
			default:
				System.out.println("No element name matched in "+ screenName + " for click action");
				break;
			}
			break;

		case "inboxScreen":

			switch(elementName) {
			case "composeButton":
				WebElement cmpEmlBtn = getElm.getElementInboxScreen("composeButton");
				cmpEmlBtn.click();
				WebElement newMsg = getElm.getElementInboxScreen("newMessage");
				ValidateExists(newMsg,"New Message");
				break;
			case "emailRecipients":
				WebElement emlRcp = getElm.getElementInboxScreen("emailRecipients");
				emlRcp.click();
				break;
			case "subjectLine":
				WebElement sbjLne = getElm.getElementInboxScreen("subjectLine");
				sbjLne.click();
				break;
			case "emailBody":
				WebElement emlBdy = getElm.getElementInboxScreen("emailBody");
				emlBdy.click();
				break;
			case "emailSend":
				WebElement emlSnd = getElm.getElementInboxScreen("emailSend");
				emlSnd.click();
				break;
			default:
				System.out.println("No element name matched in "+ screenName + " for click action");
				break;
			}
			break;

		default:
			System.out.println("No screen name matched for click action");
			break;
		}

	}
	
	public void ValidateExists(WebElement elementId, String containsMessage) {
		
		try {
			Thread.sleep(3000);
			Assert.assertTrue("New Message window not displayed",elementId.getText().contains(containsMessage));
			System.out.println(elementId.getText() + " verified");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
