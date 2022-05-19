package BrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOp {

	public static void main(String[] args) throws InterruptedException {

		String d1 = "F:\\java\\workspace\\Selenium practice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d1);
		WebDriver w1 = new ChromeDriver();
		Thread.sleep(2000);
		w1.manage().window().maximize();
		Thread.sleep(2000);
		w1.manage().window().setSize(new Dimension(400, 700));
		Thread.sleep(2000);
		w1.manage().window().maximize();
		w1.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		w1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("current page Title:" + w1.getTitle());
		System.out.println("current page Url:" + w1.getCurrentUrl());
		w1.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		w1.navigate().back();
		Thread.sleep(2000);
		w1.navigate().forward();
		Thread.sleep(2000);
		w1.navigate().refresh();
		Thread.sleep(2000);
		w1.navigate().to("https://www.amazon.in/");
		w1.close();

	}

}
