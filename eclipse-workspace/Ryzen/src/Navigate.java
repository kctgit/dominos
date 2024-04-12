import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        
       	
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.co.uk/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.canva.com/");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
        driver.quit();
        //driver.close();
        
//Windows manage-dimension class, scanner class , navigate class ,deleteallcookies, point class
//Navigation-back,forward,refresh,deletecookies
		//Windowshandle, rapher class, collections-list,set,hash
		
	}

}
