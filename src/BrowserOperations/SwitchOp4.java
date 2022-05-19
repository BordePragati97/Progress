package BrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchOp4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert text msg is: " + driver.switchTo().alert().getText());

		driver.switchTo().alert().sendKeys("Pune");
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

	}

}
