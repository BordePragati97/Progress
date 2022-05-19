package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign15 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		driver.get("https://www.redbus.in/");
		
		WebElement from=driver.findElement(By.cssSelector("#src"));
		from.sendKeys("Pune");
		
		WebElement from1=driver.findElement(By.cssSelector(".homeSearch>li:nth-child(1)"));
		from1.click();
		
		WebElement to=driver.findElement(By.cssSelector("#dest"));
		to.sendKeys("Goa");
		
        WebElement to1=driver.findElement(By.cssSelector(".selected"));
	    to1.click();
		
		
		WebElement logo=driver.findElement(By.cssSelector("#onward_cal"));
		logo.click();
		
		WebElement calender=driver.findElement(By.cssSelector(".rb-monthHeader>td:nth-child(3)"));
		calender.click();
		
		WebElement date=driver.findElement(By.cssSelector(".last>tbody>tr:nth-child(5)>td:nth-child(1)"));
		date.click();
		
		WebElement search=driver.findElement(By.cssSelector(".button:nth-of-type(1)"));
		search.click();
		
		
		driver.findElement(By.xpath("//div[@class='close-primo']")).click();
		
		 
		WebElement afterpm=driver.findElement(By.cssSelector(".dt-time-filter>li:nth-child(4)"));
		afterpm.click();
		
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		   

		WebElement Acbus=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		Acbus.click();			
			
		List<WebElement> foundedbus=driver.findElements(By.cssSelector(".column-two>div:nth-child(1)"));
		WebElement main =driver.findElement(By.xpath("//body"));
     	for(int i=0;i<15;i++) {
		main.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		}
		System.out.println("founded no of buses:"+foundedbus.size());
		for(int j=1;j<foundedbus.size();j++) {
			System.out.println(foundedbus.get(j).getText());
		}
		
		
		
	
		
		
	}

}
