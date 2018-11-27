package objectRepo;

import org.openqa.selenium.By;

public class GmailRepo {
	
	//Repository for Login Screen
	public By emailId = By.xpath("//*[@id='identifierId']");
	public By nextButton = By.xpath("//*[@id=\"identifierNext\"]/content/span");
	public By password = By.xpath("//*[@id=\"password\"]//input");
	public By showPassword = By.xpath("//*[@id='password']//*[@role='button']");
	public By pwdNextButton = By.xpath("//*[@id=\"passwordNext\"]/content/span");
	
	//Repository for Inbox Screen
	public By composeButton = By.xpath("//*[@id=':kc']//*[@role='button']");
	public By newMessage = By.xpath("//*[@class='Hp']//*[contains(text(),'New Message')]");
	public By emailRecipients = By.xpath("//*[@class='vO' and @aria-label='To']");
	public By subjectLine = By.xpath("//input[@name='subjectbox']");
	public By emailBody = By.xpath("//*[@class=\"Am Al editable LW-avf\" and @aria-label='Message Body']");
	public By emailSend = By.xpath("//*[contains(text(),'Send')]");
}