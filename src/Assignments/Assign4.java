package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {

	public static void main(String[] args) {

		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.get("https://demo.actitime.com/");
		System.out.println("current url :" + w1.getCurrentUrl());
		System.out.println("Get title :" + w1.getTitle());
		System.out.println("Get title length :" + w1.getTitle().length());
		String expected = "actiTIME - Login";
		String actual = w1.getTitle();
		if (actual.equals(expected)) {
			System.out.println("Login page open");
		} else {
			System.out.println("Login page not open or title incorrect");
		}
		WebElement UsernameInput = w1.findElement(By.id("username"));
		UsernameInput.sendKeys("admin");
		UsernameInput.clear();
		UsernameInput.sendKeys("admin");

		WebElement PasswordInput = w1.findElement(By.name("pwd"));
		PasswordInput.sendKeys("manager");

		WebElement LoginButton = w1.findElement(By.id("loginButton"));
		LoginButton.click();
		// w1.close();

	}

}
