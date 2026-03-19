package com_vts_Pages;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	WebDriver driver;

	public Register(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='Register']")
	WebElement Register;
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement Gender;
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement FirstName;
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement LastName;
	@FindBy(xpath = "//input[@id='Email']")
	WebElement Email;
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement confirmpassword;
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement registerbtn;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continuebtn;


	//Reusable Method
	public void clickonRegister() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(Register))
		.click();
	}

	public void clickonGender() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(Gender))
		.click();
	}

	public void clickonFirstName() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(FirstName)).sendKeys("Naval");
	}

	public void clickonLastName() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(LastName)).sendKeys("Saxena");
	}

	public void clickonEmail() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(Email)).sendKeys("navalsaxena91@gmail.com");
	}

	public void clickonpassword() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("navalsax@123");
	}

	public void clickonconfirmpassword() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(confirmpassword)).sendKeys("navalsax@123");
	}

	public void clickonregisterbtn() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(registerbtn)).click();

	}
	public void clickoncontinuebtn() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(continuebtn)).click();

	}



}




