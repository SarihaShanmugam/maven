package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class AdactinBook extends BaseClass{


	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchChrome();
		launchUrl("http://www.adactin.com/HotelApp/");
		ExitstgUser Exit=new ExitstgUser();
		WebElement userName = Exit.getUserName();
		userName.sendKeys("sariha1234");
		WebElement paswd = Exit.getPaswd();
		paswd.sendKeys("sariha@4018");
		WebElement lgin = Exit.getLgin();
		lgin.click();
		
		SearchHotel search= new SearchHotel();
		WebElement lcation = search.getLcation();
		selectByVisibleText(lcation,"Sydney"); 
		WebElement hotels = search.getHotels();
		selectByVisibleText(hotels,"Hotel Creek"); 
		WebElement room_type = search.getRoom_type();
		selectByVisibleText(room_type,"Standard"); 
		WebElement room_nos = search.getRoom_nos();
		selectByVisibleText(room_nos,"1 - One"); 
		WebElement datepick_in = search.getDatepick_in();
		datepick_in.clear();
		datepick_in.sendKeys("01/05/2023");
		WebElement datepick_out = search.getDatepick_out();
		 datepick_out.clear();
		 datepick_out.sendKeys("09/05/2023");
		 WebElement adult_room = search.getAdult_room();
		 selectByVisibleText(adult_room,"1 - One"); 
		 WebElement child_room = search.getChild_room();
			selectByVisibleText(child_room,"1 - One"); 
			WebElement submit = search.getSubmit();
			submit.click();
			
			SelectHotel SlecttHotel=new SelectHotel();
			WebElement radiobutton_0 = SlecttHotel.getRadiobutton_0();
			radiobutton_0.click();
			WebElement cntnue = SlecttHotel.getCntnue();
			cntnue.click();
			
			BookHotel bkHotel=new BookHotel();
			File f= new File("F:\\workspace-new\\MavenDemo\\XL sheet\\xl sheet1.xlsx");
			FileInputStream fis = new FileInputStream(f);
			book = new XSSFWorkbook(fis);
			
			WebElement firstname = bkHotel.getFirstname();
			passValue(firstname,readFromExcel("Sheet2", 1, 0));
			WebElement lastname = bkHotel.getLastname();
			passValue(lastname,readFromExcel("Sheet2", 1, 1));
			WebElement address = bkHotel.getAddress();
			passValue(address,readFromExcel("Sheet2", 1, 2));
			WebElement cc_num = bkHotel.getCc_num();
			passValue(cc_num,readFromExcel("Sheet2", 1, 3));
			WebElement cc_type = bkHotel.getCc_type();
			selectByVisibleText(cc_type,"American Express"); 
			
			WebElement cc_exp_month = bkHotel.getCc_exp_month();
			selectByVisibleText(cc_exp_month,"December"); 
			WebElement cc_exp_year = bkHotel.getCc_exp_year();
			selectByVisibleText(cc_exp_year,"2022");
			WebElement cc_cvv = bkHotel.getCc_cvv();
			passValue(cc_cvv,readFromExcel("Sheet2", 1, 4));
			WebElement book_now = bkHotel.getBook_now();
			book_now.click();
			Thread.sleep(6000);
			BookConfirm cnfrm=new BookConfirm();
			WebElement order_no = cnfrm.getOrder_no();
			System.out.println(order_no.getAttribute("value"));
		
			writeToExcel("Sheet2", 1, 5, order_no.getAttribute("value"));
			FileOutputStream fos = new FileOutputStream(f);
			book.write(fos);
	}

}

