import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class blsmoallele {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://bluestone.com");
	Thread.sleep(3000);	
List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
for (WebElement menuname : menus) {
	Actions a=new Actions(driver);
	System.out.println(menuname.getText());
	Thread.sleep(3000);
	a.moveToElement(menuname).build().perform();
}

	
}
}
