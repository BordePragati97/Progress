package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign18 {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		System.out.println( firstname.isDisplayed());
		System.out.println( firstname.isEnabled());
		firstname.sendKeys("Pragati");
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		System.out.println( Lastname.isDisplayed());
		System.out.println( Lastname.isEnabled());
		Lastname.sendKeys("Borde");
		
		WebElement Address=driver.findElement(By.cssSelector("#basicBootstrapForm>div>div>textarea"));
		System.out.println( Address.isDisplayed());
		System.out.println( Address.isEnabled());
		Address.sendKeys("At Pratapur,tal-Sangamner,Dist.-Ahmednagar.");
		
       WebElement Lang=driver.findElement(By.cssSelector(".ui-autocomplete-multiselect:nth-child(1)"));
		Lang.click();
	
	   List<WebElement> Lang1=driver.findElements(By.cssSelector(".ui-autocomplete>li"));
		System.out.println(Lang1.size());
		for(int i=0;i<Lang1.size();i++) {
			System.out.println(Lang1.get(i).getText());
		}
		Lang1.get(7).click();
		Lang1.get(15).click();		
		
		WebElement Mail=driver.findElement(By.xpath("//input[@type='email']"));
		System.out.println(  Mail.isDisplayed());
		System.out.println(  Mail.isEnabled());
		Mail.sendKeys("Pragati24@gamil.com");
		 
		WebElement Phone=driver.findElement(By.xpath("//input[@type='tel']"));
		System.out.println(Phone.isDisplayed());
		System.out.println(Phone.isEnabled());
		Phone.sendKeys("8594689278");
		
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		WebElement dropdownList=driver.findElement(By.id("Skills"));
		dropdownList.click();
        Select s1 =new Select( dropdownList);
    	System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
    	System.out.println("Get first selected option:"+s1.getFirstSelectedOption().getText());
        List<WebElement> options=s1.getOptions();
        System.out.println("Size of Options:"+options.size());
        for(int i=0;i<options.size();i++) {
        	System.out.println(options.get(i).getText());
        }
        options.get(38).click();
        driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
        driver.findElement(By.cssSelector(".select2-results>ul>li:nth-child(6)")).click();
     
		driver.findElement(By.xpath(" //select[@placeholder='Year']")).click();
		driver.findElement(By.xpath("//option[@value='1995']")).click();
		driver.findElement(By.xpath(" //select[@placeholder='Month']")).click();
		driver.findElement(By.xpath("//option[@value='February']")).click();
		driver.findElement(By.xpath(" //select[@placeholder='Day']")).click();
		driver.findElement(By.xpath("//option[@value='24']")).click();
	
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("pragati123");
		WebElement secpassword=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		secpassword.sendKeys("pragati123");
		driver.findElement(By.xpath("//button[@value='Refresh']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
       
        
        
        
        
        
        
        


		
		
		
		
	}

}
