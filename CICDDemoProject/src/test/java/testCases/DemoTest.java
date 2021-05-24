package testCases;
import java.io.Console;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	public static WebDriver driver;
	@BeforeTest
	public static void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in");
	}
	@Test
	public static void test1() {
		driver.get("https://www.google.co.in");
		System.out.println("test method 1");

	}
	@Test
	public static void test2() {
		System.out.println("test method 2");
		driver.get("https://www.google.co.in");
		

	}
	@AfterTest
	public static void Logout() {
		System.out.println("after test");
	}
		
}
