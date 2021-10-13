package review.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithPani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Configure Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\emma.morales.DLIFLC\\OneDrive - Defense Language Institute Foreign Language Center\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
		/*
		//Maximize Browser
		driver.manage().window().maximize();
		driver.close();*/
	}

	public void browserConfig(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\emma.morales.DLIFLC\\OneDrive - Defense Language Institute Foreign Language Center\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched Successful");
		
		
	}

	
}
