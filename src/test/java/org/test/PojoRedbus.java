package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoRedbus extends BaseClass{
	PojoRedbus() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Login/ Sign Up']")
	private WebElement login;
	@FindBy(id="mobileNoInp")
	private WebElement mobNo;
	@FindBy(id="recaptcha-anchor-label")
	private WebElement captcha;
	@FindBy(id="otp-container")
	private WebElement generateOtp;
	
	
}
