package week7.day3;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

public class MergeLeaftap {
	public static void main(String[] args) throws InterruptedException {
     
		ChromeDriver driver = new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the web
		driver.manage().window().maximize();
		
		//Enter the username as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the pswd as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//String text = driver.findElement(By.tagName("h2")).getText();
		//click CRM/SFA using linkText
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//merge
		driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
		//from lead
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
		
		//To get child window
		Set<String> childWindow = driver.getWindowHandles();
		
		List<String> openWindow = new ArrayList<String>(childWindow);
		//move the control to child
		driver.switchTo().window(openWindow.get(1));
		
		//resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
		//move the control to parent
		driver.switchTo().window(openWindow.get(0));
		
		//To lead
		driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
		
		//window handles
		Set<String> childWindow1 = driver.getWindowHandles();
		List<String> openWindow1 = new ArrayList<String>(childWindow1);
		
		//to move the control to child - to lead
		driver.switchTo().window(openWindow1.get(1));
		Thread.sleep(3000);
		//resulting lead for To lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/following::a[11]")).click();
		
		
		// move to parent - to lead
	    driver.switchTo().window(openWindow1.get(0));
	    
	    //merge
	    driver.findElement(By.xpath("//a[text()='Merge']")).click();
	    
	    //alert
	    driver.switchTo().alert().accept();
		
		
		
	}

}
