package org.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitDemo extends BaseClass {
	@BeforeClass
	public static void launchChromee() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

}
	@Test
	public void geturl() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("url starts with", currentUrl.contains("facebook"));
		System.out.println(currentUrl);
	}
	@Test
	public void gettittle() {
		String currenttittle = driver.getTitle();
		Assert.assertTrue(false);
		System.out.println(currenttittle);
	}
	@Test
	public void fbLongin() {
		Date d=new Date();
		System.out.println(d);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sariha");
		Assert.assertEquals("my email id is", "sariha",email.getAttribute("value") );
		WebElement passwrd = driver.findElement(By.id("pass"));
		passwrd.sendKeys("1234");
		Assert.assertEquals("my password id is", "1234",passwrd.getAttribute("value") );
		Assert.assertTrue(true);
		WebElement longins = driver.findElement(By.name("login"));
		longins.click();
		Date e=new Date();
		System.out.println(e);
} }

