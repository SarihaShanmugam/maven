package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExitstgUser extends BaseClass{

	public ExitstgUser() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement paswd;
	
	@FindBy(id="login")
	private WebElement lgin;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPaswd() {
		return paswd;
	}

	public WebElement getLgin() {
		return lgin;
	}


	}
	

