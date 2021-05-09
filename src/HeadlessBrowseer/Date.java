package HeadlessBrowseer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Date {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[2]/a[@value='HYD']")).click();
		
	    
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//li/a[@value='GOI']")).click();
		// is it dynamic
	   
		//driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();// element not interactable 
		
		//driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[1]/li[7]/a)[2]")).click();// works but not dynamic
		
		
		Thread.sleep(500);
		
		//WebElement fromdate = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));

		/*String departDate = "31 June 2021";
		String departDateArr[] = departDate.split(" ");
		String month_year = departDateArr[1]+" "+departDateArr[2];
		  String day = departDateArr[0];
		  selectDate(month_year,day);
		//driver.findElement(By.xpath("//div//input[@id='ctl00_mainContent_view_date1']")).click();// not interactable 
		//driver.findElement(By.xpath("//tbody[1]")).click();*/
		

		//driver.findElement(By.xpath("(//div[@id='ui-datepicker-div']//div[@class='ui-datepicker-title'])[1]")).click();
		WebElement DateWidget = driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> columns = DateWidget.findElements(By.tagName("td"));// find column elements in the table 
		
		for (WebElement cell: columns)
		{
			if (cell.getText().equals("24"))
			{
				cell.findElement(By.linkText("24")).click();
				break;
			}
		}
		//driver.findElement(By.xpath("//tbody")).click();
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(300);

		Assert.assertTrue(driver.findElement(By.xpath("//span[@onclick='StoreSpanamnt()' and @class='button-continue-text']")).isEnabled());
		//whether the continue button is working or not
		driver.findElement(By.xpath("//span[@onclick='StoreSpanamnt()' and @class='button-continue-text']")).click();
		//continue button
		driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxFirstName']")).sendKeys("sa");
		Assert.assertFalse(driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_CheckBoxPromoOpt")).isSelected());
		
		//*[@id="dropdownGroup1"]/div/ul[2]/li[4]/a
		
		//driver.findElement(By.xpath(""))
	}
	 /* private static void selectDate(String month_year,String day) throws InterruptedException{
		  WebDriver driver = new ChromeDriver();
		  List<WebElement> elements = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[@class='ui-datepicker-title']"));
		    
		    for(int i=0;i<elements.size();i++){
		     String elementText = elements.get(i).getText();
		     if(elementText.equals(month_year)){
		      List<WebElement> days = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[contains(@class,'ui-datepicker-group')]["+(i+1)+"]/table/tbody/tr/td/a"));
		      for(WebElement d : days){
		       if(d.getText().equals(day)){
		        d.click();
		        return;
		       }
		      }
		     }
		    }
		    
		    driver.findElement(By.xpath("//div//a[@title='Next']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//div//a[@title='Next']")).click();
		    Thread.sleep(2000);
		    selectDate(month_year,day);
		   }*/


}
