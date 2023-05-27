package iframe_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Frame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//1 st approach
		//driver.switchTo().frame("iframeResult");//switch to frame using string frame id
		//2 nd approach
		//driver.switchTo().frame("iframeResult");//switch to frame using string frame name
		//3rd approach by find element-by xpath
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		//4th approach-by index(need to pass integer frame index)
		//driver.switchTo().frame(index)//but in real time we are not using indexes because
		//its keep changing
		
		//click on--'click me botton'from iframe
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		
		
		
		
		
		
		
		
	}

}
