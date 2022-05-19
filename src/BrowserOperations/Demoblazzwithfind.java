package BrowserOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblazzwithfind {

	public static void main(String[] args) {

		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		w1.get("https://www.demoblaze.com/");

		List<WebElement> categories = w1.findElements(By.cssSelector(".list-group>a"));
		System.out.println("Option count is: " + categories.size());
		List<String> l1 = new ArrayList<String>();
		l1.add("CATEGORIES");
		l1.add("Phones");
		l1.add("Laptops");
		l1.add("Monitors");
		
		for (int i = 0; i < categories.size(); i++) {
			WebElement cat = categories.get(i);
			System.out.println("********* Element of List is: " + cat.getText() + "*********");
			System.out.println(cat.isDisplayed());
			System.out.println(cat.isEnabled());
			System.out.println(cat.getText().equals(l1.get(i)));
		}
		w1.close();

	}

}
