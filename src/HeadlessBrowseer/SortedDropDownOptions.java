package HeadlessBrowseer;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class SortedDropDownOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement( By.id("select-demo"));
		Select se = new Select(element);
		
		List originallist = new ArrayList();
		
		java.util.List<WebElement> options = se.getOptions();// all the options from dropdown
		System.out.println(options);
		for(WebElement e :options) {
			originallist.add(e.getText());//capture text value from web element and add it to the  
			
			
		}
		System.out.println("orgiginal:"+originallist);
		Collections.sort(originallist);
		System.out.println("after:"+originallist);
		

	}

}
