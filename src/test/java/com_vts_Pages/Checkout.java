package com_vts_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

	WebDriver driver;

	public Checkout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='termsofservice']")
	WebElement checkbox;
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement Checkout;


	//Reusable Method
	public void clickoncheckbox() {
		checkbox.click();
	}

	public void clickonCheckout() {
		Checkout.click();
	}

}
