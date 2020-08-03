import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/slider/");
  	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
  	driver.switchTo().frame(frame);
  	WebElement shandle = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
  	WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
  	Actions a=new Actions(driver);
  	Thread.sleep(2000);
  	a.clickAndHold(shandle).moveToElement(slider).perform();
  	
}
}
