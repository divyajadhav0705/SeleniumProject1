import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ulfindelements {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
    List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
    System.out.println(menus.getClass());
	System.out.println("=================================================");
	Actions a=new Actions(driver);
	for (WebElement menuname : menus) {
		String name=menuname.getText();
		System.err.println(menuname.getText());
		Thread.sleep(3000);
		a.moveToElement(menuname).build().perform();
		Thread.sleep(3000);
		List<WebElement> menus1=driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
		for (WebElement menuname1 : menus1) {
			System.out.println(menuname1.getText());
			TakeScreenS.takeScreenS(name, driver);

		}
	
	}
	}
}
