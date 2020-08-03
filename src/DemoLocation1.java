import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocation1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	Point loc = search.getLocation();
	System.out.println(loc);
	int x = loc.getX();
	int y = loc.getY();
	System.out.println("X : " + x + "================" + "Y : " + y);
	
	
}
}
