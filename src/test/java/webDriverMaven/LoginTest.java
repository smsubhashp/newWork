package webDriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;
	//WebDrivermanager.setup().chromedriver();
	@BeforeTest
	public void setUp() {
	     WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//
	}
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("pritysinha03059101@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("x177524@Telus");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
