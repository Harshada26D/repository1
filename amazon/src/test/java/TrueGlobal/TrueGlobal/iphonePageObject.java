package TrueGlobal.TrueGlobal;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trueGlobal.testcase.BaseClass;

public class iphonePageObject extends BaseClass{
	WebDriver ldriver;
	public iphonePageObject(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") //we can use diff attribute eg-id ,class ,name instead of name
	@CacheLookup
	WebElement searchBox;
	
	@FindBy(xpath="(//div[@class='s-suggestion s-suggestion-ellipsis-direction' and text()='iphone'])[3]") 
	@CacheLookup
	WebElement suggestionList;
	
	@FindBy(xpath="(//div[@class=\"s-suggestion-container\"]//div[text()='iphone'])[2]") 
	@CacheLookup
	WebElement SelectIphone;
	
	
	@FindBy(xpath="//input[@id='low-price']") 
	@CacheLookup
	WebElement price;
	
	@FindBy(xpath = "//span[@id='a-autoid-1']")
	WebElement checkBox;
	
	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement iphone13;
	
	@FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
	WebElement Addtocart;
	
	@FindBy(xpath="//span[@id='attach-sidesheet-checkout-button']")
	WebElement proceedToCheck;
	//--------
	//@FindBy(xpath="//span[contains(text(),' Sign in to your account')]")
	//WebElement SignIn;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement Continue;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SignInSubmit;
	
	
	public void setSearch(String srcBox) 
	{
		searchBox.sendKeys(srcBox);
	}
	

	public void suggestionlist() 
	{
		suggestionList.isDisplayed();
	}
	
	public void SelectIphone() 
	{
		SelectIphone.click();
	}
	
	public void price(String lowprc) 
	{
		price.sendKeys(lowprc);
	}
	public void Checkbx() 
	{
		checkBox.click();
		}
	public void iphone13()
	{
		iphone13.click();
	}
	
	public void getwindowhandle()
	{
		
		 Set <String> windowIDs=driver.getWindowHandles();
		    Iterator<String> It= windowIDs.iterator();
		    String parentwindowID= It.next();
		    String childwindowID= It.next();
		    
		    
		    System.out.println("parentID "+parentwindowID);
		    System.out.println("childID "+childwindowID);

		    driver.switchTo().window(childwindowID);
		    
	}
	
	public void Addtocart() 
	{
		
		Addtocart.click();
		
	}
	
	public void ProceedToCheck() {
		proceedToCheck.click();
	}
	
	/*public void SignIn() 
	{
		SignIn.click();
		
	}*/
	
	public void email(String mailid) 
	{
		email.sendKeys(mailid);
	}
	
	public void Continue() 
	{
		Continue.click();		
	}
	
	public void password2(String passRegistration) 
	{
		pass.sendKeys(passRegistration);
	}
	
	public void SignInSubmit() 
	{
		SignInSubmit.click();		
	}
	
}
