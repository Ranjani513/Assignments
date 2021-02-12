package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/guru99home/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		
	   


	       driver.switchTo().frame("a077aa5e"); 

			
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		  
  			
      }
}
