import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldemo3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//to scroll full down
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	//to scroll full up
	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	//js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
}
}
