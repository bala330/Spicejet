package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 9)

public class Tc_009_valid_managebooking extends Spicejet_base_class{
	
	
	public void validmanagebooking() throws IOException {
		new Spicejet_Home_page(driver)
		.click_manageboking()
		.pnrnumber("P52DKC")
		.emailid("balaramesh26@gmail.com")
		.searchbooking()
		;
		
	}

}
