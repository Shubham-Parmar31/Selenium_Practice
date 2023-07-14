package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //Declaration
	@FindBy(xpath = "//*[@name='username']") private WebElement usnTB;
	@FindBy(xpath = "//*[@name='pwd']") private WebElement passTB;
	@FindBy(xpath = "//*[@id='keepLoggedInCheckBox']") private WebElement checkBox;
	@FindBy(xpath = "//a[.='Actimind Inc.']")private WebElement ActitimeMindLink;
	@FindBy(xpath = "//*[@id='loginButton']") private WebElement loginButton;
	
	
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//
	public void validLogin(String validUsername,String validPassword)
	{
		usnTB.sendKeys(validUsername);
		passTB.sendKeys(validPassword);
		loginButton.click();
	}
	
	public void invalidLogin(String validUsername,String validPassword)
	{
		usnTB.sendKeys(validUsername);
		passTB.sendKeys(validPassword);
		loginButton.click();
		usnTB.clear();
		usnTB.clear();
	}
}
