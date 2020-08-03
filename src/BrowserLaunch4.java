import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		String title = driver.getTitle();
		//System.out.println(title);
		System.out.println("=====>" + driver.getTitle());
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		driver.close();
}
}
