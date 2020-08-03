import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanladeerMo2 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	WebElement sale=driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
	System.out.println(sale.getText());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(sale.getText());
	Actions a=new Actions(driver);
	a.moveToElement(sale).build().perform();
	Thread.sleep(3000);
	sale.click();
	TakeScreenS.takeScreenS("new", driver);
	driver.close();
	
	
}
}
