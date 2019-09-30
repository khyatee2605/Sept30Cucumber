package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginOR {
 public LoginOR(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(id="username") WebElement user;
 @FindBy(how=How.NAME,using="password") WebElement pass;
 @FindBy(className="radius") WebElement login;
}
