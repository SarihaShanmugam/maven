package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Practice extends BaseClass{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
	
		launchChrome();
		launchUrl("http://www.adactin.com/HotelApp/");
		WebElement reg = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		reg.click();
		Robot r =new Robot();
		Actions a =new Actions(driver);

		WebElement userName = driver.findElement(By.id("username"));

		a.keyDown(userName, Keys.SHIFT).perform();
		userName.sendKeys("sariha");
		a.keyUp(userName, Keys.SHIFT).perform();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("1234");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.FILE);
		File f= new File("F:\\workspace-new\\MavenDemo\\image\\adactin.png");
		FileUtils.copyFile(f, f);
		

		
}
}