package cubesoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
  
	WebDriver driver;
	
	By buttonProduct = By.xpath("/html/body/header/div/div/nav[2]/div[2]/ul/li[1]/a");
	By buttonSolutions = By.xpath("/html/body/header/div/div/nav[2]/div[2]/ul/li[2]/a");
	By buttonPricing = By.xpath("/html/body/header/div/div/nav[2]/div[2]/ul/li[3]/a");
	By buttonBestPractices = By.xpath("/html/body/header/div/div/nav[2]/div[2]/ul/li[4]/a");
	By buttonCompany = By.xpath("/html/body/header/div/div/nav[2]/div[2]/ul/li[5]/a");
	
	
	

public LoginPage(WebDriver driver){
	  this.driver = driver;
}
	  
public void clickButtonproduct () {
driver.findElement(buttonProduct).click();
}
public void clickButtonsolutions () {
driver.findElement(buttonSolutions).click();
}
public void clickButtonpricing () {
driver.findElement(buttonPricing).click();
}
public void clickButtonbestpractices () {
driver.findElement(buttonBestPractices).click();
}
public void clickButtoncompany () {
driver.findElement(buttonCompany).click();
}
}

