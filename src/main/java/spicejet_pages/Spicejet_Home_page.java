package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_Home_page extends Spicejet_base_class{
	
	
	public Spicejet_Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement clicklogin;
	public Spicejet_login_page login() {
		click(clicklogin);
		return new Spicejet_login_page(driver);
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement clickfrom;
	public Spicejet_Home_page click_from() {
		action(clickfrom);
		return this;
	}
	@FindBy(xpath = "//input[@value='']")
	WebElement from;
	public Spicejet_Home_page onewaytrip_from(String name) {
		sendkeys(from, name);
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;
	public Spicejet_Home_page onewaytrip_to(String name) {
		clearelements(to);
		sendkeys(to, name);
		return this;
	}
	@FindBy(xpath = "(//div[text()='16'])[2]")
	WebElement date;
	public Spicejet_Home_page onewaytrip_date() {
		click(date);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;
	public Spicejet_Home_page onewaytrip_passengers() {
		click(passengers);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[2]")
	WebElement child;
	public Spicejet_Home_page onewaytrip_chlid() {
		click(child);
		return this;
	}
	@FindBy(xpath = "//div[text()='INR']")
	WebElement currencybutton;
	public Spicejet_Home_page onewaytrip_click() {
		click(currencybutton);
		return this;
	}
	@FindBy(xpath = "(//div[text()='INR'])[2]")
	WebElement currency;
	public Spicejet_Home_page onewaytrip_currency() {
		click(currency);
		return this;
	}
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[1]")
	WebElement searchflight;
	public Spicejet_onewaytrip_Searchofflights_page onewaytrip_searchflight() {
		action(searchflight);
		return new Spicejet_onewaytrip_Searchofflights_page(driver);
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]")
	WebElement click_round;
	public Spicejet_Home_page click_roundtrip() {
		click(click_round);
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement clickfrom1;
	public Spicejet_Home_page click_from_roundtrip() {
		action(clickfrom1);
		return this;
	}
	@FindBy(xpath = "//input[@value='']")
	WebElement from1;
	public Spicejet_Home_page roundtrip_from(String name) {
		sendkeys(from1, name);
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to1;
	public Spicejet_Home_page roundtrip_to(String name) {
		clearelements(to1);
		sendkeys(to1, name);
		return this;
	}
	@FindBy(xpath = "(//div[text()='9'])[2]")
	WebElement date1;
	public Spicejet_Home_page roundtrip_from_date() {
		click(date1);
		return this;
	}
	
	@FindBy(xpath = "(//div[text()='16'])[2]")
	WebElement date2;
	public Spicejet_Home_page roundtrip_to_date() {
		click(date2);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers1;
	public Spicejet_Home_page roundtrip_passengers() {
		click(passengers1);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[2]")
	WebElement child1;
	public Spicejet_Home_page roundtrip_chlid() {
		click(child1);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[3]")
	WebElement Infant;
	public Spicejet_Home_page roundtrip_Infant() {
		click(Infant);
		return this;
	}
	@FindBy(xpath = "//div[text()='INR']")
	WebElement currencybutton1;
	public Spicejet_Home_page roundtrip_click() {
		click(currencybutton1);
		return this;
	}
	@FindBy(xpath = "(//div[text()='INR'])[2]")
	WebElement currency1;
	public Spicejet_Home_page roundtrip_currency() {
		click(currency1);
		return this;
	}
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[1]")
	WebElement searchflight1;
	public Spicejet_roundtrip_searchflights_page roundtrip_searchflight() {
		action(searchflight1);
		return new Spicejet_roundtrip_searchflights_page(driver);
	}
	@FindBy(xpath = "//div[text()='check-in']")
	WebElement checkin;
	public Spicejet_check_in_page click_checkin() {
		action(checkin);
		return new Spicejet_check_in_page(driver);
	}
	@FindBy(xpath = "//div[text()='flight status']")
	WebElement status;
	public Spicejet_flightstatus_page click_flightstatus() {
		action(status);
		return new Spicejet_flightstatus_page(driver);
	}
    @FindBy(xpath = "//div[text()='manage booking']")
    WebElement booking;
    public Spicejet_managebooking_page click_manageboking() {
    	action(booking);
    	return new Spicejet_managebooking_page(driver);
    }
    @FindBy(xpath = "//div[text()='Signup']")
    WebElement clicksignup;
    public Spicejet_signup_page clicksignup() {
    	action(clicksignup);
    	return new Spicejet_signup_page(driver);
    }
	
	

}
