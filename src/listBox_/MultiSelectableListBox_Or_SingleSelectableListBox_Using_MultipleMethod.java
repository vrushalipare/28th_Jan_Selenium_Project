package listBox_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableListBox_Or_SingleSelectableListBox_Using_MultipleMethod {
	public static void main(String[] args) throws InterruptedException {
		
		
	
WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
 
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s=new Select(month);
	boolean result = s.isMultiple();
	System.out.println(result);
	if(result) {
		System.out.println("listbox is multiselectable");
	}
	else {
		System.out.println("listbox is single selectsble");
	}
}
}