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

public class DataDRI {

	
		WebDriver driver;
		
		@BeforeClass
		public void setup()
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		
		@Test(dataProvider="loginData1")
		public void loginTest(String username,String password) {
			
			driver.get("https://www.saucedemo.com/");
			
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login-button")).click();
			//String ac=driver.getTitle();
			//System.out.println("Title is"  + ac);
		
			
//			String exp="Swag Labs";
//			String ac=driver.getTitle();
//			System.out.println("Title is " + ac);
//			Assert.assertEquals(exp, ac);
		}
//			
//			if(exp.equals(ac))
//			{
//				
//				if(exp.equals(ac))
//				{
////					driver.findElement(By.id("react-burger-menu-btn")).click();
////					driver.findElement(By.id("logout_sidebar_link")).click();
//					
//				}
//				else
//				{
//					Assert.assertTrue(false);
//			
//				}}
//			else if(exp.equals(ac))
//			{
//				if(exp.equals(ac))
//				{
////					driver.findElement(By.id("react-burger-menu-btn")).click();
////					driver.findElement(By.id("logout_sidebar_link")).click();
//					Assert.assertTrue(true);
//				}
//				else
//				{
//					Assert.assertTrue(false);
//				}
//				}
//			}
//		
	
		@DataProvider(name="loginData1")
		public String [] [] getData()
		
		{
			String loginData[][]= {
					
					{"standard_user","secret_sauce"},
					{"locked_out_user","secret_sauce"},
					{"problem_user","secret_sauce"}
				
			};
			return loginData;
		}
		
		@AfterClass
		void tearDown() throws InterruptedException {
			Thread.sleep(5000);
			driver.close();
		}
		}
		


		
	
