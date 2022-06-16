package BaseLayer;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	
	
	@Test
	public void logintest() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS)	;
	
	
	driver.get("https://www.flipkart.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("total link "+ links.size());
	//int count=links.size();
	//System.out.println(count);
	
	for(int i=0; i<links.size();i++)
	{
		System.out.println("links all"+links.get(i).getAttribute("href"));
	//	System.out.println(driver.findElement(By.tagName("a")).getText());
	}
	
	
//	WebElement day =driver.findElement(By.id("day"));
//		Select sel = new Select(day);
//		sel.selectByVisibleText("19");
//		
//		WebElement month = driver.findElement(By.id("month"));
//		Select sel1 = new Select(month);
//		sel1.selectByVisibleText("May");
//		
//		
//		
//		WebElement ab = sel.getFirstSelectedOption();
//		String da =ab.getText();
//		System.out.println(da);
//		if(da.equals("19"))
//		{
//			System.out.println("test pass");
//		}
//		else
//		{
//			System.out.println("TEST FAIL");
//		}
//		
//	driver.close();
}}

		
