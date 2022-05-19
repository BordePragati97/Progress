package BrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchOp2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver drv=new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		drv.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		drv.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		drv.switchTo().frame(0);
		
		drv.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert text msg is: "+drv.switchTo().alert().getText());
		drv.switchTo().alert().accept();
	
		
	
		
		
		
		
		
	}

}
