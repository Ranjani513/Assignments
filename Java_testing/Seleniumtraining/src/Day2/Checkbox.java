package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	driver.findElement(By.className("desktop-searchBar")).sendKeys("shirts");
	driver.findElement(By.xpath("//a[@class='desktop-submit']/span")).click();
	driver.findElement(By.xpath("//div[@class='vertical-filters-filters categories-container']/ul/li[1]/label")).click();
	//driver.findElement(By.xpath("//ul[@class='categories-list']//following-sibling::li[1]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//ul[@class='brand-list']//following::li[2]")).click();
	//driver.findElement(By.className("//ul[categories-list]")).sendKeys("shirts");
	//driver.close();
	
	
}
}
