import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebook {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
         //WebElement email=driver.findElement(By.id("email"));
         //WebElement pass=driver.findElement(By.id("pass"));
            // email.sendKeys("divyashinde54@gmail.com");,
             //pass.sendKeys("@15081991");
            // WebElement login =driver.findElement(By.id("loginbutton"));
             //login.click();
		//for X-path
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divyashinde54@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("anything",Keys.ENTER);
		driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
}
}
