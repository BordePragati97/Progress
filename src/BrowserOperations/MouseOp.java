package BrowserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver drv=new ChromeDriver();	
		drv.get("http://demo.automationtesting.in/Register.html");
		WebElement username=drv.findElement(By.cssSelector("input[placeholder='First Name']"));
		username.sendKeys("admin");
		Actions act=new Actions(drv);
		act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement lastname=drv.findElement(By.cssSelector("input[placeholder='Last Name']"));
		lastname.sendKeys("manager");
		act.moveToElement(lastname).doubleClick().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
	}

}
