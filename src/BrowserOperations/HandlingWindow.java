package BrowserOperations;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drv.get("https://etrain.info/in");

		String homePageWinId = drv.getWindowHandle();
		System.out.println("Home page window ID: " + homePageWinId);

		drv.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]")).click();

		Set<String> allWinIds = drv.getWindowHandles();
		System.out.println("All windows ID: " + allWinIds);

		allWinIds.remove(homePageWinId);
		System.out.println("After remoing homeWinID, all windows ID: " + allWinIds);

		Iterator<String> itr = allWinIds.iterator();
		String childWinId = itr.next();

		drv.switchTo().window(childWinId);
		System.out.println("Linkedin page title: " + drv.getTitle());
		System.out.println("Linkedin page ulr: " + drv.getCurrentUrl());

		drv.switchTo().window(homePageWinId);
		System.out.println("etrain page title: " + drv.getTitle());
		System.out.println("etrain page ulr: " + drv.getCurrentUrl());
		drv.quit();

	}

}
