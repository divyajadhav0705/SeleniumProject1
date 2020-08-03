package Org.qsp.TestPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Org.qsp.POM.FlipkartHome;

public class TestFlipkartHome {
public static void main(String[] args) throws InterruptedException, StaleElementReferenceException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    FlipkartHome fh= new FlipkartHome(driver);
    fh.clickCloseBtn();
    Thread.sleep(2000);
    fh.mouseover(driver);
    //Thread.sleep(2000);
    fh.clickMi();
    fh.clickMobile();
    //Thread.sleep(2000);
    fh.switchTab(driver);
    fh.clickAddToCart();
    Thread.sleep(2000);
    
    fh.clickPlaceOrderBtn1();
    
    
    
}
}
