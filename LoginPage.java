package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
		WebDriver driver;
		
		By buttonTshirt = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a");
		By buttonImage = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img");
		By buttonCart = By.xpath("/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button/span");
		

		


public LoginPage(WebDriver driver){
	  this.driver = driver;
}
public void clickButtontshirt () {
	driver.findElement(buttonTshirt).click();
}
public void clickButtonimage () {
	driver.findElement(buttonImage).click();
}
public void clickButtoncart () {
	driver.findElement(buttonCart).click();
	
}

}