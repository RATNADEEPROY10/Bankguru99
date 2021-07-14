package allPageClass;

import java.io.IOException;

import PrjctRoy.NewE2E.Base;
import allTestClass.VerifyLoginFunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  public WebDriver driver;

  public By id=By.xpath("//input[@name='uid']");
  public By pass=By.xpath("//input[@name='password']");
  public By loginbuttn = By.xpath("//input[@name='btnLogin']");

	public LoginPage(WebDriver driver){
	     this.driver =driver;
	}
	
	public void LoginPageNavigation(String Username,String Password) 
	{

		//one is inheritance
		//System.out.println("In the VerifyLogin id" + id +"username:" + Username);
		//System.out.println("In the VerifyLogin password"+ pass + "Password" + Password);
		// creating object to that class and invoke methods of it
		driver.findElement(id).sendKeys(Username);
		
		driver.findElement(pass).sendKeys(Password);
		
		driver.findElement(loginbuttn).click();


	}

}
	
