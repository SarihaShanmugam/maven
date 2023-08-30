package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 12");
		Thread.sleep(3000);
		List<WebElement> serachList = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));
		System.out.println("Size --"+serachList.size());
		for (WebElement webElement : serachList) {
			System.out.println(webElement.getText());
			
		}
	}
	

}
