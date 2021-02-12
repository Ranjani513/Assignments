package Day2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,30);
	
	Thread.sleep(4000);
	Set<String> windowHandles=driver.getWindowHandles();
	System.out.println("windowhandles size:"+" "+windowHandles.size());
	String w1=windowHandles.toArray()[0].toString();
	System.out.println(driver.switchTo().window(w1).getTitle());
	String w2=windowHandles.toArray()[1].toString();
	System.out.println(driver.switchTo().window(w2).getTitle());
	String w3=windowHandles.toArray()[2].toString();
	System.out.println(driver.switchTo().window(w3).getTitle());
	//driver.switchTo().alert().accept();
}
}
