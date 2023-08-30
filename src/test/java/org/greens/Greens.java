package org.greens;

import org.openqa.selenium.WebElement;
import org.test.BaseClass;

public class Greens extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		launchUrl("http://www.greenstechnologys.com/");
		HomePojo h=new HomePojo();
		WebElement softwaretraining = h.getSoftwaretraining();
		String text = softwaretraining.getText();
		System.out.println(text);
		CertifPojo c=new CertifPojo();
		c.getCertification().click();
		c.getSelenium().click();
		
	WebElement printline1 = c.getPrintline1();
		String text2 = printline1.getText();
		System.out.println(text2);
		WebElement printline2 = c.getPrintline2();
		String text3 = printline2.getText();
		System.out.println(text3);
		WebElement printTillte = c.getPrintTillte();
		String text4 = printTillte.getText();
		System.out.println(text4);
		
		WebElement course = c.getCourse();
		c.moveToele(course);
		
		WebElement javatrainig = c.getJavatrainig();
		c.moveToele(javatrainig);
		WebElement coreJavaTrainig = c.getCoreJavaTrainig();
		c.moveToele(coreJavaTrainig);
		coreJavaTrainig.click();
		WebElement review = c.getReview();
		String text5 = review.getText();
		System.out.println(text5);
		c.getCarrier().click();
		WebElement emailprint = c.getEmailprint();
		String text6 = emailprint.getText();
		System.out.println(text6);
	
		c.getCertification().click();
		WebElement testimonial = c.getTestimonial();
		testimonial.click();
		WebElement phnno = c.getPhnno();
		String text7 = phnno.getText();
		System.out.println(text7);
		
		c.getContact().click();
		WebElement branch = c.getBranch();
		String text8 = branch.getText();
		System.out.println(text8);
		
		
		WebElement copyrigh = c.getCopyrigh();
		String text9 = copyrigh.getText();
		System.out.println(text9);
		
	}

}
