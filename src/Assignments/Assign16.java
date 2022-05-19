package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign16 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.get("https://demo.actitime.com/login.do");
		
		String expected = "actiTIME - Login";
		String actual = driver.getTitle();
		if (actual.equals(expected)) {
			System.out.println("Login page open");
		} else {
			System.out.println("Login page not open or title incorrect");
		}
		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(2000);
		
		String actualhomepagetitle = driver.getTitle();
		System.out.println("Actual HomePage Title:" + actualhomepagetitle);
		String expectHptitle = "actiTIME - Enter Time-Track";
		if (actualhomepagetitle.equals(expectHptitle)) {
			System.out.println("Login successful and homepage title verified");
		} else {
			System.out.println("Login failed Homepage title  not verified");
		}

		WebElement P1=driver.findElement(By.cssSelector("#container_tasks"));
		P1.click();

		WebElement P2=driver.findElement(By.cssSelector(".downIcon"));
		P2.click();

		WebElement P3=driver.findElement(By.cssSelector(".addNewMenu>div:nth-child(3)"));
		P3.click();

		WebElement P4=driver.findElement(By.cssSelector(".selectCustomerRow>td>div>div"));
	    P4.click();

    	WebElement P5=driver.findElement(By.cssSelector(".selectCustomerRow>td>div>div>div>div>div>div>div:nth-child(1)"));
		P5.click();

		WebElement P6=driver.findElement(By.cssSelector(".selectCustomerRow>td>input"));
		P6.sendKeys("PragatiBorde");
		
		WebElement P7=driver.findElement(By.cssSelector(".selectProjectRow>td>input"));
		P7.sendKeys("Engineering");
		
		WebElement P8=driver.findElement(By.cssSelector(".nameCell input"));
		P8.sendKeys("Testing");
		
		WebElement P9=driver.findElement(By.cssSelector(".at-dropdown-list-btn-ct"));
		P9.click();
		
		WebElement P10=driver.findElement(By.cssSelector(".x-date-right"));
		P10.click();
		
		WebElement P11=driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-child(5)>td:nth-child(2)"));
		P11.click();
		
		WebElement P12=driver.findElement(By.cssSelector(".taskTable>div>table>tbody>tr:nth-child(1)>td:nth-child(5)"));
		P12.click();
		
		WebElement P13=driver.findElement(By.cssSelector(".taskTable>div>table>tbody>tr:nth-child(1)>td:nth-child(5)>div>div>div>div>div>div:nth-child(11)"));
		P13.click();
		
		WebElement P14=driver.findElement(By.cssSelector(".addToTTCell>label>input:nth-of-type(1)"));
		P14.click();
		
		WebElement P15=driver.findElement(By.cssSelector(".buttonsBox>div>div>div:nth-of-type(1)"));
		P15.click();
		
		WebElement P16=driver.findElement(By.cssSelector("div[title='Testing']"));
		String A=P16.getAttribute("title");
		if(A.equals("Testing")){
			System.out.println("Task is created");
			}
		else {
			
		}
		WebElement P17=driver.findElement(By.cssSelector(".taskRowsTable>tbody>tr>td:nth-child(1)"));
        P17.click();
		 
		WebElement P18=driver.findElement(By.cssSelector(".statusesListContainer>div:nth-child(1)>div>div:nth-child(3)"));
        P18.click();


	}

}
