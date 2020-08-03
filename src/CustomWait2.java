import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/divya/Desktop/HTML/ButtonClick.html");
	//writing custom wait
	new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
		@Override
		
		public Boolean apply(WebDriver driver) {
			// TODO Auto-generated method stub
			return driver.findElement(By.xpath("//input[@value='Do something else']")).isEnabled();
		}
	});
	driver.findElement(By.xpath("//input[@value='Do something else']")).click();
}
}
