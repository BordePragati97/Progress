package Assignments;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign21 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		Actions act = new Actions(driver);
		List<WebElement> mainMenu=driver.findElements(By.cssSelector(".ds-bg-fill-navbar .ds-flex-row>div.ds-popper-wrapper>a"));
		for(int i=0;i<mainMenu.size();i++) {
			try {
				driver.findElement(By.xpath("//button[text()='Not Now']")).click();
			}catch(NoSuchElementException e) {
				
			}
			System.out.println("***************"+mainMenu.get(i).getText()+"**************");
			act.moveToElement(mainMenu.get(i)).perform();
			Thread.sleep(1000);
			List<WebElement> subMenu=driver.findElements(By.xpath("//ul[contains(@class,'ds-overflow-ellipsis')]/li/a/span"));
			if(subMenu.size()>0) {
				for(int j=0;j<subMenu.size();j++) {
					subMenu=driver.findElements(By.xpath("//ul[contains(@class,'ds-overflow-ellipsis')]/li/a/span"));
					try {
						System.out.println(subMenu.get(j).getText());
					}catch(StaleElementReferenceException e) {
						driver.navigate().refresh();
						act.moveToElement(mainMenu.get(i)).perform();
						Thread.sleep(1000);
						subMenu=driver.findElements(By.xpath("//ul[contains(@class,'ds-overflow-ellipsis')]/li/a/span"));
						System.out.println(subMenu.get(j).getText());
					}
				}
			}
		}
	}

}
