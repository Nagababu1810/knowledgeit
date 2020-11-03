package demojenkines;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Run {
	
	WebDriver driver;
	public static String Projectpath =System.getProperty("user.dir");
	@BeforeClass
	public void test1() {
		
		//WebDriverManager.chromedriver.setup();
			System.setProperty("webdriver.chrome.driver", Projectpath +"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@Test
	public void test2() {
		
		System.out.println("firstTest success");
		
	}
	
	@AfterClass	
	public void test3() {
	
	driver.close();
	}

}
