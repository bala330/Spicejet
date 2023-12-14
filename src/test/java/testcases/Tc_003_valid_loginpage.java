package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 3)

public class Tc_003_valid_loginpage extends Spicejet_base_class{
	public void validloginpage() throws IOException {
		new Spicejet_Home_page(driver)
		.login()
		.Email_click()
		.Email_login("balaramesh26@gmail.com")
		.Password_login("Rajkumar23@")
		.click_login()
	    ;
		
	}

}
