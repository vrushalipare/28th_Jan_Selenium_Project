package listBox_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedOptionsFromMultiselectableListBox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vrush/OneDrive/Documents/HTML%20Files/multiselectable_ListBox.html");
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s=new Select(selectcountry);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
	}

}
