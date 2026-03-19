package com_vts_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Log in']")
	WebElement Login;
	@FindBy(xpath = "//input[@id='Email']")
	WebElement Email;
	@FindBy(xpath= "//input[@id='Password']")
	WebElement Password;


	public void clickonLogin() {
		Login.click();
	}

	public void clickonEmail() {
		Email.sendKeys("navalsaxena91@gmail.com");
	}
	public void clickonpassword() {
		Password.sendKeys("navalsax123");
	}

}
