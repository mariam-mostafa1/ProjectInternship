package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.basePage;
import pages.cartPage;
import pages.checkoutPage;
import pages.homePage;
import pages.loginPage;
import pages.productPage;

import org.openqa.selenium.WebDriver;



public class baseTest {
	  WebDriver driver;
	    basePage base;
	    homePage home;
	    loginPage login;
	    productPage product;
	    cartPage cart ;
	    checkoutPage checkout;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();               
        driver.manage().window().maximize();
        driver.get("https://cartlow.com/uae/en");         
        home = new homePage(driver);               
        login = new loginPage(driver);
        product = new productPage(driver);
        base = new basePage(driver);
        cart = new cartPage(driver);
        checkout = new checkoutPage(driver);


    }
    
  @AfterClass
  public void teardown() throws InterruptedException {
	  Thread.sleep(3000); 
      driver.quit();                             
  }
   
}



