package BrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumutility {

	public WebDriver setup(String brwsername,String appUrl){
		WebDriver driver=null;
		if(brwsername.equalsIgnoreCase(appUrl)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (brwsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		return driver;
		
	}
		
		
	

}
