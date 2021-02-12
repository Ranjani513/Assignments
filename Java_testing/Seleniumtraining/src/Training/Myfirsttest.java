package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Myfirsttest {
public static void main(String [] args)
{
	/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());*/

	System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	//System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
	//WebDriver driver=new EdgeDriver();
	/*driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("ranjani");
	driver.findElement(By.id("pass")).sendKeys("ranjani");
	driver.findElement(By.name("login")).click();
	System.out.println(driver.getCurrentUrl());       
	
	driver.findElement(By.linkText("Forgetten password"));*/
	
	
	/*driver.get("https://www.linkedin.com/home");
	driver.findElement(By.className("nav__button-secondary")).click();
	//driver.findElement(By.xpath("//div[@class='intent-module']//following::li[1]")).click();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ranjani");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	driver.findElement(By.cssSelector("#password")).sendKeys("ranjani");
	//driver.findElement(By.className("btn__tertiary--medium")).click();
	System.out.println(driver.getTitle());
	 driver.findElement(By.xpath("//ul[@class='footer__base__nav-list']//following-sibling::li[2]")).click();*/
	
  
}
}
