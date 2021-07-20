package PrjctRoy.NewE2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	public WebDriver driver;
	 WebDriverWait w ; 
	 
	 public Utils(WebDriver driver){
			this.driver = driver;
		}
	
	 
	 public void explictwait(By loct)
	 {
		w = new WebDriverWait(driver,30);
	    w.until(ExpectedConditions.visibilityOfElementLocated((loct)));
	    
	  }

}
