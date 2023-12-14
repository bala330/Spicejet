package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;

@Test(priority = 13)
public class Tc_013_onewaytrip_invalid_cardpayements extends Spicejet_base_class{
	
	public void invalid_onewaytrip_cardpayements() throws IOException {
		new Spicejet_Home_page(driver)
		.click_from()
		.onewaytrip_from("bangalore")
		.onewaytrip_to("delhi")
		.onewaytrip_date()
		.onewaytrip_passengers()
		.onewaytrip_chlid()
		.onewaytrip_click()
		.onewaytrip_currency()
		.onewaytrip_searchflight()
		.onewaytrip_click_spicsaver()
		.onewaytrip_continue()
		.click_title()
		.click_Mr()
		.firstname("ram")
		.lastname("kumar")
		.phonenumber("9655913337")
		.emailid("ramkumar234@gmail.com")
		.country_click()
		.country("india")
		.Town("salem")
		.scrolldown_passengerinformation()
		.passenger1_checkbox()
		.passenger1_next()
		.passenger2_firstname("ramya")
		.passenger2_select()
		.passenger2_miss()
		.passenger2_lastname("R")
		
		.scrolldown_payable()
		.passenger_continue()
		
		
		.add_click()
		.passenger1_seat()
		.passenger1_clickskip()
		.Assertofflightbooking_seatmap()
		.passenger2_seat()
		.passenger2_clickskip()
		.click_meals()
		.clicksandwich()
		.Assertofflightbooking_meals()
		.click_nonveg_sandwich()
		.clicksancks()
		.click_nonveg_sancks()
		
		.clickdone()
		
         .scrolldown_excess()
		.click_continue()
		.scrolldown_payement()
		.Assertofflightbooking_payments()
		.frame1()
		.cardnumber("845356478542")
		.defaultframes1()
		.frame3()
		.month("12")
		.defaultframes3()
		.frame4()
		.year("25")
		.defaultframes4()
		.frame5()
		.cvvcode("396")
		.defaultframes5()
		.payement()
		;
	}
	

}
