package review.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LocatorsHandson {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Browser Configuration
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		
		//Create an object for the browser
		WebDriver driver = new ChromeDriver();
		
		//Launch url
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		//driver.findElement(By.id("user-message")).sendKeys("The Lord is my salvation, whom shall I fear!");
		//driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		//String text = driver.findElement(By.id("display")).getText();
		//System.out.println(text);
		
		//driver.findElement(By.xpath(//button[@class='btn btn-default']))[2];-----?
		//driver.findElement(By.xpath//button[@class='btn btn-default'])[2];
		//driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("Amazon",Keys.ENTER);

		//driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		//driver.findElement(By.id("myTable"));-------? why search class element if Id exists
		
		//driver.get("https://www.amazon.in/");
		//driver.findElement(By.linkText("Fashion")).click();
		
		/*To select dropdown
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement dropdown = driver.findElement(By.id("select-demo"));
		Select value = new Select(dropdown);
		value.selectByVisibleText("Wednesday");
		Thread.sleep(1000);
		value.selectByIndex(5);//The 5th position is Thursday
		List<WebElement> alloptions = value.getOptions();
		System.out.println("# of values in dropdow: "+ alloptions.size());*/
		
		/*To print each value in the dropdow
		for(WebElement eachelement:alloptions)
		{
			System.out.println(eachelement.getText());
		}*/
		
		/*To select a single checkbox
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.findElement(By.id("isAgeSelected")).click();*/
		
		/*Multiple checkbox, get the common attribute, store in a list, then iterative
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
		System.out.println(checkboxes.size());//Pany to provide syntax*/
		
		//To select radio button
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.findElement(By.xpath("(//input[@value='Female'])[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
