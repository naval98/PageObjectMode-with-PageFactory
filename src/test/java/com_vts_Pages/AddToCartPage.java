package com_vts_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {

	WebDriver driver;

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='add-to-cart-button-72']")
	WebElement AddToCart;
	@FindBy(xpath = "//span[normalize-space()='Shopping cart']")
	WebElement shoppingCart;


	//Reusable Method
	public void clickonAddToCart() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(AddToCart))
		.click();
	}

	public void clickonshoppingCart() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(shoppingCart))
		.click();
	}




}
