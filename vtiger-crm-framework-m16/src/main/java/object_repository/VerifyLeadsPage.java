package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyLeadsPage {
	public WebDriver driver;
	
	public VerifyLeadsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user_name")
	private WebElement un;

	public WebElement getUn() {
		return un;
	}
	
	@FindBy(name = "user_password")
	private WebElement pwd;

	public WebElement getPwd() {
		return pwd;
	}
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
