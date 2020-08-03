import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadderxpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(10000);
    driver.findElement(By.xpath("//div[@class='popup-text text-center vert large-6 columns']/a[contains(.,'Close')]")).click();
    //For parent:Sale unit
    WebElement ele = driver.findElement(By.xpath("//span[@class='topnav_itemname']/parent::li[@class='topnav_item saleunit']"));
    Actions a=new Actions(driver);
    Thread.sleep(3000);
    a.moveToElement(ele).build().perform();
    Thread.sleep(2000);
    
    //WebElement ele1 = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
    //Thread.sleep(2000);
    //a.moveToElement(ele1).perform();
    //Thread.sleep(2000);
    
    //For following: To traverse from Livingunit to Bedroom unit
    //WebElement ele1 = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
    //Thread.sleep(2000);
    //a.moveToElement(ele1).perform();
    //WebElement ele2 = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/following::li[@class='topnav_item bedroomunit']"));
	//Thread.sleep(2000);
	//a.moveToElement(ele2).perform();
    
    //For ancestor:In Sale unit
    //driver.findElement(By.xpath("//span[contains(.,'Dining Table Sets')]/ancestor::li[@class='subnav_item 14091']")).click();
    
    //For descendant: To traverse from Sale to Accent and Lounge Chairs
    /* WebElement ele1 = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
    a.moveToElement(ele1).perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[contains(.,'Sale')]/parent::li/descendant::span[contains(.,'Accent and Lounge Chairs')]")).click();
   */
    //For following sibling:Traverse from living unit to storage unit
    /*WebElement ele1 = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
    a.moveToElement(ele1).perform();
    Thread.sleep(2000);
    WebElement ele2 = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/following-sibling::li[@class='topnav_item storageunit']"));
    a.moveToElement(ele2).perform();
    */
    
    //For preceding: Traverse from Collections to New unit
   /* WebElement ele1 = driver.findElement(By.xpath("//li[@class='topnav_item collectionsunit']"));
    a.moveToElement(ele1).perform();
    
    WebElement ele2 = driver.findElement(By.xpath("//li[@class='topnav_item collectionsunit']/preceding::li[@class='topnav_item newunit']"));
    Thread.sleep(2000);
    a.moveToElement(ele2).perform();
    */
    
    //For preceding-sibling: To traverse from Collections to Living unit
    /* WebElement ele1 = driver.findElement(By.xpath("//li[@class='topnav_item collectionsunit']"));
    a.moveToElement(ele1).perform();
    WebElement ele2 = driver.findElement(By.xpath("//li[@class='topnav_item collectionsunit']/preceding-sibling::li[@class='topnav_item livingunit']"));
    Thread.sleep(2000);
    a.moveToElement(ele2).perform();
    */
}
}



	