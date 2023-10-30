package assignments3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		//2 Go to Mens fashion
		driver.findElement(By.xpath("//span[@class='catText']")).click();
		
		//3. Go to sports shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		//4.Get the count of the sports shoes
		String shoeCount = driver.findElement(By.xpath("//h1[contains(text(),'Sports Shoes for Men')]/following::span")).getText();
		System.out.println(shoeCount);
		
		//5. Click training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//6. sort by low to high
         driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
         driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		
		//7. check if the items displayed are sorted correctly
         
         
		//8. select the price range (900-1200)
         WebElement fromValue = driver.findElement(By.xpath("//input[@name='fromVal']"));
         fromValue.clear();
         fromValue.sendKeys("900");
         
         WebElement toValue = driver.findElement(By.xpath("//input[@name='toVal']"));
         toValue.clear();
         toValue.sendKeys("1200");
         driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
         
		//9. filter with color navy
         Thread.sleep(3000);
         driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
         
         
		//10. verify the all applied filters
         List<WebElement> appliedfilter = driver.findElements(By.xpath("//div[@class='navFiltersPill']"));
         for(int i=0;i<appliedfilter.size();i++) {
        	 System.out.println(appliedfilter.get(i).getText());
         }
         
		//11. mouse hover on first resulting training shoes
         Actions resulting = new Actions(driver);
         WebElement firstresulting = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
         resulting.moveToElement(firstresulting).perform();
         
		//12. click quickview button
         driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
                  
		//13 print the cost and the discount percentage
         Thread.sleep(3000);
        String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
        System.out.println("cost" +cost);
        String dis = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
        System.out.println("Discoung" +dis);
             
		//14 take the snapshot of the shoes
        File snapshot = driver.getScreenshotAs(OutputType.FILE);
        File snap = new File("./snap/001.jpg");
        FileUtils.copyFile(snapshot, snap);
        
        
		//15 close the current and main widow
        //driver.close();
        //driver.quit();
		
	}

}
