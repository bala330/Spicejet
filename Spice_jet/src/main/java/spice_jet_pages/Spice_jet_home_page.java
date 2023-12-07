package spice_jet_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spice_jet_base.Spice_jet_base_class;

public class Spice_jet_home_page extends Spice_jet_base_class {
	
	public Spice_jet_home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement clickbuttonlogin;
	public Spice_jet_login_page_validate loginclick() {
		click(clickbuttonlogin);
     return new Spice_jet_login_page_validate(driver);
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[1]")
	WebElement clickonewaytrip;
	public Spice_jet_one_way_trip_valid one_way_button() {
		click(clickonewaytrip);
		return new Spice_jet_one_way_trip_valid(driver);
	}
	
	

}
