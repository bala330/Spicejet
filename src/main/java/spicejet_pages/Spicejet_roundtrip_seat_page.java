package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_roundtrip_seat_page extends Spicejet_base_class{
	
	
	public Spicejet_roundtrip_seat_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//div[text()='4A'])[1]")
	WebElement clickseat1;
	public Spicejet_roundtrip_seat_page passenger1_from_seat() {
		action(clickseat1);
		return this;
	}
	
	@FindBy(xpath = "(//div[text()='Skip'])[1]")
	WebElement clickskip1;
	public Spicejet_roundtrip_seat_page passenger1_from_clickskip() {
		try {
			action(clickskip1);
		} catch (Exception e) {
			
		}
		return this;
	}
	@FindBy(xpath = "(//div[text()='4B'])[1]")
	WebElement clickseat2;
	public Spicejet_roundtrip_seat_page passenger2_from_seat() {
		action(clickseat2);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Skip'])[1]")
	WebElement clickskip2;
	public Spicejet_roundtrip_seat_page passenger2_from_clickskip() {
		try {
			action(clickskip2);
		} catch (Exception e) {
			
		}
		return this;
	}
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-ry2h4h r-z2wwpe r-rs99b7 r-1loqt21 r-15d164r r-6dt33c r-1oqcu8e r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-13qz1uu']")
	WebElement clickpasenger;
	public Spicejet_roundtrip_seat_page clickpassenger() {
		action(clickpasenger);
		return this;
	}
	@FindBy(xpath = "(//div[text()='2D'])[1]")
	WebElement clickseat3;
	public Spicejet_roundtrip_seat_page passenger1_to_seat() {
		action(clickseat3);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Skip'])[1]")
	WebElement clickskip3;
	public Spicejet_roundtrip_seat_page passenger1_to_clickskip() {
		try {
			action(clickskip3);
		} catch (Exception e) {
			
		}
		return this;
	}
	@FindBy(xpath = "(//div[text()='2F'])[1]")
	WebElement clickseat4;
	public Spicejet_roundtrip_seat_page passenger2_to_seat() {
		action(clickseat4);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Skip'])[1]")
	WebElement clickskip4;
	public Spicejet_roundtrip_seat_page passenger2_to_clickskip() {
		try {
			action(clickskip4);
		} catch (Exception e) {
			
		}
		return this;
	}
	public Spicejet_roundtrip_seat_page Assertofflightbooking_seatmap() {
		Assert(driver.getCurrentUrl(), "https://www.spicejet.com/booking/addons/seatmap");
		return this;
	}
	@FindBy(xpath = "//div[text()='Select Meals']")
	WebElement meals;
	public Spicejet_roundtrip_meals click_meals() {
		action(meals);
		return new Spicejet_roundtrip_meals(driver);
	}

}
