package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:\\Users\\sukumar raja\\eclipse-workspace\\cucumberbddvit\\src\\test\\resources\\features\\placementpage.feature"},
                 monochrome=true,
                 glue= {"glue"},
                 plugin= {"pretty","html:target\\placementtestresults","rerun:target\\failedplctestresults.txt"}
                )
public class PlacementTestRunner extends AbstractTestNGCucumberTests
{
	
}
