package allPageClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWithdrawl {

	public WebDriver driver;
	
	
	By wthdrlbutn=By.xpath("//a[@href='WithdrawalInput.php']"); 
	By accno=By.xpath("//input[@name='accountno']");
	By amunt=By.xpath("//input[@name='ammount']");
	By descrp=By.xpath("//input[@name='desc']");
	By submt=By.xpath("//input[@name='AccSubmit']");
	By hombuttn = By.xpath("//a[@href='Managerhomepage.php']");
	
	public NewWithdrawl(WebDriver driver){
		this.driver = driver;
	}
	
	public void withdrawalpage(String customerid,String amount,String description) throws IOException
	 {
		driver.findElement(wthdrlbutn).click();
		 driver.findElement(accno).sendKeys(customerid);
		 driver.findElement(amunt).sendKeys(amount);
		 driver.findElement(descrp).sendKeys(description);
		 driver.findElement(submt).click();
		 driver.findElement(hombuttn).click();
	 }
}
