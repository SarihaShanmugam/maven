package org.greens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class HomePojo extends BaseClass{
	
	public WebElement getHome() {
		return home;
	}
	public WebElement getSoftwaretraining() {
		return softwaretraining;
	}
	public WebElement getCertification() {
		return certification;
	}
	public WebElement getCourse() {
		return course;
	}
	public WebElement getOnlinecourse() {
		return onlinecourse;
	}
	public WebElement getContact() {
		return contact;
	}
	HomePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='HOME']")
	private WebElement home;
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement softwaretraining;
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certification;
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement course;
	@FindBy(xpath="//a[text()='Online Courses']")
	private WebElement onlinecourse;
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement contact;


}
