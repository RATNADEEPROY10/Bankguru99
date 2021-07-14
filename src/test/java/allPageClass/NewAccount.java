package allPageClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import okhttp3.internal.Util;

public class NewAccount {
	
	public WebDriver driver;
	 Util ut;
	
	
	By newaccbuttn=By.xpath("//a[@href='addAccount.php']");
	By custmrid=By.xpath("//input[@name='cusid']");
	By deposit = By.xpath("//input[@name='inideposit']");
    By accntype =By.xpath("//select[@name='selaccount'] //option[@value='Current']");
    By submitbuttn=By.xpath("//input[@type='submit']");
	By hombuttn = By.xpath("//a[@href='Managerhomepage.php']");
	 public NewAccount(WebDriver driver){
			this.driver = driver;
		}

	 
	 public void newAccountPage(String customerid,String amount) throws IOException
		{
		    //ut=new Util(driver);
		    //System.out.println("In the addAcverify A");
	    	driver.findElement(newaccbuttn).click();
	    	//System.out.println("In the addAcverify B");
			driver.findElement(custmrid).sendKeys(customerid);
			//System.out.println("In the addAcverify C");
			driver.findElement(accntype).click();
			driver.findElement(deposit).sendKeys(amount);
			driver.findElement(submitbuttn).click();
			driver.findElement(hombuttn).click();
			
		}
}
