package HeadlessBrowseer;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
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
		/*WebElement DateWidget = driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> columns = DateWidget.findElements(By.tagName("td"));// find column elements in the table 
		
		for (WebElement cell: columns)
		{
			if (cell.getText().equals("24"))
			{
				cell.findElement(By.linkText("24")).click();
				break;
			}
		}*/
		/*driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id=\'dropdownGroup1\']/div/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[1]/a")).click();
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='Div1'])")).getText());
		//driver.findElement(By.xpath("//*[@id='Div1']/button)")).*/
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		

		Thread.sleep(500);
	

		driver.findElement(By.id("hrefIncAdt")).click();

		for (int i = 1; i < 4; i++) {

		driver.findElement(By.id("hrefIncAdt")).click();

		}

		int j = 0;
		driver.findElement(By.id("hrefIncInf")).click();

		while (j < 3) {
		driver.findElement(By.id("hrefIncInf")).click();
		j++;

		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	

		Thread.sleep(500);
		String txt = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText();
		System.out.println(txt);// // print out all values of dropdown

		WebElement e = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select op = new Select(e);
		
		op.selectByVisibleText("USD");

		//List<WebElement> country=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		driver.findElement(By.id("autosuggest")).sendKeys("ba");
		Thread.sleep(500);

		List<WebElement> country=driver.findElements(By.className("ui-menu-item"));


		for (WebElement option:country) {

		if (option.getText().equalsIgnoreCase("bangladesh")) {
			

			option.click();
		
	
			break;


		}

		

		}
		driver.findElement(By.xpath("//*[@type='submit']")).click();

}

			}
		



