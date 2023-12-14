package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_onewaytrip_Searchofflights_page extends Spicejet_base_class{
	
	public Spicejet_onewaytrip_Searchofflights_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Spicejet_onewaytrip_Searchofflights_page Assertofflightsearch() {
		Assert(driver.getTitle(), "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		return this;
	}
    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-15d164r'])[1]")
    WebElement clickbutton;
    public Spicejet_onewaytrip_Searchofflights_page onewaytrip_click_spicsaver() {
    	action(clickbutton);
    	return this;
    }
    
    @FindBy(xpath = "(//div[text()='Continue'])[1]")
    WebElement click;
    public Spicejet_onewaytrip_passengerdetails onewaytrip_continue() {
    	action(click);
    	return new Spicejet_onewaytrip_passengerdetails(driver);
    }
}
