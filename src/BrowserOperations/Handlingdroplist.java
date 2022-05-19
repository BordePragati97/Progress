package BrowserOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdroplist {

	public static void main(String[] args) {

		String S1 = "F:\\java\\workspace\\Selenium practice\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", S1);
		WebDriver W1 = new FirefoxDriver();
		W1.manage().window().maximize();
		W1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		W1.get("http://demo.automationtesting.in/Register.html");
		

		WebElement dropdownList=W1.findElement(By.id("Skills"));

		Select s1 =new Select( dropdownList);
		System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());

		System.out.println("Get first selected option:"+s1.getFirstSelectedOption().getText());
		
		List<WebElement> option =s1.getOptions();
		System.out.println("Options count:"+option.size());
		for(int i=0;i<option.size();i++) {
			System.out.println("Options"+i+":"+option.get(i).getText());
		}
		s1.selectByIndex(4);
		s1.selectByValue("Backup Management");
		s1.selectByVisibleText("Analytics");
		
		
		
		
		
		
		
		
	}

}
