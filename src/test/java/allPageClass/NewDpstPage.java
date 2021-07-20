package allPageClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class NewDpstPage {

	public WebDriver driver;
	JavascriptExecutor js;
	
	By dpstbutn=By.xpath("//a[@href='DepositInput.php']");
	By accno=By.xpath("//input[@name='accountno']");
	By amunt=By.xpath("//input[@name='ammount']");
	By descrp=By.xpath("//input[@name='desc']");
	By submt=By.xpath("//input[@name='AccSubmit']");
	By hombuttn = By.xpath("//a[@href='Managerhomepage.php']");
	
	public NewDpstPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void depstpage(String customerid,String amount,String description) throws IOException
	 {
		js = (JavascriptExecutor)driver;
		 //System.out.println("in the newDepositPage A");
		 js.executeScript("window.scroll(0,500)");
		 driver.findElement(dpstbutn).click();
		 driver.findElement(accno).sendKeys(customerid);
		 driver.findElement(amunt).sendKeys(amount);
		 driver.findElement(descrp).sendKeys(description);
		 driver.findElement(submt).click();
		 driver.findElement(hombuttn).click();
	 }
	
}
