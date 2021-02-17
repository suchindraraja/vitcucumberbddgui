package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage 
{
	//properties for locating elements
	public RemoteWebDriver driver;
	public WebDriverWait w;
	
	@FindBy(how=How.XPATH, using="//span[@class='bread_img icons']")
	public WebElement gradhat;
	
	@FindBy(how=How.XPATH, using="//li[contains(text(),'Placements')]")
	public WebElement placements;
	
	//constructor method
	public ResultPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//operational methods
	public String placementsresult()
	{
		w.until(ExpectedConditions.visibilityOf(placements));
		String text=placements.getText();
		return text;
	}
	
	public void resultpageready()
	{
		w.until(ExpectedConditions.visibilityOf(gradhat));
	}
	

}
