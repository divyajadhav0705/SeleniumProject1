import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimevalidatelogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='initial']")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	if(driver.getTitle().contains("Enter Time"));
	System.out.println("Logged in");
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
}
