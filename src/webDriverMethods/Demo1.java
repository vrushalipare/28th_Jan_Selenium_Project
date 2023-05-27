package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=login+facebook&sxsrf=APwXEdcxekBlo-vbrcWdoI-cBmdIrHWUVQ%3A1681610746386&ei=-lc7ZIuUF6Or5NoPw5KyeA&oq=facebook&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQARgAMgoIABBHENYEE");
	
	driver.getCurrentUrl();
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.navigate().back();
	driver.close();
	

}
}