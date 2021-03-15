package cubesoftware;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTest {
  
	
	@Test
  
	public void menuSelection() {
	
  String baseURL = "https://www.cubesoftware.com/";
	
  System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
  WebDriver driver = new ChromeDriver();
  driver.navigate().to(baseURL);
  driver.manage().window().maximize();
 
   LoginPage login = new LoginPage(driver);
		login.clickButtonproduct();
		login.clickButtonsolutions();
		login.clickButtonpricing();
	  
		driver.quit();
	}
	@AfterTest

	public void secondMenu() {
	String baseURL = "https://www.cubesoftware.com/";
	
	System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to(baseURL);
    driver.manage().window().maximize();
     
     LoginPage login = new LoginPage(driver);
		login.clickButtonbestpractices();
		login.clickButtoncompany();
	  
		driver.quit();
}
			
	}

