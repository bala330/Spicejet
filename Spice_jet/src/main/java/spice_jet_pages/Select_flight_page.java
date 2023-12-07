package spice_jet_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spice_jet_base.Spice_jet_base_class;

public class Select_flight_page extends Spice_jet_base_class {
	
	public Select_flight_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
		
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-15d164r'])[1]")
	WebElement clickprice;
	public Select_flight_page clickprice_button() {
		Action(clickprice);
		return this;
	}
}
