package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MortgageCalculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.findElement(By.id("homeval")).clear();
		driver.findElement(By.id("homeval")).sendKeys("1000");
		driver.findElement(By.id("downpayment")).clear();
		driver.findElement(By.id("downpayment")).sendKeys("100");;
	
		driver.findElement(By.id("loanamt")).sendKeys("500");
		driver.findElement(By.cssSelector("#intrstsrate")).clear();
		driver.findElement(By.cssSelector("#intrstsrate")).sendKeys("2.5");
		driver.findElement(By.name("ratebutton")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.cssSelector("#cboxClose")).click();
		Thread.sleep(300);
		
		driver.findElement(By.id("loanterm")).sendKeys("10");
		driver.findElement(By
				.xpath("//*[@id='calc\']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[8]/select")).sendKeys("Mar");
		//dropdown
		
		driver.findElement(By.id("start_year")).sendKeys("2018");// dropdown
		driver.findElement(By.xpath("//*[@id='pptytax']")).sendKeys("20");
		driver.findElement(By.id("pmi")).sendKeys("1.5");
		driver.findElement(By.id("hoi")).sendKeys("10");
		driver.findElement(By.name("param[hoa]")).sendKeys("2");
		
		driver.findElement(By.
				xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[13]/select")).sendKeys("USDA");
		driver.findElement(By.
				xpath("//*[@id='calc\']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[16]/select")).sendKeys("Buy");
		driver.findElement(By.name("loantypebutton")).click();// 
		
		Thread.sleep(300);
		
		driver.findElement(By.id("cboxClose")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id='calc\']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[17]/input")).click();
		
		
		
		
		

	}

}
