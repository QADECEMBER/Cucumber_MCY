package pages;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	
	public  static void initDriver() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://codefios.com/ebilling/");
	
		
	}
	
	
public void  takeScreenShot (WebDriver driver) {
	
	//ClassName obj = new ClassName();
	TakesScreenshot takeSecreenshot = (TakesScreenshot)driver;
	File sourceFile= takeSecreenshot.getScreenshotAs(OutputType.FILE);
	SimpleDateFormat sdf = new SimpleDateFormat ("MMddyy_HHmmss");
	
	Date date = new Date(0);
	String label = sdf.format(date);
	
	try {
		FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")+"/screenshots/"+label+".png"));
	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
		
}
}
