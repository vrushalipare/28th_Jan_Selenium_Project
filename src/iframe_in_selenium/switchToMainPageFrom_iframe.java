package iframe_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToMainPageFrom_iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		
		//click on click me button---from iframe
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		//switch to main page
		//driver.switchTo().parentFrame();--1st approach
		driver.switchTo().defaultContent();//---2nd approach
		Thread.sleep(2000);
		//click on open menu option from main page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	}

}
