import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestoneprice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://bluestone.com");
	Thread.sleep(3000);	
	Actions a=new Actions(driver);
	WebElement menu = driver.findElement(By.xpath("//a[@title='Rings']/span"));
	a.moveToElement(menu).build().perform();
	driver.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']")).click();
	Thread.sleep(2000);
	
}
}
