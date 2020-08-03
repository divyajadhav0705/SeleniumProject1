import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
   WebElement ele=driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8'][contains(.,'Electronics')]"));
   Actions a=new Actions(driver);
   a.moveToElement(ele).build().perform();
//    Thread.sleep(1000);
   driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_']/span[contains(.,'Electronics')]/parent::li/descendant::a[@title='Mi']")).click();
   //driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a[@title='Mi']")).click();
   Thread.sleep(3000);
   Set<String> tabs=driver.getWindowHandles();
   for (String tab: tabs) {
	      driver.switchTo().window(tab);
	      driver.findElement(By.xpath("//img[@alt='Redmi K20 Pro (Flame Red, 128 GB)']")).click();
	      Set<String> tabs1=driver.getWindowHandles();
	      for (String tab1: tabs1) {
	   	      driver.switchTo().window(tab1);
	      }
	      driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();
   }
}
	}
