package org.test;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibleCheck extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement createAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAccount.click();
		
		Thread.sleep(3000);
		WebElement femaleBtn = driver.findElement(By.name("//input[@name='sex']"));
		femaleBtn.click();
		
		//WebElement btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		//btn.click();
		/*boolean d = btn.isDisplayed();
		System.out.println(d);
		
		boolean s = btn.isSelected();
		System.out.println(s);*/
		
		WebElement btn = driver.findElement(By.id("u_2_4_MY"));
		btn.click();
	}

}
