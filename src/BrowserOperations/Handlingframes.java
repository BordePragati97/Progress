package BrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingframes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drv.get("https://jqueryui.com/droppable/");
        drv.findElement(By.cssSelector(".demo-frame"));
//		driver.switchTo().frame(frame);
		// or
//		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		// or
		// Switch your control to frame using index
		drv.switchTo().frame(0);
		Actions act = new Actions(drv);
		WebElement src = drv.findElement(By.id("draggable"));
		WebElement dest = drv.findElement(By.id("droppable"));
		act.dragAndDrop(src, dest).build().perform();
		drv.switchTo().defaultContent();
		drv.findElement(By.cssSelector(".logo>a")).click();

	}

}
