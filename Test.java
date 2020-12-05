package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver dr = new ChromeDriver();
		Thread.sleep(5000);		
	dr.navigate().to("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	Thread.sleep(5000);	
		
	
	WebElement ele = dr.findElement(By.xpath("/html/body/div/div[2]/div/div/select[1]"));
			Select list = new Select (ele);
			list.selectByIndex(3);

			Thread.sleep(5000);	
			
			dr.findElement(By.xpath("/html/body/div/div[3]/div/div/label[4]")).click();
			
			Thread.sleep(5000);	
			
			dr.findElement(By.xpath("/html/body/div/div[4]/div/div/form/input[3]")).click();
			
			Thread.sleep(5000);
		
			dr.findElement(By.xpath("/html/body/div/div[5]/div/div/form/input[1]")).click();
			
			Thread.sleep(5000);
			
		    WebElement ele2 = dr.findElement(By.xpath("/html/body/div/div[5]/div/div/select"));
			Select list2 = new Select (ele2);
			list2.selectByIndex(0);
			
			Thread.sleep(5000);
		dr.close();
		
		

	}

}
