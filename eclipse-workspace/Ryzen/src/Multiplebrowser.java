import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplebrowser {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner (System.in);
		System.out.println("Enter the browser name");
		String Browse=ip.nextLine();
		WebDriver d1=null ;
		if(Browse.equals("chrome"))
		{
			d1= new ChromeDriver ();
			d1.get("https://www.hp.com/in-en/shop/?intel_sem&gad_source=1&gclid=EAIaIQobChMI2um0kueThQMV6zCDAx19eAzuEAAYASAAEgJqWfD_BwE&gclsrc=aw.ds/");
			d1.manage().window().maximize();
			d1.manage().deleteAllCookies();
			d1.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("ryzen");
		}
		else if(Browse.equals("firefox"))
		{
			d1= new FirefoxDriver ();
			d1.get("https://www.tcs.com/");
			
		}
		else System.out.println("Invalid Browser");	
		

	}
	

}
