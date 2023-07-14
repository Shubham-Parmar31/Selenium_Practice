package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	//Declaration
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement createNewUserButton;
	@FindBy(xpath = "//input[@name='username']") private WebElement usernameTB;
	@FindBy(xpath = "//input[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath = "//input[@name='passwordTextRetype']") private WebElement retypePasswordTB;
	@FindBy(xpath = "//input[@name='firstName']") private WebElement firstNameTB;
	@FindBy(xpath = "//input[@name='lastName']") private WebElement lastNameTB;
	@FindBy(xpath = "//input[@name='rightGranted[12]']") private WebElement modifyTimeTrackCB;
	@FindBy(xpath = "//input[@name='rightGranted[2]']") private WebElement manageCustomer_ProjectsCB;
	@FindBy(xpath = "//input[@name='rightGranted[5]']") private WebElement manageUsersCB;
	@FindBy(xpath = "//input[@name='rightGranted[7]']") private WebElement manageBillingTypesCB;
	@FindBy(xpath = "//input[@value='   Create User   ']") private WebElement createUserButton;
	@FindBy(xpath = "//input[@value='      Cancel      ']") private WebElement cancelButton;
	@FindBy(xpath = "//a[text()='Parmar, Shubham (Manager)']") private WebElement usersList;
	@FindBy(xpath = "//input[@value='Delete This User']") private WebElement deleteThisUserButton;
	
	//INitialization
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getModifyTimeTrackCB() {
		return modifyTimeTrackCB;
	}

	public WebElement getManageCustomer_ProjectsCB() {
		return manageCustomer_ProjectsCB;
	}

	public WebElement getManageUsersCB() {
		return manageUsersCB;
	}

	public WebElement getManageBillingTypesCB() {
		return manageBillingTypesCB;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getUsersList() {
		return usersList;
	}

	public WebElement getDeleteThisUserButton() {
		return deleteThisUserButton;
	}
		
	//Operational
	public void createUser(String username,String password,String fn,String ln)
	{
		createNewUserButton.click();
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		retypePasswordTB.sendKeys(password);
		firstNameTB.sendKeys(fn);
		lastNameTB.sendKeys(ln);
		modifyTimeTrackCB.click();
		manageCustomer_ProjectsCB.click();
		manageUsersCB.click();
		manageBillingTypesCB.click();
		createUserButton.click();
	}

	public void deleteUser()
	{
		usersList.click();
		deleteThisUserButton.click();
	}
	
}
