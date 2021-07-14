package PrjctRoy.NewE2E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Base {
	
	 public WebDriver driver; //declaring driver as a global variable as it is need to pass through out the package
	 public Properties pro;
	
	public WebDriver initalzeDriv() throws IOException
	{
	     pro = new Properties(); //properties class obj is created
		FileInputStream fis = new FileInputStream("C:\\Users\\RatnadeepRoy\\eclipse-workspace\\NewE2E\\src\\main\\java\\PrjctRoy\\NewE2E\\data.properties");
		//passing the file location into the file object fil
		pro.load(fis); //loading the file into properties object
		String browsername=pro.getProperty("browser");
		//initializing the browser name in the string variable browsername
		
		//System.out.print("before if -8-8-8-8 ");
		
		
		if(browsername.equals("Chrome"))
		{
			//System.out.print("under if -8-8-8-8 ");
          System.setProperty("webdriver.chrome.driver","C:\\Users\\Ratnadeep\\Desktop\\Automation\\chromedriver.exe");
           driver=new ChromeDriver();
           
		}
		else if(browsername.equals("firefox"))
		{	//for any other browser 
			//System.out.print("in the else if -8-8-8-8 ");
		}
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver; //returning the driver object
		
		}
	
	
		
	
	}

