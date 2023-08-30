package org.test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Styleee extends BaseClass {

	public static void main(String[] args) {

		launchChrome();
		launchUrl("https:\\www.facebook.com");
		driver.manage().window().maximize();

		WebElement emailtext = driver.findElement(By.id("email"));
		passValue(emailtext, "sariha@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border:4px solid black; background:blue')", emailtext);

		WebElement password = driver.findElement(By.id("pass"));
		passValue(password, "1234");
		js.executeScript("arguments[0].setAttribute('style','background:green; font-size:40px; text-align:right')", password);


	}
}
