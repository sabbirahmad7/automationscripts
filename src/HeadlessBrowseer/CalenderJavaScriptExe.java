package HeadlessBrowseer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderJavaScriptExe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
			// dynamic time wait
			driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
		
			WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
			String dateval = "20-02-2021";
			selectDayJs(driver,date,dateval);
			
	}
	public static void selectDayJs(WebDriver driver,WebElement js, String dateval) {
		
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		WebElement date1 = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		// casting driver to JSE
		je.executeScript("arguments[0].setAttritube('value','"+dateval+"');", date1);
	}

}
