package BrowserOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOp1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver drv=new ChromeDriver();	
		drv.get("https://www.globalsqa.com/demo-site/");
		List<WebElement> mainmenu=drv.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		Actions act=new Actions(drv);
    	for(int i=0;i<mainmenu.size();i++) {
		WebElement option=mainmenu.get(i);
		act.moveToElement(option).perform();
		Thread.sleep(1000);
    	}
    	mouseHover(act, mainmenu);
		
    			//mouseHoverWithCords(act, mainmenu);
    			
    			//rightClick(act, mainmenu.get(1));
    			
    		}
    		static void rightClick(Actions act,WebElement option) throws InterruptedException {
    			System.out.println("Option name is : "+option.getText());
    			act.moveToElement(option).contextClick().build().perform();
    			
    		}
    		static void mouseHoverWithCords(Actions act,List<WebElement> mainMenu) throws InterruptedException {
    			WebElement option=mainMenu.get(1);
    			System.out.println("Option name is : "+option.getText());
    			act.moveToElement(option, 100, 0).perform();
    		}
    		static void mouseHover(Actions act,List<WebElement> mainMenu) throws InterruptedException {
    			for(int i=0;i<mainMenu.size();i++) {
    				WebElement option=mainMenu.get(i);
        			System.out.println("Option name is : "+option.getText());
                    act.moveToElement(option).perform();
    				Thread.sleep(1000);
    			}
    		
		
		
		
		
		
	}

}
