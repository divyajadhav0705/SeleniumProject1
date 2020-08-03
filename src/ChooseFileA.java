import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseFileA {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/upload/");
	Thread.sleep(4000);
	WebElement upload = driver.findElement(By.xpath("//div[@id='file_wraper0']"));
	upload.click();
	Runtime r=Runtime.getRuntime();
	r.exec("D:\\NewFileTest.exe");
	
	}
}
