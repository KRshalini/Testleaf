package assignments3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws IOException, InterruptedException {
		//.Load the URL https://www.amazon.in/
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//2.search as oneplus 9 pro 
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		ele1.sendKeys("oneplus 9 pro");
		ele1.click();
				
		//3.Get the price of the first product
		Thread.sleep(3000);
		String firstproduct = driver.findElement(By.xpath("//span[contains(text(),'(Refurbished) OnePlus 9 Pro 5G')]")).getText();
		System.out.println(firstproduct);
		
		//4. Print the number of customer ratings for the first displayed product
		String noOfCustomerratings = driver.findElement(By.xpath("//span[text()='2 out of 5']")).getText();
		System.out.println("The customer ratings " +noOfCustomerratings);
		
		//5. Click the first text link of the first image
		driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")).click();
		
		
		//6. Take a screen shot of the product displayed
		File snapshot = driver.getScreenshotAs(OutputType.FILE);
        File snap = new File("./snap/002.jpg");
        FileUtils.copyFile(snapshot, snap);
        
		//7. Click 'Add to Cart' button
        Set<String> window = driver.getWindowHandles();
        List<String> childWindow = new ArrayList<String>(window);
        driver.switchTo().window(childWindow.get(1));
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        
        
		//8. Get the cart subtotal and verify if it is correct.
        String carttotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
        System.out.println(carttotal);
        
        if(carttotal==firstproduct) {
        	System.out.println("Same and verifed");
        }
        else {
        	System.out.println("different");
        }
		//9.close the browser
        //driver.quit();
	}

}
