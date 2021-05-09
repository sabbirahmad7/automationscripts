package HeadlessBrowseer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		// everything should happend at backend 
		//set Chromeoptions class
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true); // test the headless
		options.addArguments("--headless");// another way of setting headless property
		
		WebDriver driver = new ChromeDriver(options);//// makes chrome browser headless
		driver.get("https://www.google.com/");
		driver.getTitle();
		
		System.out.println("Title of page :"+ driver.getTitle());
		System.out.println("Title :"+driver.getClass());
		

	}

}
