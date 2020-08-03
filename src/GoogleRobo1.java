import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleRobo1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
    Thread.sleep(2000);
	WebElement text = driver.findElement(By.xpath("//div[@data-attrid='title']/span[contains(.,'Java')]"));
	
	Actions a=new Actions(driver);
	a.doubleClick(text).perform();
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

	}
}
/*  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java",Keys.ENTER);
		Actions a = new Actions(driver);
	   WebElement java = driver.findElement(By.xpath("//div[@data-attrid='title']/span[contains(.,'Java')]"));
	   a.doubleClick(java).perform();
	   Thread.sleep(3000);
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_C);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_C);
	   Thread.sleep(3000);
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_T);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_T);
	   Thread.sleep(3000);
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_V);
	   Thread.sleep(3000);
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);*/