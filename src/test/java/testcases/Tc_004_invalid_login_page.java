package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 4)
public class Tc_004_invalid_login_page extends Spicejet_base_class {

	public void invalidloginpage() throws IOException {
		new Spicejet_Home_page(driver)
		.login()
		.Email_click()
		.Password_login("Rajkumar23@")
		.click_login()
		;
		
	}

}
