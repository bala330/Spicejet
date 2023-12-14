package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_onewaytrip_passengerdetails extends Spicejet_base_class {
	
	public Spicejet_onewaytrip_passengerdetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Spicejet_onewaytrip_passengerdetails Assertofflightbooking() {
		Assert(driver.getCurrentUrl(), "https://www.spicejet.com/booking");
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement clicktitle;
	public Spicejet_onewaytrip_passengerdetails click_title() {
		action(clicktitle);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1inuy60 r-1yt7n81 r-1otgn73'])[1]")
	WebElement clickmr;
	public Spicejet_onewaytrip_passengerdetails click_Mr() {
		action(clickmr);
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement firstname;
	public Spicejet_onewaytrip_passengerdetails firstname(String name) {
		sendkeys(firstname, name);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj r-l0gwng'])[1]//input[@autocapitalize='sentences']")
	WebElement lastname;
	public Spicejet_onewaytrip_passengerdetails lastname(String name) {
		sendkeys(lastname, name);
		return this;
	}
	@FindBy(xpath="(//input[@autocomplete='new-password'])[3]")
	WebElement phone;
	public Spicejet_onewaytrip_passengerdetails phonenumber(String name) {
		sendkeys(phone, name);
		return this;
	}
	@FindBy(xpath = "(//input[@autocomplete='new-password'])[4]")
	WebElement email;
	public Spicejet_onewaytrip_passengerdetails emailid(String name) {
		sendkeys(email, name);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	WebElement clickcountry;
	public Spicejet_onewaytrip_passengerdetails country_click() {
		click(clickcountry);
		return this;
	}
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement countryclick;
	public Spicejet_onewaytrip_passengerdetails country(String name) {
		sendkeys(countryclick, name);
		click(countryclick);

		
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
	WebElement town;
	public Spicejet_onewaytrip_passengerdetails Town(String name) {
		sendkeys(town, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='Passenger Information']")
	WebElement scrolldown;
	public Spicejet_onewaytrip_passengerdetails scrolldown_passengerinformation() {
		javascript(scrolldown);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[5]")
	WebElement checkbox;
	public Spicejet_onewaytrip_passengerdetails passenger1_checkbox() {
		action(checkbox);
		return this;
	}
	@FindBy(xpath = "//div[text()='Next']")
	WebElement next1;
	public Spicejet_onewaytrip_passengerdetails passenger1_next() {
		click(next1);
		return this;
	}
	@FindBy(xpath = "(//input[@autocomplete='new-password'])[6]")
	WebElement firstname1;
	public Spicejet_onewaytrip_passengerdetails passenger2_firstname(String name) {
		sendkeys(firstname1, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='Select']")
	WebElement select;
	public Spicejet_onewaytrip_passengerdetails passenger2_select() {
		click(select);
		return this;
	}
	@FindBy(xpath = "//div[text()='Miss']")
	WebElement miss;
	public Spicejet_onewaytrip_passengerdetails passenger2_miss() {
		action(miss);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj'])[5]//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement lastname1;
	public Spicejet_onewaytrip_passengerdetails passenger2_lastname(String name) {
		sendkeys(lastname1, name);
		return this;
	}
	

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1kihuf0 r-kemksi r-109y4c4 r-zg41ew r-5m1il8 r-13qz1uu']")
	WebElement scrollup;
	public Spicejet_onewaytrip_passengerdetails scrolldown_payable() {
		javascript(scrollup);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Continue'])[1]")
	WebElement clickcontinue;
	public Spicejet_onewaytrip_addons_page passenger_continue() {
		action(clickcontinue);
		return new Spicejet_onewaytrip_addons_page(driver);
	}

	
	
	
	

}
