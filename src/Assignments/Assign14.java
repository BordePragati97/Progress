package Assignments;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign14 {

	public static void main(String[] args) {

		String S1 = "F:\\java\\workspace\\Selenium practice\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", S1);
		WebDriver W1 = new FirefoxDriver();
		W1.manage().window().maximize();
		W1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		W1.get("https://www.facebook.com");

		System.out.println("current url :" + W1.getCurrentUrl());
		System.out.println("Get title :" + W1.getTitle());
		String expected = "Facebook – log in or sign up";
		String actual = W1.getTitle();
		if (actual.equals(expected)) {
			System.out.println("Homepage is verified");
		} else {
			System.out.println("Homepage is not verified");
		}

		W1.findElement(By.linkText("Create New Account")).click();
		
		WebElement date =W1.findElement(By.id("day"));
		Select s1=new Select(date);
		System.out.println(date.isDisplayed());
		System.out.println(date.isEnabled());
		System.out.println(s1.isMultiple());
		List<WebElement> option=s1.getOptions();
		System.out.println(option.size());
		
		String P=s1.getFirstSelectedOption().getText();
	    System.out.println(P);
		
		s1.selectByValue("24");
		String P1=s1.getFirstSelectedOption().getText();
		System.out.println(P1);
		
		WebElement month =W1.findElement(By.id("month"));
		Select s2=new Select( month);
		System.out.println( month.isDisplayed());
		System.out.println( month.isEnabled());
		System.out.println(s2.isMultiple());
		String m =s2.getFirstSelectedOption().getText();
		System.out.println(m);
		List<WebElement> option1=s2.getOptions();
		System.out.println(option1.size());
		
		
		s2.selectByVisibleText("Feb");
		String P4=s2.getFirstSelectedOption().getText();
		System.out.println(P4);
		
		WebElement year =W1.findElement(By.id("year"));
		Select s3=new Select(year);
		System.out.println(year.isDisplayed());
		System.out.println(year.isEnabled());
		System.out.println(s3.isMultiple());
		String y=s3.getFirstSelectedOption().getText();
		System.out.println(y);
		List<WebElement> option2=s3.getOptions();
		System.out.println(option2.size());
		
		s3.selectByValue("1995");
		String P6=s3.getFirstSelectedOption().getText();
		System.out.println(P6);
		
		
		

		
		

		
	}

}
