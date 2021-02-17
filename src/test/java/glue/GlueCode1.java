package glue;

import java.util.Properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.ResultPage;
import utilities.TestUtility;

public class GlueCode1 
{
	public Shared sh;
	public Properties pro;
	
	public GlueCode1(Shared sh)
	{
		this.sh=sh;
	}
	
	//step definations methods
	@Given("^open browser and launch site$")
	public void method1() throws Exception
	{
		sh.tu=new TestUtility();
		sh.driver=sh.tu.openBrowser("chrome");
		sh.mp=new MainPage(sh.driver);
		sh.rp=new ResultPage(sh.driver);
	    pro=sh.tu.accessProperties();
	    String siteurl=pro.getProperty("url");
		sh.tu.launchSite(siteurl);
	}
	
	@When("^move to placements element and select super dream offer$")
	public void method2()
	{
		//sh.mp.mainpagereadiness();
		sh.mp.moveToPlacement();
		sh.mp.clickSuperDream();
	}

}
