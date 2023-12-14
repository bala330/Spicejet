package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_flightstatus_page extends Spicejet_base_class{
	
	public Spicejet_flightstatus_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement depaturedate;
	public Spicejet_flightstatus_page depaturedate_click() {
		action(depaturedate);
		return this;
	}
	@FindBy(xpath = "(//div[text()='Tomorrow'])[1]")
	WebElement tomorrow;
	public Spicejet_flightstatus_page tomorrow_click() {
		action(tomorrow);
		return this;
	}
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement clickfrom;
	public Spicejet_flightstatus_page flightstatus_from() {
		action(clickfrom);
		return this;
	}
	@FindBy(xpath = "//div[text()='Chennai']")
	WebElement clickfrom1;
	public Spicejet_flightstatus_page flightstatus_origin() {
		action(clickfrom1);
		return this;
	}
	
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;
	public Spicejet_flightstatus_page flightstatus_to(String name) {
		clearelements(to);
		sendkeys(to, name);
		return this;
	}
	@FindBy(xpath = "//div[text()='Search Flights']")
	WebElement flights;
	public Spicejet_flightstatus_page search_flights() {
		action(flights);
		return this;
	}
	

}
