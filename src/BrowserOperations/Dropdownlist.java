package BrowserOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) {

		String S1 = "F:\\java\\workspace\\Selenium practice\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", S1);
		WebDriver W1 = new FirefoxDriver();
		W1.manage().window().maximize();
		W1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		W1.get("https://demosite.executeautomation.com/");
		
		W1.findElement(By.name("UserName")).sendKeys("execution");
		W1.findElement(By.name("Password")).sendKeys("admin");
		W1.findElement(By.xpath("//input[@name='Login']")).click();
		

		WebElement dropdownList=W1.findElement(By.id("TitleId"));

		Select s1 =new Select( dropdownList);
		System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
		List<WebElement> option =s1.getOptions();
		System.out.println("Options count:"+option.size());
		for(int i=0;i<option.size();i++) {
			System.out.println(option.get(i).getText());
		}
		
		String s2=s1.getFirstSelectedOption().getText();
		System.out.println(s2);
		
		s1.selectByVisibleText("Mr.");
		System.out.println(s1.getFirstSelectedOption().getText());
		//W1.close();				

		
		

		
		
		
	}

}
