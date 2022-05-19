package BrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoutbrowser {

	public static void main(String[] args) {

		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		w1.get("https://demo.actitime.com/");
		String expected = "actiTIME - Login";
		String actual = w1.getTitle();
		if (actual.equals(expected)) {
			System.out.println("Login page open");
		} else {
			System.out.println("Login page not open or title incorrect");
		}
		w1.findElement(By.id("username")).sendKeys("admin");

		w1.findElement(By.name("pwd")).sendKeys("manager");

		w1.findElement(By.id("loginButton")).click();

		w1.findElement(By.id("logoutLink")).click();

		w1.close();
	}

}
