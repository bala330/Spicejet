package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet_base.Spicejet_base_class;

public class Spicejet_signup_page extends Spicejet_base_class {
	
	
	public Spicejet_signup_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Spicejet_signup_page windowhandling() {
		windowshandling();
		return this;
	}
	@FindBy(xpath = "//select[@class='form-control form-select ']")
	WebElement select1;
	public Spicejet_signup_page select() {
		click(select1);
		selectoptions(select1);
		select.selectByVisibleText("Mr");
		return this;
	}
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstname;
	public Spicejet_signup_page firstname(String name) {
		sendkeys(firstname, name);
		return this;
	}
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastname;
	public Spicejet_signup_page lastname(String name) {
		sendkeys(lastname, name);
		return this;
	}
	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement select2;
	public Spicejet_signup_page select_national() {
		click(select2);
		selectoptions(select2);
		select.selectByValue("IN");
		return this;
	}
	@FindBy(xpath = "//input[@id='dobDate']")
	WebElement dob;
	public Spicejet_signup_page dateofbirth() {
		click(dob);
		return this;
	}
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement select3;
	public Spicejet_signup_page select_month() {
		click(select3);
		selectoptions(select3);
		select.selectByValue("4");
		return this;
	}
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement select4;
	public Spicejet_signup_page select_year() {
		click(select4);
		selectoptions(select4);
		select.selectByValue("1998");
		return this;
	}
	@FindBy(xpath = "//div[text()='18']")
	WebElement date;
	public Spicejet_signup_page date_click() {
		action(date);
		return this;
	}
	@FindBy(xpath = "//input[@class=' form-control']")
	WebElement phone;
	public Spicejet_signup_page phonenumber(String name) {
		sendkeys(phone, name);
		return this;
	}
	@FindBy(xpath = "//label[text()='Email ID']")
	WebElement scrolldown;
	public Spicejet_signup_page scrolldown() {
		javascript(scrolldown);
		return this;
	}
	@FindBy(xpath = "//input[@id='email_id']")
	WebElement email;
	public Spicejet_signup_page email(String name) {
		javascript_sendkeys(email);
		return this;
	}
	@FindBy(xpath = "//input[@id='new-password']")
	WebElement pass;
	public Spicejet_signup_page password(String name) {
		javascript_sendkeys(pass);
		return this;
	}
	@FindBy(xpath = "//input[@id='c-password']")
	WebElement confirmpass;
	public Spicejet_signup_page confirm_password(String name) {
		javascript_sendkeys(confirmpass);
		return this;
	}
	@FindBy(xpath = "//input[@id='defaultCheck1']")
	WebElement checkbox;
	public Spicejet_signup_page checkbox() {
		javascript_click(checkbox);
		return this;
	}
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement button;
	public Spicejet_signup_page click_sumbitbutton() {
		javascript_click(button);
		return this;
	}
	
	
	
	
	
	
	

}
