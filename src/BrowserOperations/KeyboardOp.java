package BrowserOperations;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOp {

	public static void main(String[] args)throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
//		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
//		possible way to refresh browser
//				driver.navigate().refresh();
				//or
//				driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"r");
				//or
				//driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
//      Flipkart Pagedown & EscapeOp.				
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
//		WebElement main =driver.findElement(By.xpath("//body"));
//		main.sendKeys(Keys.ESCAPE);
//		for(int i=0;i<10;i++) {
//			main.sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(1000);
//		}
//      Filpkart try & catchOp
		driver.get("https://www.flipkart.com/");
		
		try {
			WebElement element = driver.findElement(By.xpath("//body"));
			element.sendKeys(Keys.ESCAPE);
		}catch(NoSuchElementException e) {
			
		}
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		
		

		
		
		
	}

}
