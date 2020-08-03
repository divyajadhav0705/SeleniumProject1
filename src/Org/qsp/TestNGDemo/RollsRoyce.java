package Org.qsp.TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RollsRoyce {
@Test
public void m1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebElement ele1 = driver.findElement(By.xpath("//iframe[@class='js-rrmc-height-change-listener']"));
	driver.switchTo().frame(ele1);
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/epaas-consent-drawer-shell//html/body/div/div/section/div[3]/div/button[3]")).click();
	}
	

}