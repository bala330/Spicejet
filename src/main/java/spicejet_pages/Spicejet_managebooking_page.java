package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_managebooking_page extends Spicejet_base_class{
	
	public Spicejet_managebooking_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@placeholder='e.g. W3X3H8']")
	WebElement number;
	public Spicejet_managebooking_page pnrnumber(String name) {
		sendkeys(number, name);
		return this;
	}
	@FindBy(xpath = "//input[@placeholder='john.doe@spicejet.com / Doe']")
	WebElement email;
	public Spicejet_managebooking_page emailid(String name) {
		sendkeys(email, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='Search Booking']")
	WebElement button;
	public Spicejet_managebooking_page searchbooking() {
		action(button);
		return this;
	}
	

}
