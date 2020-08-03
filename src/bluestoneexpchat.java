import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestoneexpchat {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://bluestone.com");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    WebElement frame = driver.findElement(By.xpath("//iframe[@name='chat-widget']"));
    driver.switchTo().frame(frame);
    Thread.sleep(4000);
    driver.findElement(By.xpath("//div[@class='lc-1ozfevo eqd5v0k0 lc-1xypejv-appear-done lc-1xypejv-enter-done']/div[1]/div[2]/div[1]/p[contains(.,'CHAT with our experts !')]")).click();
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Divya");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@name='zfou2vb2b58_146917605549304831']")).sendKeys("7856342897");
	driver.findElement(By.xpath("//div/button[@class='lc-1havh3t esv0owm0']/div[1]/span[contains(.,'Start the chat')]")).click();
	
}
}
