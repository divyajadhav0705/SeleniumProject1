import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartEleAllsubmenu {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	WebElement ele1 = driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
	Actions a=new Actions(driver);
	a.moveToElement(ele1).perform();
	List<WebElement> menu = driver.findElements(By.xpath("//span[contains(.,'Electronics')]/parent::li[@class='Wbt_B2 _1YVU3_']/descendant::li"));
    for (WebElement menus : menu) {
		String name=menus.getText();
		Thread.sleep(5000);
		System.out.println(name);
	}
}
}
