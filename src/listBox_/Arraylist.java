package listBox_;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("mahesh");
		al.add("gita");
		al.add("tara");
		for(String s1:al) {
			System.out.println(s1.toUpperCase());
		}
	}

}
