import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automationPractice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement htext = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul[1]/li[1]/ul[1]/li[2]/following::a[text()='Dresses']"));
	Actions a=new Actions(driver);
	a.moveToElement(htext).perform();
	driver.findElement(By.xpath("//div[@id='block_top_menu']/ul[1]/li[2]/ul[1]/li[1]/a[@title='Casual Dresses']")).click();
	//Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//img[@itemprop='image']"));
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//div[@class='right-block']/div[@class='button-container']/a[@title='Add to cart']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("abc@");
	driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	//Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//div[@id='create_account_error']")).getText());
	Thread.sleep(2000);
	
}
}
