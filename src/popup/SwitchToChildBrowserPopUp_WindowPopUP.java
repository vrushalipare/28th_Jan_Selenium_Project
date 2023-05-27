package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToChildBrowserPopUp_WindowPopUP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//click on new tab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allids);
		
		String childwindowid = al.get(1);
		//System.out.println(childwindowid);
		//switch to child browser
		
		driver.switchTo().window(childwindowid);
		//click on 'training link
	
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
}
}