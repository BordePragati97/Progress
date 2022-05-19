package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {

	public static void main(String[] args) {

		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.get("https://demosite.executeautomation.com/Login.html");
		System.out.println("current url :" + w1.getCurrentUrl());
		System.out.println("Get title :" + w1.getTitle());
		System.out.println("Get title length :" + w1.getTitle().length());
		String expected = "Execute Automation";
		String actual = w1.getTitle();
		if (actual.equals(expected)) {
			System.out.println("Login page open");
		} else {
			System.out.println("Login page not open or title incorrect");
		}

		WebElement UsernameInput = w1.findElement(By.name("UserName"));
		UsernameInput.sendKeys("execution");
		UsernameInput.clear();
		UsernameInput.sendKeys("execution");

		WebElement PasswordInput = w1.findElement(By.name("Password"));
		PasswordInput.sendKeys("admin");

		WebElement LoginButton = w1.findElement(By.name("Login"));
		LoginButton.click();
		// w1.close();

	}

}
