package spice_jet_test_cases;

import org.testng.annotations.Test;

import spice_jet_base.Spice_jet_base_class;
import spice_jet_pages.Spice_jet_home_page;

public class Test_valid extends Spice_jet_base_class {
	@Test
	public void textcasee() {
		new Spice_jet_home_page(driver)
		.one_way_button()
		.from()
		.enter_place("chennai")
		.clear_details_To_place("Delhi")
		.click_date()
		.click_adult()
		.click_child()
		.currency()
		.Currency_Click()
		.search_flight()
		.clickprice_button();
	}

}
