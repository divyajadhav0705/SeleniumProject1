import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttonclickhtml1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/divya/Desktop/HTML/ButtonClick.html");
	WebDriverWait wait=new WebDriverWait(driver, 15);
	WebElement ele = driver.findElement(By.xpath("//input[@id='otherBtn']"));
	wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	
}
}
