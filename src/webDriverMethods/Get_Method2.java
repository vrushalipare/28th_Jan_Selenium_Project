package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=589152046215&hvpos=&hvnetw=g&hvrand=3782552489952212421&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9003540&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_14580410");
		driver.close();
	}

}
