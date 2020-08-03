import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimehiddenpopup1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.id("loginButton")).click();
     driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
     driver.findElement(By.xpath("//li[@class='popup_menu_item']/a[contains(.,'About your actiTIME')]")).click();
     WebElement ele = driver.findElement(By.xpath("//td[@class='aboutCopyright']/span[contains(.,'© 2020 actiTIME Inc. All rights reserved.')]"));
System.out.println(ele.getText());
driver.findElement(By.xpath("//td[@class='close-button']/div[@class='closeButton']")).click();
}
}
