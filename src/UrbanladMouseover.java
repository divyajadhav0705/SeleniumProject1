import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanladMouseover {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	WebElement sale=driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
	Actions a=new Actions(driver);
	Thread.sleep(3000);
    a.moveToElement(sale).build().perform();
    Thread.sleep(3000);
	TakeScreenS.takeScreenS("sale1", driver);
	
	
}
}
