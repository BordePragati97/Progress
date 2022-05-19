package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign9 {

	public static void main(String[] args) {
 
		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		w1.get("https://www.demoblaze.com/");
		

		List<WebElement> devices = w1.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		
		System.out.println("devices count :"+devices.size());
		for(int i=0;i<devices.size();i++) {
			System.out.println(devices.get(i).getText());
		}
		
	
	}

}
