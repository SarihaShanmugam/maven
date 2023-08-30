package org.test;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNg extends BaseClass{
public static WebDriver driver;
	
	@Test
	private void launchC() {
		launchChrome();
		launchUrl("https://www.facebook.com/");

	}
		
	private void getTittle() {
		String currenttittle = driver.getTitle();
		System.out.println(currenttittle);

	}
	
@Test
	private void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);	

	}
private void valuePassing() {
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("sariha");
	
	WebElement passwrd = driver.findElement(By.id("pass"));
	passwrd.sendKeys("1234");
	
	WebElement longins = driver.findElement(By.name("login"));
	longins.click();


	
	}

}
