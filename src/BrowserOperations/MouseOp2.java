package BrowserOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOp2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver drv=new ChromeDriver();	
		drv.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame=drv.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		drv.switchTo().frame(frame);
		Actions act=new Actions(drv);
		
		List<WebElement> sourceElements=drv.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target=drv.findElement(By.id("trash"));
		
		act.dragAndDrop(sourceElements.get(0), target).build().perform();
	
		
		
		
		
		
	}

}
