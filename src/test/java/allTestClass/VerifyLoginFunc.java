package allTestClass;


import java.io.IOException;

import PrjctRoy.NewE2E.Base;

import allPageClass.LoginPage;
import allPageClass.NewAccount;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VerifyLoginFunc extends Base { 

	public WebDriver driver;
	public LoginPage loginpage;
	public NewAccount adac;
	
	
	
	@BeforeTest
	public void login() throws IOException
	{
		driver = initalzeDriv();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		
	}


	@Test(dataProvider="getData")
	public void VerifyLogin(String Username,String Password) throws IOException
	{
		loginpage = new LoginPage(driver);
		// creating object to that class and invoke methods of it	
		loginpage.LoginPageNavigation(Username,Password);

	}
	
	@Test(dataProvider="getData1")
	public void  addAcverify(String customerid,String amount) throws IOException
	{
		adac= new NewAccount(driver);
		//System.out.println("In the addAcverify "+adac.driver);
		adac.newAccountPage(customerid, amount);
	}


	@AfterTest
	public void teardown()
	{
		 driver.close();
	}


	@DataProvider
	public Object[][] getData()
	{
		// Array size is 2
		// 0,1
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="mngr340304";
		data[0][1]="arUgEry";
		//1st row
		//data[1][0]="restricteduser@qw.com";
		//data[1][1]="456788";
		return data;	
	}
	
	@DataProvider
	public Object[][] getData1()
	{
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="84579";
		data[0][1]="1500";
	
		return data;	
	}

}


