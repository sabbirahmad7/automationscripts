package webdriver;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.walmart.com/account/signup?returnUrl=%2Faccount%3Fr%3Dyes");
		driver.findElement(By.cssSelector("input[id*='first-name-su']")).sendKeys("SA");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("ah");
		
		
		// this .contains for xpath
		
		
		/*driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("a");
		
		driver.findElement(By.xpath("//input[@id='last-name-su']")).sendKeys("b");
		driver.findElement(By.cssSelector("input#password-su")).sendKeys("123344");
		//driver.findElement(By.xpath("//input[@type='email')]")).sendKeys(args);;
		driver.findElement(By.xpath("//button[@type='submit')]")).click();*/
	
	/*	//driver.findElement(By.xpath("//input[@id='u_0_b')]")).click();
		//Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ahmadsabbir5@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mailfb5@");
		Thread.sleep(300);
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
	}

	
}
