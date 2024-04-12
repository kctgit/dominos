import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Meal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Kavin Chander T\\Downloads\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement user =driver.findElement(By.id("username"));
		user.sendKeys("dass2024");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Dass@9597");
		//driver.findElement(By.id("password")).clear();
		Thread.sleep(1000);
		WebElement login =driver.findElement(By.id("login"));
		login.click();		
        WebElement ds=driver.findElement(By.xpath("//*[@id=\"location\"]"));
		Select dropdown= new Select(ds);
		dropdown.selectByIndex(7);
		WebElement hotel=driver.findElement(By.xpath("//*[@id=\"hotels\"]"));
		Select dropdown1= new Select(hotel);
		dropdown1.selectByIndex(2);
		WebElement type=driver.findElement(By.xpath("//*[@id=\"room_type\"]"));
		Select dropdown2= new Select(type);
		dropdown2.selectByIndex(2);
		WebElement numb=driver.findElement(By.xpath("//*[@id=\"room_nos\"]"));
		Select dropdown3= new Select(numb);
		dropdown3.selectByIndex(3);
		WebElement checkin=driver.findElement(By.xpath("//*[@id=\"datepick_in\"]"));
		checkin.sendKeys("19/03/2024");
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"datepick_out\"]"));
		checkout.sendKeys("20/03/2024");	
		WebElement count=driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
		Select dropdown4= new Select(count);
		dropdown4.selectByIndex(2);
		WebElement Kids=driver.findElement(By.xpath("//*[@id=\"child_room\"]"));
		Select dropdown5= new Select(Kids);
		dropdown5.selectByIndex(1);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		search.click();
		WebElement selhot=driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]"));
		selhot.click();
		Thread.sleep(3000);
		WebElement go=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		go.click();
		Thread.sleep(2000);
		WebElement fn =driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		fn.sendKeys("dass");
		WebElement ln =driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		ln.sendKeys("2024");
		WebElement address =driver.findElement(By.xpath("//*[@id=\"address\"]"));
		address.sendKeys("velachery");
		WebElement cardnum =driver.findElement(By.xpath("//*[@id=\"cc_num\"]"));
		cardnum.sendKeys("1234567891259658");
		WebElement cardtype=driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
		Select dropdown6= new Select(cardtype);
		dropdown6.selectByIndex(3);
		WebElement expiremonth=driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
		Select dropdown7= new Select(expiremonth);
		dropdown7.selectByIndex(11);
		WebElement expireyr=driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
		Select dropdown8= new Select(expireyr);
		dropdown8.selectByIndex(8);
		WebElement cvv =driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]"));
		cvv.sendKeys("455");
		WebElement choose=driver.findElement(By.xpath("//*[@id=\"book_now\"]"));
		choose.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]"));
		logout.click();
	}
	}
