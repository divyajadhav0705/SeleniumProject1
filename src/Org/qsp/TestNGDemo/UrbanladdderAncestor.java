package Org.qsp.TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class UrbanladdderAncestor {
WebDriver driver;
	
	@BeforeSuite
	public void beforeS() {
		Reporter.log("Before suite", true);
	}
	
	@BeforeTest
	public void beforeT() {
		Reporter.log("Before Test", true);
	}
	@BeforeClass
	public void beforeC() {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
@BeforeMethod
public void beforeM() throws InterruptedException {
	
   driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
}
}
