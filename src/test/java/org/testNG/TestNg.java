package org.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TestNg extends BaseClass
{

	public static WebDriver driver;
	public Pojo p;

		private void launching() {
		launchChrome();
		launchUrl("https://www.facebook.com/");
	
	}
	@Test
	private void passingData() {
		 p=new Pojo();
		WebElement emailText = p.getEmailText();
		emailText.sendKeys("sarihakkn@gmail.com");
		WebElement password = p.getPassword();
		password.sendKeys("1234");
		WebElement login = p.getLogin();
		login.click();
		}
@Test
	private void curntUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
@Test
	private void tittle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
}
