package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 12)
public class Tc_012_invalid_managebooking extends Spicejet_base_class{
	
	

	public void invalidmanagebooking() throws IOException {
		new Spicejet_Home_page(driver)
		.click_manageboking()
		.pnrnumber("P52DKC")
		.searchbooking()
		;
		
	}
}
