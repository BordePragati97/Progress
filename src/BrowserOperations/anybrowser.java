package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class anybrowser {

	public static void main(String[] args) {

		String geckoDriverPath = System.getProperty("user.dir") + "\\executables\\geckodriver.exe";
		String chromeDriverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		openBrowser(geckoDriverPath, "firefox");
		openBrowser(chromeDriverPath, "chrome");
	}

	static void openBrowser(String driverPath, String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverPath);
			WebDriver driver = new FirefoxDriver();
		}

	}
}
