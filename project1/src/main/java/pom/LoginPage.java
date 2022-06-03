package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	
	
	@FindBy (xpath = "//input[@id='txtUsername']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@id='txtPassword']")
	private WebElement password;

	@FindBy (xpath = "//input[@id='btnLogin']")
	private WebElement login;
	
	private WebDriver driver;	
	private WebDriverWait wait;
	private Actions actions;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		wait= new WebDriverWait(driver,20);
		actions= new Actions(driver);
	}
	
	public void sendUserName() {
		userName.sendKeys("Admin");
		wait.until(ExpectedConditions.visibilityOf(login));
	}
	
	public void sendPassword() {
		password.sendKeys("admin123");
		actions.moveToElement(password).click().build().perform();
		driver.get("https://google.com");
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	
}
