package BaseLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();

		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	 //   JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)", " ");
	
		
		
		//action.clickAndHold(Sourece);
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement Sourece = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement Target = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(Sourece, Target).perform();
//		action.moveToElement(Target);
//		action.pause(3000);
//		action.release();
//		action.build();
//		action.perform();
	}

	
	}
