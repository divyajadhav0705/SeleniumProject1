import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbladmo2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	WebElement sale=driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
	WebElement sofa=driver.findElement(By.xpath("//span[contains(.,'Wooden Sofa Sets')]/parent::a[@class='inverted']/parent::li[@class='subnav_item 14141']"));
	Actions a=new Actions(driver);
	Thread.sleep(3000);
	a.moveToElement(sale).build().perform();
	sofa.click();
}
}
