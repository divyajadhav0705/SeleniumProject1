import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Execution for X-path
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("alia",Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		//Thread.sleep(2000);
	    
  
        // driver.findElement(By.name("btnK")).click();;
		//input@class='gLFyf gsfi'
}
}