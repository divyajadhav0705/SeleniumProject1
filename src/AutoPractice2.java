import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoPractice2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@id='block_top_menu']/ul[1]/li[1]/ul[1]/li[2]/following::a[text()='Dresses']")).click();

	WebElement shandle = driver.findElement(By.xpath("//div[@id='layered_price_slider']"));
	System.out.println(shandle.isDisplayed());
	Actions a=new Actions(driver);
	for (int i=0;i<2;i++)
	{
		a.dragAndDropBy(shandle, 100, 0).perform();
  Thread.sleep(2000);
  a.dragAndDropBy(shandle, -100, 0).perform();
  	Thread.sleep(2000);
	}
  
}
}
