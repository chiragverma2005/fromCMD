package testCICD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testCICD {
	
	public static void main(String[] args) {
		
	WebDriver driver;
	driver = new ChromeDriver();
	driver = new EdgeDriver();
	
	driver.get("https:/google.com");

}
}