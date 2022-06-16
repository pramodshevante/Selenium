package BaseLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	
		public static void main(String[] args) {
		//	System.setProperty("webdriver.chrome.driver",
		//			System.getProperty("user.dir") + "//AllBrowserDrivers//chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();

			JavascriptExecutor js =(JavascriptExecutor)driver;
			//js.executeScript("window.location='https://www.facebook.com/';");    //open url thrugh javaScript
			driver.get("https://www.facebook.com/");
			
			WebElement wb =driver.findElement(By.name("pass"));       
			WebElement wb1 =driver.findElement(By.name("email"));
			WebElement wb2 =driver.findElement(By.name("login"));
		
		
			
			
			js.executeScript("document.getElementById('email').value='Selenium Testing';");  // pass the value 
			js.executeScript("document.getElementById('pass').value='Selenium Testing';");


			js.executeScript("arguments[0].click();", wb2);   // click the value
			
			String a =js.executeScript("return document.title;").toString();  // get the title

			String actualUrl = js.executeScript("return document.URL;").toString();
			js.executeScript("history.go(0);");
			
			System.out.println(a);				//actual title
			System.out.println(actualUrl);		//actual URL
			
			Actions action = new Actions(driver);
		}

		private static Object findElement(By tagName) {
			// TODO Auto-generated method stub
			return null;
		}
		

}
		
	