package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign12 {

	public static void main(String[] args) {

		String S1 = "F:\\java\\workspace\\Selenium practice\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", S1);
		WebDriver W1 = new FirefoxDriver();
		W1.get("https://www.gsmarena.com/");
		System.out.println("Get Url:" + W1.getCurrentUrl());
		System.out.println("Get Title:" + W1.getTitle());
		String expected = "GSMArena.com - mobile phone reviews, news, specifications and more..." ;
		String actual = W1.getTitle();
		if (expected.equals(actual)) {
			System.out.println("Homepage title verified");
		} else {
			System.out.println("Homepage title not verified");

		}
		
		List<WebElement> Options = W1.findElements(By.cssSelector(".brandmenu-v2 a"));
		System.out.println("Options count:"+Options.size());
		for(int i=0;i<Options.size();i++) {
			System.out.println(Options.get(i).getText());
		}

				

	}

}
