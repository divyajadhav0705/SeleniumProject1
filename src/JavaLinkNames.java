import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaLinkNames {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
	    Thread.sleep(2000);
//		WebElement text = driver.findElement(By.xpath("//div[@data-attrid='title']/span[contains(.,'Java')]"));
		
//		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	    List<WebElement> lsts=driver.findElements(By.xpath("//a[@href]"));
	    System.out.println(lsts.getClass());
		System.out.println("=================================================");
		Actions a=new Actions(driver);
		for (WebElement linkname : lsts) {
			String name=linkname.getText();
			System.out.println("link name "+name);
			System.err.println(linkname.getText());
			Thread.sleep(3000);
//			a.moveToElement(linkname).build().perform();
//			Thread.sleep(3000);
//			List<WebElement> menus1=driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
//			for (WebElement menuname1 : menus1) {
//				System.out.println(menuname1.getText());
//				TakeScreenS.takeScreenS(name, driver);
//
//			}
		
		}
	}

}
