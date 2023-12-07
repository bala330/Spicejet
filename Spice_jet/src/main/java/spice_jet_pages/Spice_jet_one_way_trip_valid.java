package spice_jet_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spice_jet_base.Spice_jet_base_class;

public class Spice_jet_one_way_trip_valid extends Spice_jet_base_class {
	
	public Spice_jet_one_way_trip_valid(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement clickfrom;
	public Spice_jet_one_way_trip_valid from() {
		Action(clickfrom);
		return this;
	}
	@FindBy(xpath = "By.xpath(\"//input[@value='']\")")
	WebElement entervalue;
	public Spice_jet_one_way_trip_valid enter_place(String name) {
		sendkeys(entervalue, name);
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement cleardetails;
	public Spice_jet_one_way_trip_valid clear_details_To_place(String name) {
		clear(cleardetails);
		sendkeys(cleardetails, name);
		return this;
	}
	@FindBy(xpath = "(//div[text()='16'])[2]")
	WebElement date;
	public Spice_jet_one_way_trip_valid click_date() {
		click(date);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;
	public Spice_jet_one_way_trip_valid click_adult() {
		click(passengers);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[2]")
    WebElement passengers1;
	public Spice_jet_one_way_trip_valid click_child() {
		click(passengers1);
		return this;
	}
	@FindBy(xpath = "//div[text()='INR']")
	WebElement amount;
	public Spice_jet_one_way_trip_valid currency() {
		click(amount);
		return this;
	}
	@FindBy(xpath = "(//div[text()='INR'])[2]")
	WebElement clickcurrency;
	public Spice_jet_one_way_trip_valid Currency_Click() {
		click(clickcurrency);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[1]")
	WebElement search;
	public Select_flight_page search_flight() {
		Action(search);
		return new Select_flight_page(driver);
	}
}
