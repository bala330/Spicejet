package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 7)
public class Tc_007_valid_check_in extends Spicejet_base_class{

	public void validcheckin() throws IOException {
		
		new Spicejet_Home_page(driver)
		.click_checkin()
		.pnrnumber("P52DKC")
		.emailid("balaramesh26@gmail.com")
		.searchbooking()
		;
		
		
	}

}
