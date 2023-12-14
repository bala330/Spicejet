package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_login_page extends Spicejet_base_class{
	
	public Spicejet_login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[4]")
	WebElement clickemail;
	public Spicejet_login_page Email_click() {
		click(clickemail);
		return this;
	}
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;
	public Spicejet_login_page Email_login(String name) {
		sendkeys(email, name);
		return this;
	}
	@FindBy(xpath = "//input[@type='password']")
	WebElement pass;
	public Spicejet_login_page Password_login(String name) {
		sendkeys(pass, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='LOGIN']")
	WebElement clickbutton;
	public Spicejet_login_page click_login() {
		action(clickbutton);
		return this;
	}
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-116pdpp r-1txcine r-6zzn7w r-1777fci r-q1j0wu']")
	WebElement text;
	public Spicejet_login_page Assert_login_page() {
		Assert(text.getText(), "B");
		return this;
	}
	
}
