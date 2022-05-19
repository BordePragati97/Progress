package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign10 {

	public static void main(String[] args) {
		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		w1.get("https://www.flipkart.com/");
		System.out.println("Current Url :" + w1.getCurrentUrl());
		System.out.println("Get Title :" + w1.getTitle());

		String expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actual = w1.getTitle();
		if (actual.equals(expected)) {
			System.out.println("Login page open");
		} else {
			System.out.println("Login page not open or title incorrect");
		}

		List<WebElement> devices = w1.findElements(By.cssSelector("._37M3Pb>div>a"));
		System.out.println("devices count :" + devices.size());
		for (int i = 0; i < devices.size(); i++) {
			System.out.println(devices.get(i).getText());
		}

	}

}
