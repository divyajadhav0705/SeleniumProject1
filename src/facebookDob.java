import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookDob {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(10000);
	 WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
	 Select sday=new Select(day);
	 sday.selectByValue("19");
	  WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	 Select smonth=new Select(month);
	  smonth.selectByVisibleText("Aug");
	 WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	 Select syear=new Select(year);
	 syear.selectByIndex(8);
	 System.out.println("==============================");
	 List<WebElement> days = sday.getOptions();
	 for (WebElement dayvalue : days) {
	  System.out.println(dayvalue.getText());
	}
		
		 
	 
}
}
