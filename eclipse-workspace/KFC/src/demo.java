import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Kavin Chander T\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.redbus.in");
		
		driver.manage().window().maximize();
		
	WebElement from = driver.findElement(By.id("src"));
	from.sendKeys("tambaram");
	Thread.sleep(5000);
		driver.findElement(By.id("dest")).sendKeys("madurai");	
		Thread.sleep(3000);
		
		WebElement date=driver.findElement(By.id("onwardCal"));
		date.click();	
		Thread.sleep(5000);
		
		WebElement date1 = driver.findElement(By.xpath("(//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj'])[11]"));
	    date1.click();
	    driver.findElement(By.xpath("//button[@id='search_button']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class='g-button d-color fr']")).click();
	    
		

		
		
		
	}
}
