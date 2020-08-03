import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneexplicit1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://bluestone.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions a=new Actions(driver);
	WebElement menu = driver.findElement(By.xpath("//a[@title='Rings']/span"));
	a.moveToElement(menu).build().perform();
	driver.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']")).click();
	driver.findElement(By.xpath("//div[@class='p-image']/descendant::img[@class='hc img-responsive center-block hu hi']")).click();
}
}
