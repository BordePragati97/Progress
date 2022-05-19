package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign19 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Actions act = new Actions(driver);
		List<WebElement> main = driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		for (int i=0; i<main.size(); i++) {
			System.out.println("***" + main.get(i).getText() + "***");
			act.moveToElement(main.get(i)).perform();

			List<WebElement> submenu = driver.findElements(By.cssSelector(".navbar-nav>li:nth-child(" +(i+1)+ ")>ul>li>a"));
			if (submenu.size() > 0) {
				for (int j=0; j<submenu.size(); j++) {
					System.out.println(".." + submenu.get(j).getText() + "..");
				}
			} else {
				System.out.println("---No Sbmenu---");
			}

		}

	}
}
