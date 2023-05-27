package listBox_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_optionFromSingleSelactableTextBox_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(4000);
		//step no1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step no 2 create the object of select class
		Thread.sleep(3000);
		Select s=new Select(month);
		
		//step no 3 select listBox option
		  //string visible text
		//s.selectByValue("4");
		//s.selectByVisibleText("Jun");
		s.selectByIndex(0);
		
				
	}

}
