package week6.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyTheValue {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'URBAN FIT X SMART')]")).click();
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']"));
		pincode.sendKeys("625009"); 
	    driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']/input")).click();
	    driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	    driver.findElement(By.xpath("//a[text()='View Cart']")).click();
	    driver.findElement(By.xpath("//button[@class='btn harman_btn4']/span")).click();
	    Alert alert = driver.switchTo().alert();
	    alert.accept();

}
}
