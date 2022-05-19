package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign22 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://etrain.info/current-booking");
		WebElement T1 = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		T1.sendKeys("PUNE");

		WebElement T2 = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		T2.sendKeys("LTT");

		WebElement D2 = driver.findElement(By.xpath("//div[@id='suggest_row1']"));
		D2.click();

		WebElement D3 = driver.findElement(By.xpath("//button[@class='cbaexformbtngo donthide wAuto pd5']"));
		D3.click();

		List<WebElement> trains = driver.findElements(By.cssSelector(".atbl>table>tbody>tr:nth-child(1)>td>span"));
		System.out.println("no. of trains:" + trains.size());
		List<WebElement> trains1 = driver.findElements(By.cssSelector(".atbl>table>tbody>tr:nth-child(1)>td"));

		for (int i = 0; i < trains1.size(); i++) {
			System.out.println(trains1.get(i).getText());
		}

	}

}
