package org.testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass{

	Pojo() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
private WebElement emailText;
@FindBy(id="pass")
private WebElement password;
@FindBy(name="login")
private WebElement login;
public WebElement getEmailText() {
	return emailText;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
}
