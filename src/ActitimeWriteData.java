import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeWriteData {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	FileInputStream fis=new FileInputStream("C:\\Users\\divya\\Desktop\\data.xlsx");
	Workbook w = WorkbookFactory.create(fis);
	Sheet sh = w.getSheet("Sheet1");
	Cell userid=sh.getRow(1).getCell(0);
	String username=userid.toString();
	Cell passwd=sh.getRow(1).getCell(1);
	String password=passwd.toString();
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys(username);;
	driver.findElement(By.name("pwd")).sendKeys(password);;
    driver.findElement(By.id("loginButton")).click();;

	
}
}
