import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLinktext {
	
 public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(3000);
		 driver.findElement(By.partialLinkText("TIME Inc.")).click();
		Set<String> tabs=driver.getWindowHandles();
		 for (String tab: tabs) {
			driver.switchTo().window(tab);
		}
		 System.out.println(driver.getTitle());
			
      }
}

