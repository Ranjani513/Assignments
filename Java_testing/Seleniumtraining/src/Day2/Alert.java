package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,30);
	
	Thread.sleep(4000);
	driver.findElement(By.name("cusid")).sendKeys("ranjani");
	driver.findElement(By.name("submit")).click();
	driver.switchTo().alert().accept();
	driver.switchTo().alert().accept();
}
}
