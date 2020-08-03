import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uladdercustomwait1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Actions a=new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
    new WebDriverWait(driver, 15).until(new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver driver) {
			// TODO Auto-generated method stub
			return driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).isDisplayed();
			}
	});
	
	a.moveToElement(ele).perform();
	ele.click();
	}
}
