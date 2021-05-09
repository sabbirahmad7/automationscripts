package HeadlessBrowseer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.findElement(By.xpath("//*[@id=\"widgets-view-email-modal-mount\"]/div/div/div[1]/div/div/div/div/button")).click();
		//close button
		driver.findElement(By.linkText("Deal of the Day")).click();
		driver.findElement(By.linkText("KitchenAid - Pasta Cutter and Fresh Prep Attachment Bundle - White/Metal")).click();
		//dynamically changing but unable to dynamic webelement with linktext
		Thread.sleep(200);
		String bb = driver.findElement(By.tagName("h1")).getText();
		System.out.println(bb);
		driver.navigate().to("https://www.bestbuy.com/site/misc/deal-of-the-day/pcmcat248000050016.c?id=pcmcat248000050016");
		Thread.sleep(200);
		driver.findElement(By.xpath("//span[@id='wf-offer-9512cc26-4771-493a-862d-ac3163c9e815-product-title']")).click();
		//String mario = driver.findElement(By.tagName("h1")).getText();
		String mario = driver.findElement(By.xpath("//div[@itemprop='name']")).getText();
	System.out.println(mario);
	
	Thread.sleep(200);
	driver.findElement(By.xpath("//*[@data-sku-id='6451224']")).click();
	

		

	}

}
