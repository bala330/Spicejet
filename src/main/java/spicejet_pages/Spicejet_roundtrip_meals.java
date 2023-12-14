package spicejet_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_roundtrip_meals extends Spicejet_base_class{
	
	public Spicejet_roundtrip_meals(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[text()='BREAKFAST (2)']")
	WebElement clicksandwich;
	public Spicejet_roundtrip_meals clicksandwich() {
		action(clicksandwich);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1mlwlqe r-z80fyv r-zso239 r-1udh08x r-19wmn03 r-1lgpqti'])[2]")
	WebElement clickveg;
	public Spicejet_roundtrip_meals click_veg_sandwich() {
		action(clickveg);
		return this;
	}
	@FindBy(xpath = "//div[text()='SANDWICH (2)']")
	WebElement breakfast;
	public Spicejet_roundtrip_meals breakfast() {
		action(breakfast);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1mlwlqe r-z80fyv r-zso239 r-1udh08x r-19wmn03 r-1lgpqti'])[2]")
	WebElement veg;
	public Spicejet_roundtrip_meals breakfast_veg() {
			action(veg);
		return this;
	}
	public Spicejet_roundtrip_meals Assertofflightbooking_meals() {
		Assert(driver.getCurrentUrl(), "https://www.spicejet.com/booking/addons/meals");
		return this;
	}
	@FindBy(xpath = "//div[text()='DINNER (2)']")
	WebElement clicksandwich1;
	public Spicejet_roundtrip_meals clicksandwich1() {
		action(clicksandwich1);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1mlwlqe r-z80fyv r-zso239 r-1udh08x r-19wmn03 r-1lgpqti'])[2]")
	WebElement clicknonveg;
	public Spicejet_roundtrip_meals click_nonveg_sandwich() {
		action(clicknonveg);
		return this;
	}
	@FindBy(xpath = "//div[text()='SANDWICH (2)']")
	WebElement dinner;
	public Spicejet_roundtrip_meals click_dinner() {
		action(dinner);
		return this;
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1mlwlqe r-z80fyv r-zso239 r-1udh08x r-19wmn03 r-1lgpqti'])[2]")
	WebElement dinnerveg;
	public Spicejet_roundtrip_meals dinner_veg() {
		action(dinnerveg);
		return this;
	}
	
	@FindBy(xpath = "//div[text()='Done']")
	WebElement donebutton;
	public Spicejet_roundtrip_addons_page clickdone() {
		action(donebutton);
		return new Spicejet_roundtrip_addons_page(driver);
	}
}
