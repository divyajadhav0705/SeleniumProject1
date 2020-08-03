package Org.qsp.POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHome {
@FindBy(name="username")
private WebElement username;

@FindBy(name="pwd")
private WebElement pwd;

@FindBy(xpath= "//a[@id='loginButton']")
private WebElement loginBtn;

@FindBy(xpath="//a[@class='logout']")
private WebElement logoutBtn;

public ActiTimeHome(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void sendText(String text) {
	username.sendKeys(text);
}

public void sendPwd(String text) {
	pwd.sendKeys(text);
}

public void clickLoginBtn() {
loginBtn.click();

}

public void clickLogoutBtn() {
logoutBtn.click();
}
}
