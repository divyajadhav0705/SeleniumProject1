import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Xpathpractice {
@Test
public void m1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_3Njdz7']/button[@class='_2AkmmA _29YdH8']")).click();
	Actions a=new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
	a.moveToElement(ele).build().perform();
	
	driver.findElement(By.xpath("//div[@class='_3b7jyH']/img[@alt='VIVO']")).click();
	driver.findElement(By.xpath("//span[contains(.,'Sort By')]/parent::div/descendant::div[@class='_1xHtJz' and text()='Price -- Low to High']")).click();
   //driver.findElement(By.xpath("//div[@class='_3BTv9X']/img[@alt='Vivo U10 (Thunder Black, 32 GB)']")).click();
	
	Reporter.log("Hey!!!!!", true);
}
}
