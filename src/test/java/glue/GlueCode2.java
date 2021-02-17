package glue;

import org.openqa.selenium.OutputType;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GlueCode2 
{
	public Shared sh;
	
	//constructer method
	public GlueCode2(Shared sh)
	{
		this.sh=sh;
	}
	
	@Then("^\"(.*)\" should be visible in the next page$")
	public void method3(String x)
	{
		try
		{
			sh.rp.resultpageready();
			String y=sh.rp.placementsresult();
			if(y.equalsIgnoreCase(x))
			{
				sh.s.log("placemnet page test passed");
				Assert.assertTrue(true);
			}
			else
			{
				byte[] b=sh.driver.getScreenshotAs(OutputType.BYTES);
				sh.s.attach(b,"PNG","test failed");
				Assert.fail();
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	@When("^close site$")
	public void method4()
	{
		sh.tu.closeSite();
	}

}
