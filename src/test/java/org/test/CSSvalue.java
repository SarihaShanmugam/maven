package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSSvalue extends BaseClass{

	public static void main(String[] args) {
		launchChrome();
		launchUrl("https:\\www.facebook.com");
		driver.manage().window().maximize();
		WebElement pswd = driver.findElement(By.name("pass"));
		System.out.println(pswd.getCssValue("background-color"));
		System.out.println(pswd.getCssValue("font-size"));
		System.out.println(pswd.getCssValue("text-align"));
		System.out.println(pswd.getCssValue("font"));
	}

}
