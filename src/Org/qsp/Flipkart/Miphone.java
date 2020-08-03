package Org.qsp.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Miphone {
@Test
public void m1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
    WebElement ele=driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8'][contains(.,'Electronics')]"));
    Actions a=new Actions(driver);
    Thread.sleep(2000);
    a.moveToElement(ele).build().perform();
     Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::a[@title='Mi']")).click();
}
}
