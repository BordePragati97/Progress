package BrowserOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Hndlingmultiselctdrpdwn {

	public static void main(String[] args) {


		String S1 = "F:\\java\\workspace\\Selenium practice\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", S1);
		WebDriver W1 = new FirefoxDriver();
		W1.manage().window().maximize();
		W1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		W1.get("http://omayo.blogspot.com/");
		
		WebElement carDropdown=W1.findElement(By.id("multiselect1"));
		Select selectSkill=new Select(carDropdown);
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		
       // System.out.println("Already selectec option name: "+selectSkill.getFirstSelectedOption().getText());
		
		List<WebElement> options=selectSkill.getOptions();
		System.out.println("Option count is:"+options.size());
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
		 
		selectSkill.selectByIndex(0);
		selectSkill.selectByValue("Hyundaix");
		selectSkill.selectByVisibleText("Audi");
		
		List<WebElement> selectCars=selectSkill.getAllSelectedOptions();
		System.out.println("Selected car count: "+selectCars.size());
		
		selectSkill.deselectByIndex(0);
		selectSkill.deselectByValue("Hyundaix");
		selectSkill.deselectByVisibleText("Audi");
				//or
		//selectSkill.deselectAll();

		
		
		
		
		
		
	}

}
