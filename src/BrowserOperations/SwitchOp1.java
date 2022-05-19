package BrowserOperations;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchOp1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver drv=new ChromeDriver();	
		drv.get("https://demo.actitime.com/login.do");
		WebElement Webobj=drv.switchTo().activeElement();
		String activeobj=Webobj.getAttribute("placeholder");
		String expctedobj="Username";
		if(activeobj.equals(expctedobj)) {
			System.out.println("curson pointer validation is sucessful");
		}else {
			System.out.println("curson pointer validation is unsucessful");
		}

		Webobj.sendKeys("admin",Keys.TAB);
		drv.switchTo().activeElement().sendKeys("manager",Keys.ENTER);

		
		
		
	}

}
