package Org.qsp.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FollowingSiblingUl {
@Test
public void m1() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	//For following sibling:Traverse from living unit to storage unit
    WebElement ele1 = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
    Actions a=new Actions(driver);
    Thread.sleep(2000);
    a.moveToElement(ele1).perform();
    Thread.sleep(2000);
    WebElement ele2 = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/following-sibling::li[@class='topnav_item storageunit']"));
    a.moveToElement(ele2).perform();
    
}
}
