package org.testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static final String Duration = null;
	public static WebDriver driver;
	public static Actions a;
	public static Alert b;
	public static Robot r;
	private static int id;
	private static JavascriptExecutor js;
	public static File f;
	public static FileInputStream read;
	public static Workbook book; 
	public static String value; 
	
	public static void launchChrome() {	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	
	public static void passValue(WebElement ele,String val) {
		ele.sendKeys(val);
		
}
	public static void contxtClick(WebElement ele) {
		a = new Actions(driver);
		a.contextClick(ele).perform();	
	}
	
	public static void moveToele(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();;
		
}
	public static void draganddrop(WebElement ele) {
		a = new Actions(driver);
		a.dragAndDrop(ele, ele).perform();;
	
		
}
	public static void doubleclick(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public static void accept(WebElement ele) {
	  b = driver.switchTo().alert();
	 b.accept();
}
	public static void dissmiss(WebElement ele) {
		  b = driver.switchTo().alert();
		 b.dismiss();
	}
	public static void sendKeys(WebElement ele,String val) {
		  b = driver.switchTo().alert();
		 b.sendKeys(val);
	}
	
	public static void keydown() throws AWTException {
	 r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}
	public static void keyenter() throws AWTException {
		 r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void keytab() throws AWTException {
		 r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public static void keycontrol() throws AWTException {
		 r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void framestring(String val) {
		driver.switchTo().frame(val);
	}
	public static void framewebelement(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	public static void frameindex(int val) {
		driver.switchTo().frame(val);
	}
		
	public static void click(WebElement ele) {
		ele.click();
	}
	public static void gotoparent() {
		String parentid = driver.getWindowHandle();
		driver.switchTo().window(parentid);
	}
	public static void gotochild() {
		Set<String> allwin = driver.getWindowHandles();
		List<String> li = new ArrayList();
		li.addAll(li);
	String childid =li.get(id);
	
		driver.switchTo().window(childid);
		}
	public static void indexbaseselect(WebElement ele,int val) {
	
	Select s = new Select(ele);
	s.selectByIndex(val);
	
}
	public static void selectByVisibleText(WebElement ele,String val) {
		
		Select s = new Select(ele);
		s.selectByVisibleText(val);
		
	}
	public static void selectByValue(WebElement ele,String val) {
		
		Select s = new Select(ele);
		s.selectByValue(val);
		
	}
public static void smulitple(WebElement ele,String val) {
		
		Select s = new Select(ele);
		s.isMultiple();
		
	}
public static void getoptions(WebElement ele,String val) {
	
	Select s = new Select(ele);
	s.getOptions();
	
}
public static void getallseleted(WebElement ele,String val) {
	
	Select s = new Select(ele);
	s.getAllSelectedOptions();
	
}
public static void getfirstselect(WebElement ele,String val) {
	
	Select s = new Select(ele);
	s.getFirstSelectedOption();
	
}
public static void delectbyindex(WebElement ele,int val) {
	
	Select s = new Select(ele);
	s.deselectByIndex(val);

	
}
public static void delectbyvisibletext(WebElement ele,String val) {
	
	Select s = new Select(ele);
	s.deselectByVisibleText(val);
	
}
public static void delectbyvalue(WebElement ele,String val) {
	
	Select s = new Select(ele);
	s.deselectByValue(val);
	
}

public static void screenshot(String name) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("F:\\workspace-new\\MavenDemo\\image\\"+name+".png");
	FileUtils.copyFile(temp, dest);
		
}
public static void jssendKeys(String data,WebElement ele) {
	js=(JavascriptExecutor)driver;
	js.executeScript("argument[0].setAttribute('value','"+data+"')", null);
}
public static void jsClick(WebElement ele) {
	js=(JavascriptExecutor)driver;
	js.executeScript("argument[0].click()",null);
}
public static void jsgetAttribute(String data,WebElement ele) {
	js=(JavascriptExecutor)driver;
	js.executeScript("return argument[0].getAttribute('value')");
}

public static void imlicityWaits(int sec) {
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	
}
public static void WebDriverWait(int val,WebElement ele) {
	WebDriverWait wait = new WebDriverWait(driver, val);
	
}
@SuppressWarnings("deprecation")
public static void FluentWait(int sec,WebElement ele) {
	Wait wait = new FluentWait<WebDriver>(driver)
			.withTimeout(sec, TimeUnit.SECONDS)
			.pollingEvery(sec, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	
}
public static String readFromExcel(String sheetName,int rw,int cel) throws IOException {
	
Sheet sh1 = book.getSheet(sheetName);
Row row = sh1.getRow(rw);
Cell cell = row.getCell(cel);
String value = cell.getStringCellValue();
return value;
}

 
public static String getCellType(String sheetName,int row,int cell,String sh1) throws IOException {
	
	
Sheet sh11 = book.getSheet(sheetName);
Row row1 = sh11.getRow(row);
Cell cell1 = row1.getCell(cell);
int ct = cell1.getCellType();

if(ct==1) {	
String value = cell1.getStringCellValue();
System.out.println(value);
}
else if(DateUtil.isCellDateFormatted(cell1)) {
	Date dd = cell1.getDateCellValue();
	SimpleDateFormat sdf= new SimpleDateFormat();
	String value = sdf.format(dd);
	System.out.println(value);
	}
else {
	double nv = cell1.getNumericCellValue();
	long l=(long) nv;
	value = String.valueOf(ct);
	
}
	return value;

}

public static void writeToExcel(String sheetName,int rw,int cel, String cellValue) throws IOException {	
Sheet sh1 = book.getSheet(sheetName);
Row row = sh1.getRow(rw);
Cell cell = row.createCell(cel);
cell.setCellValue(cellValue);
}


}




