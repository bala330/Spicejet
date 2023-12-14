package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_onewaytrip_seat_page extends Spicejet_base_class{
	
	public Spicejet_onewaytrip_seat_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Spicejet_onewaytrip_seat_page Assertofflightbooking_seatmap() {
		Assert(driver.getCurrentUrl(), "https://www.spicejet.com/booking/addons/seatmap");
		return this;
	}
	@FindBy(xpath = "(//div[text()='3C'])[1]")
	WebElement clickseat1;
	public Spicejet_onewaytrip_seat_page passenger1_seat() {
		action(clickseat1);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Skip'])[1]")
	WebElement clickskip;
	public Spicejet_onewaytrip_seat_page passenger1_clickskip() {
		try {
			action(clickskip);
		} catch (Exception e) {
			
		}
		return this;
	}
	@FindBy(xpath = "(//div[text()='3B'])[1]")
	WebElement clickseat2;
	public Spicejet_onewaytrip_seat_page passenger2_seat() {
		action(clickseat2);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Skip'])[1]")
	WebElement clickskip1;
	public Spicejet_onewaytrip_seat_page passenger2_clickskip() {
		try {
			action(clickskip);
		} catch (Exception e) {
			
		}
		return this;
	}
	@FindBy(xpath = "//div[text()='Select Meals']")
	WebElement meals;
	public Spicejet_onewaytrip_meals click_meals() {
		action(meals);
		return new Spicejet_onewaytrip_meals(driver);
	}
	

}
