package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8 {

	public static void main(String[] args) {

		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		w1.get("https://www.google.com/");
		
		w1.findElement(By.name("q")).sendKeys("Selenium");
		
		//List<WebElement> devices= w1.findElements(By.cssSelector(".mkHrUc>ul>div>ul>li"));
		//OR
		List<WebElement> devices= w1.findElements(By.cssSelector(".erkvQe>div>ul>li>div"));

		System.out.println("devices count :"+devices.size());
		for(int i=0;i<devices.size();i++) {
			System.out.println(devices.get(i).getText());
		}
		
		
	}

}
