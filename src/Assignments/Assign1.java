package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) {
		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		w1.get("https://demo.actitime.com/");

		String s1 = w1.getPageSource();
		System.out.println("Get paegSource:" + s1);
		System.out.println("Get pageSource code length :" + s1.length());

		System.out.println("current url :" + w1.getCurrentUrl());
		System.out.println("Get title :" + w1.getTitle());
		System.out.println("Get title length :" + w1.getTitle().length());
		w1.close();

	}

}
