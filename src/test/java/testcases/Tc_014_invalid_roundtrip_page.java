package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 14)
public class Tc_014_invalid_roundtrip_page extends Spicejet_base_class{
	
	
public void invalidroundtrip() throws IOException {
		
		new Spicejet_Home_page(driver)
		.click_roundtrip()
		.roundtrip_passengers()
		.roundtrip_chlid()
		.roundtrip_Infant()
		.roundtrip_click()
		.roundtrip_currency()
		.roundtrip_searchflight()
		;
		
		
	}

}
