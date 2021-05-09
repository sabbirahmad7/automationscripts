package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?r=101");
		//driver.findElement(By.name("firstname")).sendKeys("sa");
		//driver.findElement(By.name("lastname")).sendKeys("ah");
		//driver.findElement(By.xpath("//@(id,'u_0_s_w')]")).isSelected();
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]")).isSelected());
		
		driver.findElement(By.xpath("//input[contains(@)id,'u_0_6')]")).click();

	//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]")).isSelected());
		
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='u_0_6']")).isSelected());

				

		
		


		
	}

}
