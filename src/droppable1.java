import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppable1 {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement droppable = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
     Thread.sleep(2000);
     a.dragAndDrop(draggable, droppable).perform();
     System.out.println(droppable.getText());
		}
	
}
