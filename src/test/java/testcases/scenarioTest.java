
package testcases;

import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class scenarioTest extends baseTest{



    @Test
    public void tests() throws InterruptedException {
    	String phoneNumber = "+201144070332";
    	String password = "153728469@Mr" ;
    	String theSearchLaptop = "Dell Latitude 7490 Intel Core i7-8650U 14 FHD Display, 16GB RAM, 512GB SSD, Windows 10 Pro" ;
    	String theSearchSmartwatch ="Apple Watch Series 6 (GPS + Cellular, 44mm) - Silver Aluminium Case with White Sport Band";
    	String stateName = "Dubai";
    	String cityName = "Gardens";
    	String firstName ="Marie";
    	String lastName = "Mostafa";
    	String email = "marie.mostafa@gmail.com";
    	String address = "The Gardens, Jebel Ali\n" + "Dubai, United Arab Emirates";
    	By INTLxpath =By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[1]/div/div/div/form[3]");
    	By UAExpath = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[1]/div/div/div/form[1]");
    	String intlName = "INTL";
    	String uaeName = "UAE";

    	

          home.choose_country(INTLxpath, intlName);
          home.goToSignIn();
          login.insert_phone_number(phoneNumber);
          login.click_on_submit_button();
          login.insert_password(password);
          login.click_on_submit_button();
        
      
           home.choose_country(UAExpath, uaeName)   ;        
           home.open_home_page();
         
           home.click_on_laptops_button();
           product.search_product(theSearchLaptop);
           base.scroll_down(driver);
           product.click_on_laptop();
           base.scroll_down(driver);
           product.addToCartButton();
           base.scroll_up(driver);
           home.open_home_page();

           home.click_on_smartwatches_button();
           product.search_product(theSearchSmartwatch);
           base.scroll_down(driver);
           product.click_on_smartwatch();
           base.scroll_down(driver);
           product.addToCartButton();
           
           product.view_cart();
           base.scroll_down(driver);
           cart.add_quantity();
           base.scroll_up(driver);
           
           cart.remove_product();
           cart.confirm_remove_product();
           cart.click_on_checkout();
           
           checkout.insert_firstName_forCheckout(firstName);
           checkout.insert_lastName_forCheckout(lastName);
           checkout.insert_emailAddress_forCheckout(email);
           base.scroll_down(driver);
           checkout.choose_state(stateName);
           checkout.choose_city(cityName);
           checkout.insert_address_forCheckout(address);
             
    }

   
 


}
