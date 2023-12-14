package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 1)

public class Tc_001_valid_signup_page  extends Spicejet_base_class{
	
	
	public void validsignuppage() throws IOException {
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
		.email("rajkumar234@gmail.com")
		.password("Kumar237@")
		.confirm_password("Kumar237@")
		.checkbox()
		.click_sumbitbutton()
		;
	}

}
