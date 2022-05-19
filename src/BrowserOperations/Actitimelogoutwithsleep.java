package BrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogoutwithsleep {

	public static void main(String[] args) throws InterruptedException {

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

		Thread.sleep(2000);

		String actualhomepagetitle = w1.getTitle();
		System.out.println("Actual HomePage Title:" + actualhomepagetitle);
		String expectHptitle = "actiTIME - Enter Time-Track";
		if (actualhomepagetitle.equals(expectHptitle)) {
			System.out.println("Login successful and homepage title verified");
		} else {
			System.out.println("Login failed Homepage title  not verified");
		}

		w1.findElement(By.id("logoutLink")).click();

		w1.close();

	}

}
