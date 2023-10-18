package week6.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0wp4yggz5ikn51wjgrja8jnf8p540318.node0");
		driver.manage().window().maximize();
		//simple
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		//confirm alert
	    driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following::span")).click();
	    Alert confirmAlert = driver.switchTo().alert();
	    confirmAlert.dismiss();
	    //prompt alert
	    driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span")).click();
	    Thread.sleep(4000);
	    Alert promptAlert = driver.switchTo().alert();
	    promptAlert.sendKeys("Shalini");
	    promptAlert.accept();
	    
	    //Sweet Alert
	   driver.findElement(By.xpath("//h5[contains(text(),'Sweet Alert (Confirmation)')]/following::span")).click();
	   driver.findElement(By.xpath("//span[text()='Yes']")).click();
	  // Alert sweetAlert = driver.switchTo().alert();
	   //sweetAlert.accept();
	   
	    

	}

}
