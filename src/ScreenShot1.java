import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	File screenshotsave=new File("./Screenshot/Demo.png");
	Files.copy(screenshot, screenshotsave);
	
}
}
