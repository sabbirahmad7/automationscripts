package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();
		// returns whether the webelement is there
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		//stores variavble  email of WebElement class 
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		if(email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("ahmadsabbir5@gmail.com");
		}
		if(pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys("Fbpasswd5%");
		}*/
		driver.get("http://demo.automationtesting.in/Register.html");
		//male
		//driver.findElement(By.)
		System.out.println(driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[1]/input")).isSelected());
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")));
		
		
	}

}
