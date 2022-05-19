package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {

		String driverpath = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();// Generic way to open

	}

}
