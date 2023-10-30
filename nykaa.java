package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nykaa {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		
		//search
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oréal Paris");
	
		//click on loreal paris
		driver.findElement(By.xpath("//a[contains(text(),'Paris')]")).click();
		
		//print the title
		System.out.println(driver.getTitle());

		
			
		//click on top rated in sort by
			driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
			driver.findElement(By.xpath("//span[text()='customer top rated']/following::div")).click();
		//category...	
			driver.findElement(By.xpath("//span[text()='Category']")).click();
			driver.findElement(By.xpath("//span[text()='Hair']")).click();
			driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
			driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
			
		//
			driver.findElement(By.xpath("//span[text()='Concern']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
			
//			 Filter is applied with Shampoo
			System.out.println("Applied filter : "+driver.findElement(By.xpath("//span[@class='filter-value']"))
			.getText());
			
			Thread.sleep(3000);
//			 Click on L'Oreal Paris Colour Protect Shampoo
			driver.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
			
//			 GO to the new window and select size as 175ml
			Set<String> newWindow = driver.getWindowHandles();
			List<String> productWindow = new ArrayList<String>(newWindow);
			driver.switchTo().window(productWindow.get(1));
			driver.findElement(By.xpath("//span[text()='180ml']")).click();
			
//			 Print the MRP of the product
			System.out.println("MRP: "+driver.findElement(By.xpath("//span[text()='MRP:']/following::span")).getText());
			
//			 Click on ADD to BAG
			driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
			
//			 Go to Shopping Bag 
			driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
			
//			 Print the Grand Total amount
			driver.switchTo().frame(0);
			Thread.sleep(3000);
			String price = driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span")).getText();
			int grandTotal = convertToInt(price);
			System.out.println("Grand Total: "+grandTotal);
			
//			 Click Proceed
	        Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Proceed']")).click();
			
//			 Click on Continue as Guest
			driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
			
//			 Check if this grand total is the same in step 14
			driver.findElement(By.xpath("//div[@data-testid='back_button']")).click();
			driver.findElement(By.xpath("(//span[@data-testid='end-icon'])[2]")).click();
			String price2= driver.findElement(By.xpath("(//div[@class='css-vlqrtx e1d9ugpt3'])[3]")).getText();
			int finalPrice = convertToInt(price2);
			System.out.println("Final price: "+finalPrice);
			
			if(grandTotal==finalPrice) {
				System.out.println("Price is validated");
			}else {
				System.out.println("Price is mismatching");
			}
//			 Close all windows
			driver.quit();
		}
		
		public static int convertToInt(String a) {
			String replaceAll = a.replaceAll("\\D", "");
			int parseInt = Integer.parseInt(replaceAll);
			
			return parseInt ;
		}
	
}



