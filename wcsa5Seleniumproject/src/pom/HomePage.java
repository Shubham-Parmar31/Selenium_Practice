package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//A[@class='content tt_selected selected']/descendant::IMG")private WebElement timeTrackModule;
	@FindBy(xpath = "//A[@class='content tasks']/descendant::IMG[@class='sizer']")private WebElement tasksModule;
	@FindBy(xpath = "//A[@class='content reports']/descendant::IMG[@class='sizer']")private WebElement reportsModule;
	@FindBy(xpath = "//A[@class='content users']/descendant::IMG[@class='sizer']")private WebElement usersModule;
	@FindBy(xpath = "//A[@class='content calendar']/descendant::IMG[@class='sizer']")private WebElement workScheduleModule;
	@FindBy(xpath = "//A[@class='content administration']/descendant::IMG[@class='sizer']")private WebElement settingsModule;
	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutButton;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getTasksModule() {
		return tasksModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUsersModule() {
		return usersModule;
	}

	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}

	public WebElement getSettingsModule() {
		return settingsModule;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public void timeTrack()
	{
		timeTrackModule.click();
	}

	public void tasksModule()
	{
		tasksModule.click();
	}

	public void reportsModule()
	{
		reportsModule.click();
	}

	public void usersModule()
	{
		usersModule.click();
	}

	public void workScheduleModule()
	{
		workScheduleModule.click();
	}

	public void rsettingsModule()
	{
		settingsModule.click();
	}

	public void logoutButton()
	{
		logoutButton.click();
	}
}
