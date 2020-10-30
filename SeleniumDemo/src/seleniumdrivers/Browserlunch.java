package seleniumdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserlunch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("Webdriver.chrome.driver","E:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:\\www.amazon.com");
		
		System.setProperty("Webdriver.gecko.driver","E:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https:\\www.flipkart.com");
		Thread.sleep(3000);
		
		System.setProperty("Webdriver.ie.driver","E:\\iedriverserver.exe");
		driver=new InternetExplorerDriver();
		driver.get("https:\\www.ebay.com");
		*/
		
		System.setProperty("Webdriver.edge.driver","E:\\MicrosoftWebdriver.exe");
		driver=new EdgeDriver();
		driver.get("https:\\www.ebay.com");
		
		
		
		
		

	}

}
