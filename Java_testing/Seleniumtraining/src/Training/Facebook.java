package Training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https://www.facebook.com/";
	driver.get(url);
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String durl=driver.getCurrentUrl();
    if((url).equals(durl))
    {
    	System.out.println("matched  and navigating to facebook");
    }
    else
    {
    	System.out.println("not matched");
    }
    
    List<WebElement>  links= driver.findElements(By.tagName("a"));
    for(WebElement link:links) {
    	if(link.getText().equalsIgnoreCase("Create New Account"))
    	{
    		System.out.println("Found create New Account");
    		link.click();
    		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raga");
    		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    		driver.findElement(By.name("lastname")).sendKeys("Ranjani");
    		driver.findElement(By.name("reg_email__")).sendKeys("ranjani@gmail.com");
    		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ranjani@gmail.com");
    	    driver.findElement(By.name("reg_passwd__")).sendKeys("ranjani123");
    	    Select date = new Select(driver.findElement(By.name("birthday_day")));
    	   date.selectByVisibleText("13");
    	   Select month = new Select(driver.findElement(By.name("birthday_month")));
    	   month.selectByVisibleText("Dec");
    	   Select year = new Select(driver.findElement(By.name("birthday_year")));
    	   year.selectByVisibleText("1998");
    	   WebElement radioFemale = driver.findElement(By.xpath("//input[@name='sex']"));
    	   radioFemale.click();
    	   
    	   driver.findElement(By.xpath("//button[@id='u_1_s']")).click();
    	   
    		break;
    		
    		
    	}
    	else
    	{
    		System.out.println("New Account not found");
    	}
    }

	

	
}
}