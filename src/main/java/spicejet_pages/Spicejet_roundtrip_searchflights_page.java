package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_roundtrip_searchflights_page extends Spicejet_base_class{
	
	
	public Spicejet_roundtrip_searchflights_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//div[text()='Flight Details'])[2]")
	WebElement scrolldown;
	public Spicejet_roundtrip_searchflights_page roundtrip_scrolldown() {
		javascript(scrolldown);
		return this;
	}
	
    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-15d164r'])[8]")
    WebElement clickbutton;
    public Spicejet_roundtrip_searchflights_page roundtrip_click_spiemax() {
    	action(clickbutton);
    	return this;
    }
    public Spicejet_roundtrip_searchflights_page Assertofflightsearch() {
		Assert(driver.getTitle(), "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		return this;
	}
    @FindBy(xpath = "(//div[text()='Continue'])[1]")
    WebElement click;
    public Spicejet_roundtrip_passengerdetails_page roundtrip_continue() {
    	action(click);
    	return new Spicejet_roundtrip_passengerdetails_page(driver);
    }

}
