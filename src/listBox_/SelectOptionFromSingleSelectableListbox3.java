package listBox_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionFromSingleSelectableListbox3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		Thread.sleep(4000);
		WebElement month = driver.findElement(By.xpath("//select[@id='country']"));
		Select s=new Select(month);
		s.selectByVisibleText("Andorra");
		//s.selectByIndex(7);
		//s.selectByValue("15");
	}

}
