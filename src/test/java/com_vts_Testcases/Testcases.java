package com_vts_Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com_vts_Pages.AddToCartPage;
import com_vts_Pages.Checkout;
import com_vts_Pages.Login;
import com_vts_Pages.Logout;
import com_vts_Pages.ProductPage;
import com_vts_Pages.Register;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases {

	private WebDriver driver;

	@BeforeClass
	public void Setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/computers");

		driver.manage().window().maximize();


	}
	@Test
	public void clickoncomputerdetailspage() {

		ProductPage product = new ProductPage(driver);
		product.clickoncomputerpage();
		product.clickonDesktop();
		product.clickonaddtocart();

		AddToCartPage cart = new AddToCartPage(driver);
		cart.clickonAddToCart();
		cart.clickonshoppingCart();

		Checkout checkout = new Checkout(driver);
		checkout.clickoncheckbox();
		checkout.clickonCheckout();

		Register register = new Register(driver);
		register.clickonRegister();
		register.clickonGender();
		register.clickonFirstName();
		register.clickonLastName();
		register.clickonEmail();
		register.clickonpassword();
		register.clickonconfirmpassword();
		register.clickonregisterbtn();
		register.clickoncontinuebtn();

		Logout logout = new Logout(driver);
		logout.clickonLogout();

		Login login = new Login(driver);
		login.clickonLogin();
		login.clickonEmail();
		login.clickonpassword();






	}
	@AfterClass
	public void TearDown() {
		driver.quit();

	}
}
