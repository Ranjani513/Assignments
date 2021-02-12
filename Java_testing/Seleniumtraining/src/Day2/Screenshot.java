package Day2;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		DateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		String time=(dateformat.format(date)).toString();
		String f="screenshot_";
        File screenshotd=new File("C:\\Java_testing\\Seleniumtraining/"+f+time+".png");
        FileUtils.copyFile(screenshots,screenshotd);
	}

}
