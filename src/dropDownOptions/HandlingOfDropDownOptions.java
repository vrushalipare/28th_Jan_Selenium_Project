package dropDownOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingOfDropDownOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		Thread.sleep(2000);
		//action on close button
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		//step1
		WebElement login = driver.findElement(By.xpath(""));
		//step2
		Actions act=new Actions(driver);
		//step3
		act.moveToElement(login).perform();
		
		Thread.sleep(2000);
		//click on wishlist element
		driver.findElement(By.xpath("")).click();
		
		
	}

}
