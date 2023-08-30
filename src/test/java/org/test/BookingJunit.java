package org.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class BookingJunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BaseClass.launchChrome();
	}

	@Test
	public void testLaunchURL() {
		BaseClass.launchUrl("http://www.adactin.com/HotelApp/");
	}
	@Test
	public void testLogin() {
		ExitstgUser Exit=new ExitstgUser();
		WebElement userName = Exit.getUserName();
		userName.sendKeys("sariha1234");
		WebElement paswd = Exit.getPaswd();
		paswd.sendKeys("sariha@4018");
		WebElement lgin = Exit.getLgin();
		lgin.click();
	}

}
