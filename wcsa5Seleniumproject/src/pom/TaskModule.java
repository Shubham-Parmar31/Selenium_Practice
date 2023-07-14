package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskModule {

	@FindBy(xpath = "//a[text()='Open Tasks']") private WebElement openTaskTab;
	@FindBy(xpath = "//a[text()='Completed Tasks']") private WebElement completedTaskTab;
	@FindBy(xpath = "//a[text()='Projects & Customers']") private WebElement projects_CustomersTab;
	@FindBy(xpath = "//a[text()='Archives']") private WebElement archivesTab;
	
	//Declaration
	public TaskModule(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	//Initialization
	public WebElement getOpenTaskTab() {
		return openTaskTab;
	}

	public WebElement getCompletedTaskTab() {
		return completedTaskTab;
	}

	public WebElement getProjects_CustomersTab() {
		return projects_CustomersTab;
	}

	public WebElement getArchivesTab() {
		return archivesTab;
	}
	
	//Operational
	public void openTask()
	{
		openTaskTab.click();
	}
	
	public void completedTask()
	{
		completedTaskTab.click();
	}
	
	public void projectsCustoemers()
	{
		projects_CustomersTab.click();
	}
	
	public void archives()
	{
		archivesTab.click();
	}
}
