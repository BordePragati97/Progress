package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign23 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dr.get("https://jqueryui.com/sortable/");

		// WebElement w1 =dr.findElement(By.cssSelector("#sidebar>aside:nth-child(1)>ul>li:nth-child(5)"));
		// w1.click();

		dr.switchTo().frame(0);
		Actions act = new Actions(dr);

		for (int i = 1; i <= 7; i++) {

			WebElement dest = dr.findElement(By.xpath("//ul[@class='ui-sortable']//li[" + i + "]"));

			WebElement source = dr.findElement(By.xpath("//ul[@class='ui-sortable']//li[7]"));

			act.dragAndDrop(source, dest).build().perform();
		}

		// driver.switchTo().defaultContent();//
	}

}
