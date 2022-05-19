package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign13 {

	public static void main(String[] args) {

		String S1 = "F:\\java\\workspace\\Selenium practice\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", S1);
		WebDriver W1 = new FirefoxDriver();
		W1.get("https://www.gsmarena.com/");
		String expected = "GSMArena.com - mobile phone reviews, news, specifications and more..." ;
		String actual = W1.getTitle();
		if (expected.equals(actual)) {
			System.out.println("Homepage title verified");
		} else {
			System.out.println("Homepage title not verified");

		}

		WebElement realmename =W1.findElement(By.cssSelector(".brandmenu-v2>ul>li:nth-child(14)"));
		realmename .click();
		
		WebElement Pagenav =W1.findElement(By.cssSelector(".nav-pages"));
		
		
	}

}
