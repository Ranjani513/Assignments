package Training;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Flipkart {
 static WebDriver driver;
 static List<WebElement> links ;
 public static  void linkscount()
	{
	 
	   links= driver.findElements(By.tagName("a"));
		 System.out.println("The number of links is " + links.size());
	}
public static void Drivers(String browser) {
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 Flipkart.linkstext();
		 Flipkart.linkscount();
	}
	else if(browser.equalsIgnoreCase("Ie"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		 driver.get("https://www.flipkart.com/");
		 Flipkart.linkstext();
		 Flipkart.linkscount();
	}
	else if(browser.equalsIgnoreCase("Msedge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		 Flipkart.linkstext();
		 Flipkart.linkscount();
	}
}
public static void linkstext()
{ 
	 links = driver.findElements(By.tagName("a"));
	  
	   for(WebElement link:links)
		{
			
			System.out.println(link.getAttribute("href"));
			System.out.println(link.getAttribute("text"));
			
		}
}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	 System.out.print("Enter any option like chrome msedge and ie:");
	 Scanner sc=new Scanner(System.in);
	 String browser=sc.nextLine();
	 Drivers(browser);
		
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.quit();
	}
	

 
	}
