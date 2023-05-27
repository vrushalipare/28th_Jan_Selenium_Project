package listBox_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectoptionFromSingleSelectableListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click ();
		Thread.sleep(3000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(4000);
		
		        Select s=new Select(month);
		       s.selectByVisibleText("Jan");
		        
				//s.deselectByIndex(2);
				//s.deselectByValue("1");
	}

}
