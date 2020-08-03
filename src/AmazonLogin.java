import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement accin =driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[2]"));
		accin.click();
	    WebElement email=driver.findElement(By.name("email"));
         email.sendKeys("divyashinde54@gmail.com");
         WebElement cont=driver.findElement(By.id("continue"));
         cont.click();
             WebElement pass =driver.findElement(By.id("ap_password"));
             pass.sendKeys("Divya@91");
             WebElement sn =driver.findElement(By.id("signInSubmit"));
             sn.click();
}
}