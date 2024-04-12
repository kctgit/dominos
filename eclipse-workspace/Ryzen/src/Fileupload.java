import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Kavin Chander T\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String path= "C:\\Users\\Kavin Chander T\\Documents\\sugan.doc";
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"register_Layer\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[1]/div[2]/p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).click();
		Robot rb= new Robot();
		rb.setAutoDelay(3000);
		StringSelection selection = new StringSelection(path);
		
		if(path.endsWith(".doc"))
		{
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,selection);
		}
		else if(path.endsWith(".docx"))
		{
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,selection);
		}
		else {
			System.out.println("not a precise file");
		}
				
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
