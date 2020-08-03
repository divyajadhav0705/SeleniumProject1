import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AncestorUladder {
@Test
public void m1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(20000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	WebElement sale=driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	a.moveToElement(sale).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(.,'Dining Table Sets')]/ancestor::li[@class='subnav_item 14091']")).click();
	
}
}
