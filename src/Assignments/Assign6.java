package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6 {

	public static void main(String[] args) {

		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.get("https://demo.vtiger.com/vtigercrm/index.php");
		System.out.println("Get Title:" + w1.getTitle());
		System.out.println("Get Url :" + w1.getCurrentUrl());
		String expected = "vtiger";
		String actual = w1.getTitle();
		if (actual.equals(expected)) {
			System.out.println("Login page open");
		} else {
			System.out.println("Login page not open or title incorrect");
		}
		WebElement UsernameInput = w1.findElement(By.id("username"));
		UsernameInput.clear();
		UsernameInput.sendKeys("admin");

		WebElement PasswordInput = w1.findElement(By.name("password"));
		PasswordInput.clear();
		PasswordInput.sendKeys("Test@123");

		WebElement LoginButton = w1.findElement(By.className("buttonBlue"));
		LoginButton.click();

	}

}
