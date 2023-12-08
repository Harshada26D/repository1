package TrueGlobal.TrueGlobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trueGlobal.testcase.BaseClass;

public class Pageobjects extends BaseClass {
	WebDriver ldriver;
	public  Pageobjects (WebDriver rdriver) //pageobject name must be same as class name
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") //we can use diff attribute eg-id ,class ,name instead of name
	@CacheLookup
	WebElement searchBox;
	

	@FindBy(xpath="//input[@id='nav-search-submit-button' and  @value='Go']") //we can use diff attribute eg-id ,class ,name instead of name
	@CacheLookup
	WebElement Gobutton;
	
	@FindBy(xpath="//span[contains(text(),'Redmi')]/ancestor::li") //we can use diff attribute eg-id ,class ,name instead of name
	@CacheLookup
	WebElement brand;
	
	@FindBy(xpath="//span[contains(text(),'Redmi')]/ancestor::div") 
	@CacheLookup
	WebElement redimilist;
	
	public void setSearch(String srcBox) 
	{
		searchBox.sendKeys(srcBox);
		}
	public void GoBtn() 
	{
		 Gobutton.click();
		}
	public void setBrand(String brnd) 
	{
		brand.click();
		brand.isSelected();
		}
	public void RedimiList() {
		redimilist.isDisplayed();
	}
}
