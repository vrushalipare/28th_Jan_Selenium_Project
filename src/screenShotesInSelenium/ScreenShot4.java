package screenShotesInSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot4 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Object rs = RandomString.make(2);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest = new File("C:\\Users\\vrush\\OneDrive\\Documents\\Screen Shotes In Selenium\\image"+rs+".jpg");
		
		FileHandler.copy(src, dest);
		
		
		
	}

}
