package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 10)
public class Tc_010_invalid_checkin extends Spicejet_base_class{
	public void invalidcheckin() throws IOException {
		
		new Spicejet_Home_page(driver)
		.click_checkin()
		.pnrnumber("")
		.emailid("balaramesh26@gmail.com")
		.searchbooking()
		;
		
		
	}

}
