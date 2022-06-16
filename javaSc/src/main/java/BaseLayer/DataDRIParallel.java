package BaseLayer;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDRIParallel {

	
		WebDriver driver;
		
		
		
		@Test(dataProvider="loginData")
		public void loginTest(String username,String password) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
			driver.get("https://www.saucedemo.com/");
			
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login-button")).click();
		}
			//String ac=driver.getTitle();
			//System.out.println("Title is"  + ac);
		
	
		@DataProvider(name="loginData",parallel=true)
		public String [] [] getData()
		
		{
			String loginData[][]= {
					
					{"standard_user","secret_sauce",},
					{"locked_out_user","secret_sauce",},
					{"problem_user","secret_sauce",}
					
			};
			return loginData;
		}
		
		@AfterClass
		void tearDown() throws InterruptedException {
			Thread.sleep(5000);
			driver.close();
		}
		}
		
		
	
