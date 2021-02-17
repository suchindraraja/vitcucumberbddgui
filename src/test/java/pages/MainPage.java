package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage 
{
    //properties for locating elements
	public RemoteWebDriver driver;
	public WebDriverWait w;
	
	@FindBy(how=How.XPATH, using="//a[text()='Home']")
	public WebElement home;
	
	@FindBy(how=How.XPATH, using="(//a[text()='Placements'])[1]")
	public WebElement placements;
	
	@FindBy(how=How.XPATH, using="(//a[text()='Super Dream offer'])[1]")
	public WebElement superdream;
	
	//constructor method
	public MainPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//operational methods
	
	/*public void mainpagereadiness()
	{
		w.until(ExpectedConditions.visibilityOf(home));
	}*/
	
	public void moveToPlacement()
	{
		Actions a=new Actions(driver);
		a.moveToElement(placements).build().perform();
	}
	
	public void clickSuperDream()
	{
		//w.until(ExpectedConditions.visibilityOf(superdream));
		superdream.click();
	}
}
