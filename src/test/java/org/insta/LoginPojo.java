package org.insta;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.*;
public class LoginPojo extends BaseClass{

	public LoginPojo() {
		PageFactory.initElements(driver,this);
	
	}
	@FindAll({
		@FindBy(xpath="(//span[@class='_aa4a'])[1]"),
		@FindBy(xpath="//input[@aria-label='Phone number, username, or email']"),
		@FindBy(xpath="//span[text()='Phone number, username, or email']")
		
		
	})
private WebElement usreName;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pswd;
	@FindBy(xpath="//button/div[text()='Log In']")
	private WebElement login;
	public WebElement getUsreName() {
		return usreName;
	}
	public WebElement getPswd() {
		return pswd;
	}
	public WebElement getLogin() {
		return login;
	}
		
}
