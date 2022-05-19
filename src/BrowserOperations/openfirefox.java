package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefox {

	public static void main(String[] args) {

		String driverpath = "F:\\java\\workspace\\Selenium practice\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();//Generic way to open
		WebDriver driver = new FirefoxDriver();
		// driver.get("https://www.google.com/"); //open google using firefox

	}

}
