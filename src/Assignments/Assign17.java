package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign17 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver drv= new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		drv.get("https://www.moneycontrol.com/");
		
		WebElement mutualfunds=drv.findElement(By.cssSelector(".main_nav>li:nth-of-type(8)"));
		mutualfunds.click();
		
	List<WebElement >fundsname=drv.findElements(By.cssSelector("#tbequity:nth-child(1)>div>div>div>div>table:nth-child(1)>tbody>tr>td:nth-child(1)"));
	List<WebElement >Ratings=drv.findElements(By.cssSelector("#tbequity:nth-child(1)>div>div>div>div>table:nth-child(1)>tbody>tr>td:nth-child(2)"));
	
	System.out.println("Size:"+fundsname.size());
	
	for(int i=0;i<fundsname.size();i++) {
		System.out.println(fundsname.get(i).getText());
		System.out.println(Ratings.get(i).getText());
		
		
	}
		
		
		
	}

}
