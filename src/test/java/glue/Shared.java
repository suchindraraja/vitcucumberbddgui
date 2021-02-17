package glue;

import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.MainPage;
import pages.ResultPage;
import utilities.TestUtility;

public class Shared 
{
	public Scenario s;
	public RemoteWebDriver driver;
	public TestUtility tu;
	public MainPage mp;
	public ResultPage rp;
	public WebDriverWait w;
	public Properties p;
	
	@Before
	public void method(Scenario s)
	{
		this.s=s;
	}
	

}
