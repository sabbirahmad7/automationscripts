package HeadlessBrowseer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();

			// In URL type WWW.google.com
			driver.get("https://rahulshettyacademy.com/dropdownsPractise");
			driver.manage().window().maximize();
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("hrefIncAdt")).click();

			for (int i = 1; i < 4; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();

			}

			int j = 0;

			while (j < 2) {
			driver.findElement(By.id("hrefIncChd")).click();
			j++;

			}

			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

			driver.findElement(By.id("autosuggest")).sendKeys("BA");

			Thread.sleep(500);

			//List<WebElement> country=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

			List<WebElement> country=driver.findElements(By.className("ui-menu-item"));


			for (WebElement option:country) {

			if (option.getText().equalsIgnoreCase("bangladesh")) {

			option.click();

			break;


			}


			}
			//selected or not
			
			Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
			//driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
			
			driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
			
			Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());//one way
			
			Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
			
			Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date1")).isEnabled());// date 1
			
		
			
			Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));
			// date 2 disabled
			System.out.println("Twoway System is disabled");
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			
			//Assert.assertTrue(driver.findElement(By.id("div1")).getAttribute("style")).contains("1"));
			
			Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
			System.out.println("Two way");
			
			// gotta do the if by myself with different elements 

			/*if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
				// what are the possible attributes we should look for
				 

				System.out.println("Twoway System is disabled");
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				
				
			} else 
				
		
				System.out.println("Test Fail");*/
			




			}

			
		 

			
		

	

}
