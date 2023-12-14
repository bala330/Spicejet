package spicejet_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_roundtrip_addons_page extends Spicejet_base_class{

	public Spicejet_roundtrip_addons_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@id='at_addon_close_icon']")
	WebElement close;
	public Spicejet_roundtrip_addons_page adds_close() {
		javascript_click(close);
		return this;
	}
	public Spicejet_roundtrip_addons_page Assertofflightbooking_addons() {
		Assert(driver.getCurrentUrl(), "https://www.spicejet.com/booking/addons");
		return this;
	}
	@FindBy(xpath = "(//div[@data-testid='bookingFlow-seats-add-cta'])[1]")
	WebElement click;
	public Spicejet_roundtrip_seat_page add_click() {
		action(click);
		return new Spicejet_roundtrip_seat_page(driver);
	}
	@FindBy(xpath = "//div[text()='Excess Baggage']")
	WebElement scrolldown;
	public Spicejet_roundtrip_addons_page scrolldown_excess() {
		javascript(scrolldown);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Continue'])[3]")
	WebElement clickcontinue;
	public Spicejet_roundtrip_payements_page continueclick() {
		action(clickcontinue);
		return new Spicejet_roundtrip_payements_page(driver);
	}

}
