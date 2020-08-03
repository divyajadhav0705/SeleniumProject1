import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladderstoretext {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	driver.findElement(By.xpath("//ul[@class='featuredLinksBar__linkContainer']/li/a[contains(.,'Stores')]")).click();
	 List<WebElement> htext = driver.findElements(By.xpath("//div[@class='_12wcw']/h3[@class='_3JJeW']"));
	for (WebElement ele : htext) {
		System.out.println(ele.getText());
	}
}
}
