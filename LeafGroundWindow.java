package Assignment2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindow {

	public static void main(String[] args) {
			
		   ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://leafground.com/window.xhtml");
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.xpath("//h5[contains(text(),'Confirm new Window')]/following::span")).click();
	       
	       Set<String> openedWindow = driver.getWindowHandles();
           List<String> newWindow = new ArrayList<String>(openedWindow);
           
           driver.switchTo().window(newWindow.get(1));
           
           System.out.println("New Window Title : " +driver.getTitle());
           driver.close();
           
           driver.switchTo().window(newWindow.get(0));
           
          
           driver.findElement(By.xpath("//h5[contains(text(),'opened tabs')]/following::span")).click();
	       
	       Set<String> openTabs = driver.getWindowHandles();
           List<String> count = new ArrayList<String>(openTabs);
           
           System.out.println("Number of opened tabs:" +count.size());
           driver.switchTo().window(count.get(1)).close();
           driver.switchTo().window(count.get(2)).close();
           driver.switchTo().window(count.get(0));
           //primary
           
           driver.findElement(By.xpath("//h5[contains(text(),'except Primary')]/following::span")).click();
	       
	       Set<String> ExceptPrimary = driver.getWindowHandles();
           List<String> closeWindow = new ArrayList<String>(ExceptPrimary);
           
           System.out.println("Number of windows to be closed :" +(closeWindow.size()-1));
           
           int i=1;
           while(i<closeWindow.size()) {
           driver.switchTo().window(closeWindow.get(i)).close();
           i++;
           }
           driver.switchTo().window(closeWindow.get(0));
           

          
           driver.findElement(By.xpath("//h5[contains(text(),'Wait for 2')]/following::span")).click();
           
           Set<String> Delay = driver.getWindowHandles();
           List<String> Window = new ArrayList<String>(Delay);
           System.out.println("Wait Window 1 : " +driver.switchTo().window(Window.get(1)).getTitle());
           System.out.println("Wait Window 2 : " +driver.switchTo().window(Window.get(2)).getTitle());
           
           driver.quit();
	}

}