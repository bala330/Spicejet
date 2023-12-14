package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;


@Test(priority = 2)
public class Tc_002_invalid_signup_page extends Spicejet_base_class{
	
	public void invalidsignuppage() throws IOException {
		new Spicejet_Home_page(driver)
		.clicksignup()
		.windowhandling()
		.select()
		.firstname("raj")
		.lastname("kumar")
		.select_national()
		.dateofbirth()
		.select_month()
		.select_year()
		.date_click()
		.scrolldown()
		.phonenumber("9655913337")
		
		.password("Kumar237@")
		.confirm_password("Kumar237@")
		.click_sumbitbutton()
		;

}
}