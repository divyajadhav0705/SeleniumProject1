import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriDemo {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launching browser
		driver.manage().window().maximize(); //maximizing browser
		driver.get("https://www.naukri.com/"); //loading url
		String parent=driver.getWindowHandle();
		System.out.println("Parent window handle:" + parent);
		Thread.sleep(6000);
		Set<String> windows = driver.getWindowHandles();
		windows.remove(parent);
		for (String win : windows) {
			System.out.println("All window handle:" + win);
			driver.switchTo().window(win);
			driver.close();
		}
		
		
		//driver.close();
		//driver.quit();
	}
}
