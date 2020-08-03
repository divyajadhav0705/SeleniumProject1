import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver, 15);
	driver.get("file:///C:/Users/divya/Desktop/HTML/Explicit1.html");
	WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
	ele.sendKeys("What is your name?");
	wait.until(ExpectedConditions.textToBePresentInElementValue(ele, "What is your name?"));
    //wait.until(ExpectedConditions.textToBe(By.xpath("//input[@name='textB']")).sendKeys("Divya"));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='textB']"))).sendKeys("Divya");
    driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Divya");
	}
}
