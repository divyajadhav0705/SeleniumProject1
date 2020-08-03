import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartallsubmenusmo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(5000);
		List<WebElement> menu = driver.findElements(By.xpath("//span[contains(.,'Electronics')]/ancestor::ul/li"));
		Actions a = new Actions(driver);
		for (WebElement menu1 : menu) {
			String name = menu1.getText();
			System.out.println(name);
			a.moveToElement(menu1).perform();
			Thread.sleep(3000);
			List<WebElement> menuname = driver.findElements(By.xpath(
					"//span[contains(.,'"+name+"')]/a[@data-index='0']/parent::div/parent::div/parent::div/descendant::ul[@class='desktop-navBlock']"));
			for (WebElement menu2 : menuname) {
				System.out.println(menu2.getText());

			}

		}
	}
}
////span[contains(.,'Electronics')]/parent::li/descendant::li