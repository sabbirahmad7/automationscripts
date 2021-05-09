package webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
	
		
		/*driver.findElement(By.id("email")).sendKeys("ahmadsabbir5@gmail.com");
		//driver.findElement(By.name("btnNext")).click();
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("");
		
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Forgot Password?")).click();;
		driver.findElement(By.cssSelector("#u_2_b")).sendKeys("Toby");*/
		//driver.findElement(null)
		driver.findElement(By.name("firstname")).sendKeys("sa");
		driver.findElement(By.name("lastname")).sendKeys("qa");
		
		WebElement element = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select m = new Select(element);
		Select d  = new Select(day);
		Select y = new Select(year);
		
		
		//m.selectByValue("2");
		
		m.selectByIndex(8);
		d.selectByVisibleText("10");
		y.selectByValue("2019");
		
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]")).isSelected());
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]")).click();;

	//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]")).isSelected());
		
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]")).isSelected()); 
		//works with rashid'S> i just needed to change the * to input
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]")).isSelected());

				

		
		
		
		//driver.findElement(By.xpath(.click();
		//after selection
	  //driver.findElement(By.xpath("//span[contains(@id='u_0_10_pZ')]")).click();
		
		/*List orglist = new ArrayList();
		
	List<WebElement> mon= 	m.getOptions();
	for(WebElement e : mon) {
		e.getText();
		System.out.println(e);*/
		// child and parents locator 
		//driver.findElement(By.xpath("//"))
	}
	
	
	
		
	}


