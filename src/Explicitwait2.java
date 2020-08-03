import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");

	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
	WebDriverWait wait=new WebDriverWait(driver, 10);
	WebElement ele = driver.findElement(By.xpath("//a[@class='logout']"));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	// OR wait.until(ExpectedConditions.visibilityOf(ele));
	ele.click();
	System.out.println("Logged out");
	
}
}
