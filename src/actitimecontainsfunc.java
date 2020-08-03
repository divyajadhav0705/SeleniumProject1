import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimecontainsfunc {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement username=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	String usertext=username.getText();
	System.out.println(usertext);
	
	WebElement password=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	System.out.println(password.getText());
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usertext);

	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText(),Keys.ENTER);
	}
}
