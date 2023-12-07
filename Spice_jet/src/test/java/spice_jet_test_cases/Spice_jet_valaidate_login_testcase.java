package spice_jet_test_cases;

import org.testng.annotations.Test;

import spice_jet_base.Spice_jet_base_class;
import spice_jet_pages.Spice_jet_home_page;

public class Spice_jet_valaidate_login_testcase extends Spice_jet_base_class{
	
	@Test
	public void logintest() {
		new Spice_jet_home_page(driver)
		.loginclick()
		.login_phonenumber("9655913336")
		.login_password("Rajkumar23@")
		.login_button()
		.closebrowser();
	}

}
