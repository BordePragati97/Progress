package BrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemoblazz {

	public static void main(String[] args) {

		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		w1.get("https://www.demoblaze.com/");

		WebElement C1 = w1.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		System.out.println(C1.isDisplayed());
		System.out.println(C1.isEnabled());
		System.out.println(C1.getText().equals("CATEGORIES"));

		WebElement phone = w1.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
		System.out.println(phone.isDisplayed());
		System.out.println(phone.isEnabled());
		System.out.println(C1.getText().equals("Phones"));

		WebElement laptop = w1.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
		System.out.println(laptop.isDisplayed());
		System.out.println(laptop.isEnabled());
		System.out.println(C1.getText().equals("Laptops"));

		WebElement monitors = w1.findElement(By.cssSelector(".list-group>*:nth-child(4)"));
		System.out.println(monitors.isDisplayed());
		System.out.println(monitors.isEnabled());
		System.out.println(C1.getText().equals("Monitors"));
		
		w1.close();

	}

}
