package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 8)
public class Tc_008_valid_flightstatus extends Spicejet_base_class{
	
	public void validflightstatus() throws IOException {
		new Spicejet_Home_page(driver)
		.click_flightstatus()
		.depaturedate_click()
		.tomorrow_click()
		.flightstatus_from()
		.flightstatus_origin()
		.flightstatus_to("delhi")
		.search_flights()
		;
		
	}

}
