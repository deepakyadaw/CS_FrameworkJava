

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1{
	
public WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}
	


		
		
	}
	/*@Test(invocationCount = 4, threadPoolSize = 2)
	public void testA() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	*/
	
	@Test
	public void verifyTitle()
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	
	@Test()
	public void testA() 
	{

	System.out.println("I am TEST A");	
	}
	
	
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
	
	/*
	@Test
	public void () 
	{
		System.out.println("To Verify Task Button");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		softAssert.assertEquals(url, "http://localhost/tasks/otasklist.do");
		softAssert.assertEquals(title, "actiTIME -  Open Tasks");
		softAssert.assertAll();
		driver.getPageSource().contains(browser);
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	
	}

	@Test
	public void verifyUserTab()
	{
		testID = 102;
		softAssert = new SoftAssert();
		System.out.println("To Verify User Tab");
		// applicationHeader.openUserPage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		softAssert.assertEquals(url, "http://localhost/administration/userlist.do");
		softAssert.assertEquals(title, "actiTIME -  User List ");
		softAssert.assertAll();
	}

	
	*/
}
