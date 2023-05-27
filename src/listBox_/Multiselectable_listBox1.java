package listBox_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable_listBox1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vrush/OneDrive/Documents/HTML%20Files/multiselectable_ListBox.html");
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s=new Select(selectcountry);
		
		//s.selectByValue(value);
		s.selectByVisibleText("SRI");
		s.selectByIndex(0);
		
		
	}

}
