package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement femaleradiobutton=driver.findElement(By.xpath("//label[text()='Female']"));
		femaleradiobutton.click();
		          
	//	boolean result=femaleradiobutton.isSelected();
	//	System.out.println(result);
	//	if(result) {
	//		System.out.println("femaleradiobutton is selected");
	//	}
	//	else {
	//		System.out.println("femaleradiobutton is de-selected");
	//	}
		
	}

}
