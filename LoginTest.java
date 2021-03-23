package cubesoftware;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	@Test

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
		
 @Test
 
 public void verifyTitle() {
	 String baseURL = "https://www.cubesoftware.com/";
		
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(baseURL);
	    driver.manage().window().maximize();
	    
	    System.out.println("Page title is : " + driver.getTitle());
	      driver.quit();
	 
	 
		
}
			
	}

