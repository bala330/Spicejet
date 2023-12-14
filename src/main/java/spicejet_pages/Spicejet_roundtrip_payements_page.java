package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;

public class Spicejet_roundtrip_payements_page extends Spicejet_base_class{

	public Spicejet_roundtrip_payements_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[text()='Enter Debit / Credit Card Details']")
	WebElement scrolldown;
	public Spicejet_roundtrip_payements_page scrolldown_payement() {
		javascript(scrolldown);
		return this;
	}
	public Spicejet_roundtrip_payements_page Assertofflightbooking_payments() {
		Assert(driver.getCurrentUrl(), "https://www.spicejet.com/booking/prepayment");
		return this;
	}
    @FindBy(xpath = "//iframe[@class='card_number_iframe']")
    WebElement frame1;
    public Spicejet_roundtrip_payements_page fames1() {
    	iframes(frame1);
    	return this;
    }
    @FindBy(xpath = "//input[@id='card_number']")
    WebElement number;
    public Spicejet_roundtrip_payements_page cardnumber(String name) {
    	click(number);
    	sendkeys(number, name);
    	return this;
    }
    public Spicejet_roundtrip_payements_page defaultframes1() {
    	switchto();
    	return this;
    }
    @FindBy(xpath = "//iframe[@class='name_on_card_iframe']")
    WebElement frame2;
    public Spicejet_roundtrip_payements_page fames2() {
    	iframes(frame2);
    	return this;
    }
    @FindBy(xpath = "//input[@id='name_on_card']")
    WebElement cardname;
    public Spicejet_roundtrip_payements_page cardname(String name) {
    	click(cardname);
    	sendkeys(cardname, name);
    	return this;
    }
    public Spicejet_roundtrip_payements_page defaultframes2() {
    	switchto();
    	return this;
    }
    @FindBy(xpath = "//iframe[@class='card_exp_month_iframe']")
    WebElement frame3;
    public Spicejet_roundtrip_payements_page fames3() {
    	iframes(frame3);
    	return this;
    }
    @FindBy(xpath = "//input[@id='card_exp_month']")
    WebElement month;
    public Spicejet_roundtrip_payements_page expmonth(String name) {
    	click(month);
    	sendkeys(month, name);
    	return this;
    }
    public Spicejet_roundtrip_payements_page defaultframes3() {
    	switchto();
    	return this;
    }
    @FindBy(xpath = "//iframe[@class='card_exp_year_iframe']")
    WebElement frame4;
    public Spicejet_roundtrip_payements_page fames4() {
    	iframes(frame4);
    	return this;
    }
    @FindBy(xpath = "//input[@id='card_exp_year']")
    WebElement year;
    public Spicejet_roundtrip_payements_page expyear(String name) {
    	click(year);
    	sendkeys(year, name);
    	return this;
    }
    public Spicejet_roundtrip_payements_page defaultframes4() {
    	switchto();
    	return this;
    }
    @FindBy(xpath = "//iframe[@class='security_code_iframe']")
    WebElement frame5;
    public Spicejet_roundtrip_payements_page fames5() {
    	iframes(frame5);
    	return this;
    }
    @FindBy(xpath = "//input[@placeholder='123']")
    WebElement cvv;
    public Spicejet_roundtrip_payements_page cvvcode(String name) {
    sendkeys(cvv, name);
    	return this;
    }
   
    public Spicejet_roundtrip_payements_page defaultframes5() {
    	switchto();
    	return this;
    }
    @FindBy(xpath = "//div[text()='Proceed to pay']")
    WebElement clickpay;
    public Spicejet_roundtrip_payements_page payement_button() {
    	action(clickpay);
    	return this;
    }
   
    

	
}
