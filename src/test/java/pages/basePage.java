package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class basePage {
	protected WebDriver base_page_driver;
	   
	public  basePage(WebDriver driver){
		  base_page_driver = driver ;
		
	  }
	  
	  public void scroll_down (WebDriver driver) throws InterruptedException {
		  Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,400)"); 
		  Thread.sleep(2000);

	  }
	  
	  public void scroll_up (WebDriver driver) throws InterruptedException {
		  Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,-500)");  
		  Thread.sleep(2000);

	  }
	  
	  public void wait_elment_to_be_visible(WebDriver driver , int time , By element_name) {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(element_name));
	  }
	  
	
	  public void wait_for_element_to_be_clickable(WebDriver driver, By locator, int time) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		    wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
}
