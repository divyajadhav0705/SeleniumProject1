import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Htmlseloptions {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/divya/Desktop/HTML/multi.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
	Select s=new Select(ele);
	List<WebElement> opts = s.getOptions();
	if(s.isMultiple()) {
		s.selectByValue(opts.get(1).getText());
		s.selectByValue(opts.get(3).getText());
	}
	System.out.println("==========================================");
	 List<WebElement> sopt = s.getAllSelectedOptions();
		for (WebElement selectedopt : sopt) {
			s.selectByValue(selectedopt.getText());
		}
		System.out.println("1st option:" + s.getFirstSelectedOption().getText());
}
}