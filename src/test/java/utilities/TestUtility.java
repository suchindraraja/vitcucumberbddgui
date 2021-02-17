package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtility 
{
	//properties
	public RemoteWebDriver driver;
	
	//constructer method
	public TestUtility()
	{
		driver=null;
	}
	
	//operational methods
	public RemoteWebDriver openBrowser(String bn)
	{
		if(bn.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
	}
	
	public void launchSite(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void closeSite()
	{
		driver.close();
	}
	
	public Properties accessProperties() throws Exception
	{
		String pfpath="C:\\Users\\sukumar raja\\eclipse-workspace\\cucumberbddvit\\src\\test\\resources\\properties\\config.properties";
		FileInputStream fi=new FileInputStream(pfpath);
		Properties p=new Properties();
		p.load(fi);
		return p;
	}
	
 
}
