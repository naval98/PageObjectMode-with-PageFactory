package com_vts_Pages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//ul[@class='top-menu']//a[normalize-space()='Computers']")
	WebElement computerpage;
	@FindBy(xpath = "//img[@title='Show products in category Desktops']")
	WebElement Desktop;
	@FindBy(xpath = "//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	WebElement addtocart;

	//Reusable Method
	public void clickoncomputerpage() {
		computerpage.click();
	}

	public void clickonDesktop() {
		Desktop.click();
	}

	public void clickonaddtocart() {
		addtocart.click();

	}



}
