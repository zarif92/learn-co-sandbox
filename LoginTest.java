package one;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class LoginTest {

   			  
		
	  @Test
	  public void buyItem() {
		  
		

		  String baseURL = "http://automationpractice.com/index.php";
			
		  System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to(baseURL);
	       driver.manage().window().maximize();
	       //driver.get("http://automationpractice.com/index.php");
		  
	       LoginPage login = new LoginPage(driver);
			login.clickButtontshirt();
			login.clickButtonimage();
			login.clickButtoncart();
		  
			driver.quit();
  }

  }


