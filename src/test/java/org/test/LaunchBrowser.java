package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser extends BaseClass {


	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchChrome();
		launchUrl("http://www.adactin.com/HotelApp/");
		WebElement username = driver.findElement(By.id("username"));
		passValue(username,"sariha1234");
		WebElement pswd = driver.findElement(By.id("password"));
		passValue(pswd,"sariha@4018");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		WebElement location = driver.findElement(By.id("location"));
		selectByVisibleText(location,"Sydney"); 
		WebElement hotels = driver.findElement(By.id("hotels"));
		selectByVisibleText(hotels,"Hotel Creek"); 
		WebElement room_type = driver.findElement(By.id("room_type"));
		selectByVisibleText(room_type,"Standard"); 
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		selectByVisibleText(room_nos,"1 - One"); 
		WebElement datepick_in = driver.findElement(By.id("datepick_in"));
		datepick_in.clear();
		passValue(datepick_in,"01/05/2023");
		WebElement datepick_out = driver.findElement(By.id("datepick_out"));
		datepick_out.clear();
		passValue(datepick_out,"04/05/2023");
		WebElement adult_room = driver.findElement(By.id("adult_room"));
		selectByVisibleText(adult_room,"1 - One"); 
		WebElement child_room = driver.findElement(By.id("child_room"));
		selectByVisibleText(child_room,"1 - One"); 
		WebElement Submit = driver.findElement(By.id("Submit"));
		Submit.click();
		WebElement radiobutton_0 = driver.findElement(By.id("radiobutton_0"));
		radiobutton_0.click();
		WebElement cnt= driver.findElement(By.id("continue"));
		cnt.click();
		File f= new File("F:\\workspace-new\\MavenDemo\\XL sheet\\xl sheet1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		book = new XSSFWorkbook(fis);
		WebElement first_name = driver.findElement(By.id("first_name"));
		passValue(first_name,readFromExcel("Sheet2", 1, 0));
		WebElement last_name = driver.findElement(By.id("last_name"));
		passValue(last_name,readFromExcel("Sheet2", 1, 1));
		WebElement address = driver.findElement(By.id("address"));	
		passValue(address,readFromExcel("Sheet2", 1, 2));
		WebElement cc_num = driver.findElement(By.id("cc_num"));
		passValue(cc_num,readFromExcel("Sheet2", 1, 3));
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		selectByVisibleText(cc_type,"American Express"); 
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		selectByVisibleText(cc_exp_month,"December"); 
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		selectByVisibleText(cc_exp_year,"2022"); 
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		passValue(cc_cvv,readFromExcel("Sheet2", 1, 4));		
		WebElement book_now= driver.findElement(By.id("book_now"));
		book_now.click();
		


		WebElement order_no= driver.findElement(By.id("order_no"));			
		System.out.println(order_no.getAttribute("value"));
		writeToExcel("Sheet2", 1, 5, order_no.getAttribute("value"));
		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);
		
	}
	}

	


