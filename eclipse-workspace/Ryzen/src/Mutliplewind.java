
			import java.util.Set;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		
		public class Mutliplewind {
		
			public static void main(String[] args)throws InterruptedException {
				// TODO Auto-generated method stub
		       WebDriver driver=new ChromeDriver();
		       driver.get("https://www.flipkart.com/");
		       driver.manage().window().maximize();
		       //driver.findElement(By.xpath("")).click();
		       String parentwin=driver.getWindowHandle();
		       System.out.println("Parent WIndow Id :"+parentwin);
		       //driver.navigate().back();
		       Thread.sleep(2000);
		       driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div/div/div/div/div/div/div/div[4]/div/div/div/a/div/div/div[1]/img"));
		       driver.quit();
		       
		       Set<String>allwinid=driver.getWindowHandles();
		       
		       for(String X:allwinid)
		       {
		    	   if(!parentwin.equals(X))
		    	   {
		    		   System.out.println("Child window :"+X);
		    		   driver.switchTo().window(X);
		    		   Thread.sleep(2000);
		    	   }
	}

	}

}
