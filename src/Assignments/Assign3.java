package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		String driverpath = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");

		String s1 = d1.getPageSource();
		System.out.println("sorcecode:" + s1);
		System.out.println("sourcecode length:" + s1.length());

		System.out.println("app current url:" + d1.getCurrentUrl());
		System.out.println("app title :" + d1.getTitle());
		System.out.println("app title length:" + d1.getTitle().length());

		d1.close();

	}

}
