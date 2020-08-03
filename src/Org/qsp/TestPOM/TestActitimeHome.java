package Org.qsp.TestPOM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Org.qsp.POM.ActiTimeHome;


public class TestActitimeHome {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ActiTimeHome ah=new ActiTimeHome(driver);
	ah.sendText("admin");
	Thread.sleep(2000);
	ah.sendPwd("manager");
	Thread.sleep(2000);
	ah.clickLoginBtn();
	Thread.sleep(5000);
     TakeScreenS.takeScreenS("Actitimess1", driver);
	System.out.println(driver.getTitle());
    Thread.sleep(2000);  
	ah.clickLogoutBtn();
	

}
}
