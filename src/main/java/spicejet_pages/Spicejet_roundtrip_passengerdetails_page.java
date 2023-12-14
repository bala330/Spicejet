package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_roundtrip_passengerdetails_page extends Spicejet_base_class{
	
	public Spicejet_roundtrip_passengerdetails_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement clicktitle;
	public Spicejet_roundtrip_passengerdetails_page click_title() {
		action(clicktitle);
		return this;
	}
	public Spicejet_roundtrip_passengerdetails_page Assertofflightbooking() {
		Assert(driver.getCurrentUrl(), "https://www.spicejet.com/booking");
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1inuy60 r-1yt7n81 r-1otgn73'])[1]")
	WebElement clickmr;
	public Spicejet_roundtrip_passengerdetails_page click_Mr() {
		action(clickmr);
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement firstname;
	public Spicejet_roundtrip_passengerdetails_page firstname(String name) {
		sendkeys(firstname, name);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj r-l0gwng'])[1]//input[@autocapitalize='sentences']")
	WebElement lastname;
	public Spicejet_roundtrip_passengerdetails_page lastname(String name) {
		sendkeys(lastname, name);
		return this;
	}
	@FindBy(xpath="(//input[@autocomplete='new-password'])[3]")
	WebElement phone;
	public Spicejet_roundtrip_passengerdetails_page phonenumber(String name) {
		sendkeys(phone, name);
		return this;
	}
	@FindBy(xpath = "(//input[@autocomplete='new-password'])[4]")
	WebElement email;
	public Spicejet_roundtrip_passengerdetails_page emailid(String name) {
		sendkeys(email, name);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	WebElement clickcountry;
	public Spicejet_roundtrip_passengerdetails_page country_click() {
		click(clickcountry);
		return this;
	}
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement countryclick;
	public Spicejet_roundtrip_passengerdetails_page country(String name) {
		sendkeys(countryclick, name);
		click(countryclick);
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
	WebElement town;
	public Spicejet_roundtrip_passengerdetails_page Town(String name) {
		sendkeys(town, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='Passenger Information']")
	WebElement scrolldown;
	public Spicejet_roundtrip_passengerdetails_page scrolldown_passengerinformation() {
		javascript(scrolldown);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	WebElement select1;
	public Spicejet_roundtrip_passengerdetails_page passenger1_select() {
		click(select1);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Mr'])[2]")
	WebElement clickmr1;
	public Spicejet_roundtrip_passengerdetails_page passenger1_Mr() {
		click(clickmr1);
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[5]")
	WebElement firstname1;
	public Spicejet_roundtrip_passengerdetails_page passenger1_firsttname(String name) {
		sendkeys(firstname1, name);
		return this;
	}
	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[7]")
	WebElement lastname1;
	public Spicejet_roundtrip_passengerdetails_page passenger1_lastname(String name) {
		sendkeys(lastname1, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='Next']")
	WebElement next1;
	public Spicejet_roundtrip_passengerdetails_page passenger1_next() {
		click(next1);
		return this;
	}
	@FindBy(xpath = "(//input[@autocomplete='new-password'])[6]")
	WebElement firstname2;
	public Spicejet_roundtrip_passengerdetails_page passenger2_firstname(String name) {
		sendkeys(firstname2, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='Select']")
	WebElement select;
	public Spicejet_roundtrip_passengerdetails_page passenger2_select() {
		click(select);
		return this;
	}
	@FindBy(xpath = "//div[text()='Miss']")
	WebElement miss;
	public Spicejet_roundtrip_passengerdetails_page passenger2_miss() {
		action(miss);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj'])[5]//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement lastname2;
	public Spicejet_roundtrip_passengerdetails_page passenger2_lastname(String name) {
		sendkeys(lastname2, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='Next']")
	WebElement next2;
	public Spicejet_roundtrip_passengerdetails_page passenger2_next() {
		click(next2);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Select'])[1]")
	WebElement select2;
	public Spicejet_roundtrip_passengerdetails_page passenger3_select() {
		click(select2);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Master'])[1]")
	WebElement master;
	public Spicejet_roundtrip_passengerdetails_page passenger3_master() {
		action(master);
		return this;
	}
	@FindBy(xpath = "(//input[@spellcheck='false'])[6]")
	WebElement firstname3;
	public Spicejet_roundtrip_passengerdetails_page passenger3_firstname(String name) {
		sendkeys(firstname3, name);
		return this;
	}
	@FindBy(xpath = "(//input[@dir='auto'])[7]")
	WebElement lastname3;
	public Spicejet_roundtrip_passengerdetails_page passenger3_lastname(String name) {
		sendkeys(lastname3, name);
		return this;
	}
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	WebElement dob;
	public Spicejet_roundtrip_passengerdetails_page passenger3_dob() {
		click(dob);
		return this;
	}
	@FindBy(xpath = "//div[text()='2022']")
	WebElement year;
	public Spicejet_roundtrip_passengerdetails_page passenger3_year() {
		action(year);
		return this;
	}
	@FindBy(xpath = "//div[text()='Feb']")
	WebElement month;
	public Spicejet_roundtrip_passengerdetails_page passenger3_month() {
		action(month);
		return this;
	}
	@FindBy(xpath = "(//div[text()='2'])[2]")
	WebElement date;
	public Spicejet_roundtrip_passengerdetails_page passenger3_date() {
		action(date);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement travell;
	public Spicejet_roundtrip_passengerdetails_page passenger3_travell() {
		click(travell);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])")
	WebElement adult;
	public Spicejet_roundtrip_passengerdetails_page passenger3_travell_adult() {
		action(adult);
		return this;
	}

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1kihuf0 r-kemksi r-109y4c4 r-zg41ew r-5m1il8 r-13qz1uu']")
	WebElement scrollup;
	public Spicejet_roundtrip_passengerdetails_page scrolldown_payable() {
		javascript(scrollup);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Continue'])[1]")
	WebElement clickcontinue;
	public Spicejet_roundtrip_addons_page passenger_continue() {
		action(clickcontinue);
		return new Spicejet_roundtrip_addons_page(driver);
	}


}
