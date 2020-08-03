import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartratingcompare {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	double i=0;
	double big=0;
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java books",Keys.ENTER);
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[@class='_3ywJNQ']/div[contains(.,'Price -- Low to High')]")).click();
	Thread.sleep(10000);
	List<WebElement> ratings = driver.findElements(By.xpath("//div[@class='hGSR34']"));
	for (WebElement rates : ratings) {
		String rate=rates.getText();
    System.out.println(rate);
			}
	}
	
	}
	



