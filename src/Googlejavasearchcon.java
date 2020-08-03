import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googlejavasearchcon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
	Thread.sleep(2000);
	List<WebElement> sug=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	for (WebElement suggname : sug) {
		System.out.println(suggname.getText());
	}
	sug.get(2).click();
}

}