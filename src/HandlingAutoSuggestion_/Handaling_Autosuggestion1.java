package HandlingAutoSuggestion_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handaling_Autosuggestion1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(4000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String expectedtext="redmi mobile";
		for(WebElement s1:alloptions) {
			String actualtext = s1.getText();
			if(actualtext.equals(expectedtext)) {
				s1.click();
				break;
			}
		}
	
	}

}
