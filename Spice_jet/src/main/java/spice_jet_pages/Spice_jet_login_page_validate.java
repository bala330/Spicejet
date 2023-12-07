package spice_jet_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spice_jet_base.Spice_jet_base_class;

public class Spice_jet_login_page_validate extends Spice_jet_base_class {
	

	public Spice_jet_login_page_validate(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath = "//input[@type='number']")
	WebElement number;
	public Spice_jet_login_page_validate login_phonenumber(String name) {
		sendkeys(number, name);
		return this;
	}
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	public Spice_jet_login_page_validate login_password(String name) {
		sendkeys(password, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='LOGIN']")
	WebElement clickbutton;
	public Spice_jet_login_page_validate login_button() {
		Action(clickbutton);
		return this;
	}

}
