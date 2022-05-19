package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		String s1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", s1);
		WebDriver w1 = new ChromeDriver();
		w1.get("https://www.facebook.com");

		String s2 = w1.getPageSource();
		System.out.println("Get paegSource:" + s2);
		System.out.println("Get pageSource code length :" + s2.length());

		System.out.println("current url :" + w1.getCurrentUrl());
		System.out.println("Get title :" + w1.getTitle());
		String expected = "Facebook – log in or sign up";
		String actual = w1.getTitle();
		if (actual.equals(expected)) {
			System.out.println("correct");
		} else {
			System.out.println("Incorrect");
		}
		w1.close();

	}

}
