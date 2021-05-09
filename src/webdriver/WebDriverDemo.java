package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();// we got chromedriver from webdriver interface who have the methods
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());// to know where we are
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		driver.close();
		
		//driver.findElement(By.id("input")).sendKeys("Rose");
		//OPEN chrome
		//in url www.google.com
		//verify google home
	}

}
