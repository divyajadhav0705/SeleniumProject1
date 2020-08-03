import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldemo4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(10000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//Scroll full right in width 
	js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
	Thread.sleep(2000);
	//scroll full left in width
	js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
}
}
