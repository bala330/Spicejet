package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_onewaytrip_meals extends Spicejet_base_class{
	
	public Spicejet_onewaytrip_meals(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Spicejet_onewaytrip_meals Assertofflightbooking_meals() {
		Assert(driver.getCurrentUrl(), "https://www.spicejet.com/booking/addons/meals");
		return this;
	}
	@FindBy(xpath = "//div[text()='BREAKFAST (2)']")
	WebElement clicksandwich;
	public Spicejet_onewaytrip_meals clicksandwich() {
		action(clicksandwich);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1mlwlqe r-z80fyv r-zso239 r-1udh08x r-19wmn03 r-1lgpqti'])[2]")
	WebElement clicknonveg;
	public Spicejet_onewaytrip_meals click_nonveg_sandwich() {
		action(clicknonveg);
		return this;
	}
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1ewfge1 r-z2wwpe r-rs99b7 r-1tbvqmw r-1loqt21 r-15d164r r-6dt33c r-1oqcu8e r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-13qz1uu']")
	WebElement clickpassenger2;
	public Spicejet_onewaytrip_meals passenger2() {
		action(clickpassenger2);
		return this;
	}
	@FindBy(xpath = "//div[text()='SANDWICH (2)']")
	WebElement clicksancks;
	public Spicejet_onewaytrip_meals clicksancks() {
		action(clicksancks);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1mlwlqe r-z80fyv r-zso239 r-1udh08x r-19wmn03 r-1lgpqti'])[2]")
	WebElement clicknonveg_snacks;
	public Spicejet_onewaytrip_meals click_nonveg_sancks() {
		action(clicknonveg_snacks);
		return this;
	}
	@FindBy(xpath = "//div[text()='Done']")
	WebElement donebutton;
	public Spicejet_onewaytrip_addons_page clickdone() {
		action(donebutton);
		return new Spicejet_onewaytrip_addons_page(driver);
	}
	

}
