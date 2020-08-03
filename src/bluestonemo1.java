import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestonemo1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://bluestone.com");
	Thread.sleep(3000);	
  WebElement jewelley=driver.findElement(By.xpath("//a[contains(.,'All Jewellery')]"));
    Actions a=new Actions(driver);
	Thread.sleep(2000);
	a.moveToElement(jewelley).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(.,'Kadas')]")).click();
	driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']/parent::a[@id='pid_5675']")).click();
	Set<String> tabs=driver.getWindowHandles();
    for (String tab: tabs) {
	      driver.switchTo().window(tab);
    }
    driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//ul[@id='sizeDropdown']/descendant::li[@data-key='06']")).click();
    driver.findElement(By.xpath("//input[@id='buy-now']")).click();
}
}
