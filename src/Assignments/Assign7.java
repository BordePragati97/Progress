package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign7 {

	public static void main(String[] args) {

		String mainpath = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", mainpath);
		WebDriver P1 = new ChromeDriver();
		P1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		P1.get("https://demo.vtiger.com/vtigercrm/index.php");

		String expected = "vtiger";
		String actual = P1.getTitle();
		if (actual.equals(expected)) {
			System.out.println("Login page open");
		} else {
			System.out.println("Login page not open or title incorrect");
		}

		System.out.println("Current Url :" + P1.getCurrentUrl());
		System.out.println("Get Title :" + P1.getTitle());

		WebElement UsernameInput = P1.findElement(By.id("username"));
		UsernameInput.clear();
		UsernameInput.sendKeys("admin");

		WebElement PasswordInput = P1.findElement(By.name("password"));
		PasswordInput.clear();
		PasswordInput.sendKeys("Test@123");
		P1.findElement(By.className("buttonBlue")).click();
		P1.findElement(By.className("fa-user")).click();

		WebElement Logoutbutton = P1.findElement(By.linkText("Sign Out"));
		WebDriverWait wait = new WebDriverWait(P1, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Logoutbutton));

		String actualhomepagetitle = P1.getTitle();
		System.out.println("Actual HomePage Title:" + actualhomepagetitle);
		String expectHptitle = "Dashboard";
		if (actualhomepagetitle.equals(expectHptitle)) {
			System.out.println("Login successful and homepage title verified");
		} else {
			System.out.println("Login failed Homepage title  not verified");
		}

		P1.findElement(By.linkText("Sign Out")).click();

		P1.close();

	}

}
