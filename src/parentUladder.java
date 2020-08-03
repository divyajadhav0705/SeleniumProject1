import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class parentUladder {
@Test
public void m1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(20000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	//For parent:Sale unit
    WebElement ele = driver.findElement(By.xpath("//span[@class='topnav_itemname']/parent::li[@class='topnav_item saleunit']"));
    Actions a=new Actions(driver);
    Thread.sleep(3000);
    a.moveToElement(ele).build().perform();
}
}
