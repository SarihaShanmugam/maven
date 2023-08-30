import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robottt extends BaseClass{

	public static void main(String[] args) {
		
		launchChrome();
		launchUrl("https://www.facebook.com");
		//WebDriverManager.chromedriver().setup();
		//driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement emailtext = driver.findElement(By.id("email"));
		Actions a =new Actions(driver);
		a.keyDown(emailtext,Keys.SHIFT).perform();
		a.sendKeys(emailtext, "sariha@gmail.com").perform();
		a.keyUp(emailtext, Keys.SHIFT).perform();
	}

}
