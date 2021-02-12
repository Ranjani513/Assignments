package Training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		driver.get("https://www.ebay.com/");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.name("_nkw")).sendKeys("Apple watches");
			
			WebElement element=driver.findElement(By.name("_sacat"));
		    Select dropdown=new Select(element);
		    dropdown.selectByValue("293");
		    driver.findElement(By.id("gh-btn")).click();
		    
		result();
		
	}
	public static void result()
	{
		
	 
	    List<WebElement> products = driver.findElements(By.xpath("//ul[@class='srp-results srp-list clearfix']"));
	    System.out.println(products.size());
	    for(WebElement el:products)
	    {
	    	System.out.println(el.getText());
	    }
	}

}
