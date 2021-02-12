package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IE {
public static void main(String[] args)
{
	System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	//driver.get("https://www.google.com/");
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.navigate().to("http://www.google.com/");  
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	String actualTitle=driver.getTitle();
	String expectedtitle="Google";
	if(actualTitle.contains(expectedtitle))
	{
		System.out.println("Matched!!!!!!!!");
	}
	else
	{
		System.out.println("Not Matched!!!!!!!!!!");
	}
	System.out.println(driver.getCurrentUrl());
	driver.quit();
}
}
