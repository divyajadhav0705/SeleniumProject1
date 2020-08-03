package Org.qsp.POM;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHome {
@FindBy(xpath ="//button[@class='_2AkmmA _29YdH8']")
private WebElement close;

public void clickCloseBtn() {
	close.click();
}

@FindBy(xpath = "//span[contains(.,'Electronics')]")
private WebElement electronics;

public void mouseover(WebDriver driver) {
	Actions a=new Actions(driver);
	a.moveToElement(electronics).build().perform();
}

	

@FindBy(xpath = "//li[@class='Wbt_B2 _1YVU3_']/span[contains(.,'Electronics')]/parent::li/descendant::a[@title='Mi']")
private WebElement Mi;

public void clickMi() {
	Mi.click();
}

@FindBy(xpath = "//img[@alt='Redmi K20 Pro (Glacier Blue, 128 GB)']")
private WebElement mobile;

public void clickMobile() {
	mobile.click();
}

public FlipkartHome(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public void switchTab(WebDriver driver){
	Set<String> tab = driver.getWindowHandles();
	for (String tabs : tab) {
		driver.switchTo().window(tabs);
	}
}
@FindBy(xpath = "//form/following::button[@type='button']/span")
private WebElement buynow;

@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
private WebElement addtocart;


public void clickAddToCart() {
  addtocart.click();
}

@FindBy(xpath = "//div[@class='_39M2dM _2gCfOf']/input[@type='text']")
private WebElement textbox;

public void sendText(String text) {
	textbox.sendKeys(text);
}

@FindBy(xpath = "//button[@class='_2AkmmA iwYpF9 _7UHT_c']")
private WebElement placeOrder1;

public void clickPlaceOrderBtn1() {
	placeOrder1.click();
}


}
