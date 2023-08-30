package org.insta;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class InstaLogin extends BaseClass{

	public static void main(String[] args) {
		launchChrome();
		launchUrl("https://www.instagram.com/");
		//PageFactory.initElements(driver, this);
		LoginPojo p=new LoginPojo();
		WebElement usreName = p.getUsreName();
		passValue(usreName, "sarihakkn@gmail.com");
		WebElement pswd = p.getPswd();
		passValue(pswd, "1234");
		WebElement login = p.getLogin();
		login.click();

	}

}
