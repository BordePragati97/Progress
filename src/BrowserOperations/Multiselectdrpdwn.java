package BrowserOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdrpdwn {

	public static void main(String[] args) {

		String S1 = "F:\\java\\workspace\\Selenium practice\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", S1);
		WebDriver W1 = new FirefoxDriver();
		W1.manage().window().maximize();
		W1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		W1.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		

		W1.switchTo().frame("iframeResult");
		WebElement Multiselect=W1.findElement(By.name("cars"));
		
		Select s1 =  new Select( Multiselect);
		System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
		
		List<WebElement> options=s1.getOptions();
		System.out.println("Option  count: "+options.size());
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		s1.selectByVisibleText("Volvo"); //or
		s1.selectByValue("opel");//or
		s1.selectByIndex(3);
		
		List<WebElement> selectedOption=s1.getAllSelectedOptions();
		System.out.println(selectedOption.size());
		for(int i=0;i<selectedOption.size();i++) {
			System.out.println(selectedOption.get(i).getText());
		}
		
		//s1.deselectByVisibleText("Volvo"); //or
		//s1.deselectByValue("html");//or
	    //s1.deselectByIndex(7);
		s1.deselectAll();	
		//W1.close();
		
		
	}

}
