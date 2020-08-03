package Org.qsp.TestNGDemo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Geckobrowserlaunch {
public static void main(String[] args) {
	File path=new File("‪C:\\Users\\divya\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	FirefoxBinary fb=new FirefoxBinary(path);
	FirefoxProfile fp=new FirefoxProfile();
	System.setProperty("webdriver.gecko.driver", ".\\Software\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver(fb,fp);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.close();
}
}
