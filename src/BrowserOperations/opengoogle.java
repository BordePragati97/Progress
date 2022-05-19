package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogle {

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
		d1.close();

	}

}
