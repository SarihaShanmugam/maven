package org.greens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class CertifPojo extends BaseClass{
	public WebElement getCertification() {
		return certification;
	}

	CertifPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certification;
	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement selenium;
	@FindBy(xpath="//strong[text()='Selenium Training in Chennai']")
	private WebElement tittle;
	@FindBy(xpath="//p[text()='Greens Technology, Rated As ']")
	private WebElement printline1;
	@FindBy(xpath="//strong[text()='Selenium training in Chennai']")
	private WebElement printline2;
	
	//java training
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement course;
	@FindBy(xpath="//a[text()='Java Training ']")
	public WebElement javatrainig;
	@FindBy(xpath="//a[text()='Core Java Training']")
	public WebElement coreJavaTrainig;
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement review;
	@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[13]")
	private WebElement emailprint;
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement carrier;
	
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement testimonial;
	@FindBy(xpath="//a[text()='+91 8939 915 577 ']")
	private WebElement phnno;
	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement contact;
	@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
	private WebElement branch;
	@FindBy(xpath="//p[text()='Copyright © 2023 Greens Technology. All rights reserved.']")
	private WebElement copyrigh;
	
	public WebElement getContact() {
		return contact;
	}

	public WebElement getBranch() {
		return branch;
	}

	public WebElement getCopyrigh() {
		return copyrigh;
	}

	public WebElement getEmailprint() {
		return emailprint;
	}

	public WebElement getTestimonial() {
		return testimonial;
	}

	public WebElement getPhnno() {
		return phnno;
	}

	public void setEmailprint(WebElement emailprint) {
		this.emailprint = emailprint;
	}

	public WebElement getCarrier() {
		return carrier;
	}

	public WebElement getReview() {
		return review;
	}

	public void setReview(WebElement review) {
		this.review = review;
	}

	public WebElement getCoreJavaTrainig() {
		return coreJavaTrainig;
	}

	public WebElement getCourse() {
		return course;
	}

	public WebElement getJavatrainig() {
		return javatrainig;
	}

	public WebElement getSelenium() {
		return selenium;
	}
	public WebElement getTittle() {
		return tittle;
	}
	public WebElement getPrintline1() {
		return printline1;
	}
	public WebElement getPrintline2() {
		return printline2;
	}
	public WebElement getPrintTillte() {
		return printTillte;
	}

	@FindBy(xpath="//h2[text()='Selenium Training in Chennai']")
	private WebElement printTillte;
}

