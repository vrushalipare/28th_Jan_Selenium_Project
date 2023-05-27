import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//xpath expression using attribute approach(user name)
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		Thread.sleep(2000);
		//(password)xpath expression using attribute approach
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
		Thread.sleep(2000);
		//login button using xpath expression by text(getting exception)
	//	driver.findElement(By.xpath("//button[text()='Log in']")).click();
		//login button using xpath contain attribute
		//driver.findElement(By.xpath("//button[contains(@class,'_51sy')]")).click();
		//Thread.sleep(2000);
		//exception occors while using xpath text approach
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//forgotton password xpath using contains partialtext
		//driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		Thread.sleep(2000);
		//creat new account using xpath text
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		
	}

}
