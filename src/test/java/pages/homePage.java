package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class homePage extends basePage {

	
	public homePage(WebDriver driver) {
		super(driver);
	}
	
	
	 private By account_link = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[3]") ;	
	 private By sign_in_link = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[3]/div/div/div[2]/a[1]");
	 private By choose_country = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[1]") ;
	 private By INTL =By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[1]/div/div/div/form[3]");
	 private By UAE = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[1]/div/div/div/form[1]");
	
	
	
	private By laptops_link = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[2]/div[2]/ul/li[4]") ;
	private By smartwatches_link = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[2]/div[2]/ul/li[5]") ;
	private By logo = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[1]");
	
	
	
	public void choose_country(By countryXpath ,String countryName) {
	    WebDriverWait wait = new WebDriverWait(base_page_driver, Duration.ofSeconds(15));

	    WebElement countryMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(choose_country));

	    Actions actions = new Actions(base_page_driver);
	    actions.moveToElement(countryMenu).build().perform();

	    if (base_page_driver.findElements(countryXpath).isEmpty()) {
	        String jsHover = "var evObj = document.createEvent('MouseEvents');" +
	                         "evObj.initMouseEvent('mouseover', true, false, window,0,0,0,0,0,false,false,false,false,0,null);" +
	                         "arguments[0].dispatchEvent(evObj);";
	        ((JavascriptExecutor) base_page_driver).executeScript(jsHover, countryMenu);
	    }

	    WebElement intlOption = wait.until(ExpectedConditions.elementToBeClickable(countryXpath));
	    intlOption.click();

	    wait.until(ExpectedConditions.textToBePresentInElementLocated(choose_country, countryName));
	}

	
	
	public void choose_INTL() {
	    WebDriverWait wait = new WebDriverWait(base_page_driver, Duration.ofSeconds(15));

	    WebElement countryMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(choose_country));

	    Actions actions = new Actions(base_page_driver);
	    actions.moveToElement(countryMenu).build().perform();

	    if (base_page_driver.findElements(INTL).isEmpty()) {
	        String jsHover = "var evObj = document.createEvent('MouseEvents');" +
	                         "evObj.initMouseEvent('mouseover', true, false, window,0,0,0,0,0,false,false,false,false,0,null);" +
	                         "arguments[0].dispatchEvent(evObj);";
	        ((JavascriptExecutor) base_page_driver).executeScript(jsHover, countryMenu);
	    }

	    WebElement intlOption = wait.until(ExpectedConditions.elementToBeClickable(INTL));
	    intlOption.click();

	    wait.until(ExpectedConditions.textToBePresentInElementLocated(choose_country, "INTL"));
	}



	
	public void choose_UAE() {
	    WebDriverWait wait = new WebDriverWait(base_page_driver, Duration.ofSeconds(15));

	    WebElement countryMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(choose_country));

	    Actions actions = new Actions(base_page_driver);
	    actions.moveToElement(countryMenu).build().perform();

	    if (base_page_driver.findElements(UAE).isEmpty()) {
	        String jsHover = "var evObj = document.createEvent('MouseEvents');" +
	                         "evObj.initMouseEvent('mouseover', true, false, window,0,0,0,0,0,false,false,false,false,0,null);" +
	                         "arguments[0].dispatchEvent(evObj);";
	        ((JavascriptExecutor) base_page_driver).executeScript(jsHover, countryMenu);
	    }

	    WebElement uaeOption = wait.until(ExpectedConditions.elementToBeClickable(UAE));
	    uaeOption.click();

	    wait.until(ExpectedConditions.textToBePresentInElementLocated(choose_country, "UAE"));
	}


	
	
	public void goToSignIn() {
	    WebDriverWait wait = new WebDriverWait(base_page_driver, Duration.ofSeconds(15));

	
	    WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(account_link));

	
	    Actions actions = new Actions(base_page_driver);
	    actions.moveToElement(accountMenu).build().perform();

	    
	    if (base_page_driver.findElements(sign_in_link).isEmpty()) {
	        String jsHover = "var evObj = document.createEvent('MouseEvents');" +
	                         "evObj.initMouseEvent('mouseover', true, false, window,0,0,0,0,0,false,false,false,false,0,null);" +
	                         "arguments[0].dispatchEvent(evObj);";
	        ((JavascriptExecutor) base_page_driver).executeScript(jsHover, accountMenu);
	    }

	   
	    WebElement signInOption = wait.until(ExpectedConditions.elementToBeClickable(sign_in_link));
	    signInOption.click();

	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
	}
	 
		
		public void wait_for_button (WebDriver driver , int time , By button) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeClickable(button));
		}

		
	
		 
		 
		 public void click_on_laptops_button () {
			 wait_for_element_to_be_clickable(base_page_driver, laptops_link, 15);
				base_page_driver.findElement(laptops_link).click();
			}
		 
		 
		 public void click_on_smartwatches_button () {
			 wait_for_element_to_be_clickable(base_page_driver, smartwatches_link, 15);
				base_page_driver.findElement(smartwatches_link).click();
			}
		 
		 public void open_home_page () {
			 wait_for_element_to_be_clickable(base_page_driver, logo, 15);
				base_page_driver.findElement(logo).click();

			}
 
	 
}
