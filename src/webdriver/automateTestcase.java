package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateTestcase {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("#firstName")).sendKeys("sa97");
			driver.findElement(By.cssSelector("#lastName")).sendKeys("A");
			driver.findElement(By.name("Username")).sendKeys("sa97qa@gmail.com");
			driver.findElement(By.name("Passwd")).sendKeys("Automation2021!");
			driver.findElement(By.name("ConfirmPasswd")).sendKeys("Automation2021!");
			driver.findElement(By.cssSelector("#accountDetailsNext > div > button > div.VfPpkd-RLmnJb")).click();

			
			//driver.get(");
			//driver.findElement(By.xpath("//*[@id=\"countryList\"]/div[1]/div[1]/div[1]")).submit();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@id='phoneNumberId']")).sendKeys("3474186882");
			
			driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.zQJV3 > div > div.qhFLie > div > div > button > div.VfPpkd-RLmnJb")).click();
			//driver.findElement(By.name("code")).s
			
			//driver.findElement(By.cssSelector("#btnNext")).click();
			
			
			
	
			
			
			//driver.findElement(By.cssSelector("#username")).sendKeys("sa97");
			
			
			
			
			
			
			

	}

}
