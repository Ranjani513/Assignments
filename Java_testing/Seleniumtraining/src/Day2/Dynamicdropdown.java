package Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicdropdown {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("fromCity")))).click();
	
	List<WebElement> dropdownlist=driver.findElements(By.xpath("ul[@class='react-autosuggest__suggestions-list']//following::li"));
	System.out.println("hello");
	for(WebElement city:dropdownlist)
	{
		
		
	System.out.println(city);
	}
}
}
