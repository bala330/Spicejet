package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import spicejet_base.Spicejet_base_class;
import spicejet_pages.Spicejet_Home_page;
@Test(priority = 6)
public class Tc_006_valid_roundtrip extends Spicejet_base_class{
	public void validroundtrip() throws IOException {
		
		new Spicejet_Home_page(driver)
		.click_roundtrip()
		.click_from_roundtrip()
		.roundtrip_from("bangalore")
		.roundtrip_to("mumbai")
		.roundtrip_from_date()
		.roundtrip_to_date()
		.roundtrip_passengers()
		.roundtrip_chlid()
		.roundtrip_Infant()
		.roundtrip_click()
		.roundtrip_currency()
		.roundtrip_searchflight()
		.roundtrip_scrolldown()
		.roundtrip_click_spiemax()
		.Assertofflightsearch()
		.roundtrip_continue()
		.click_title()
		.Assertofflightbooking()
		.click_Mr()
		.firstname("raj")
		.lastname("kumar")
		.phonenumber("9655913334")
		.emailid("rajkumar34@gmail.com")
		.country_click()
		.country("india")
		.Town("chennai")
		.scrolldown_passengerinformation()
		.passenger1_select()
		.passenger1_Mr()
		.passenger1_firsttname("mohan")
		.passenger1_lastname("kumar")
		.passenger1_next()
		.passenger2_firstname("ramya")
		.passenger2_select()
		.passenger2_miss()
		.passenger2_lastname("s")
		.passenger2_next()
		.passenger3_select()
		.passenger3_master()
		.passenger3_firstname("kumar")
		.passenger3_lastname("velu")
		.passenger3_dob()
		.passenger3_year()
		.passenger3_month()
		.passenger3_date()
		.passenger3_travell()
		.passenger3_travell_adult()
		.scrolldown_payable()
		.passenger_continue()
		.add_click()
		.passenger1_from_seat()
		.passenger1_from_clickskip()
	
		.passenger2_from_seat()
		.passenger2_from_clickskip()
		
		.passenger1_to_seat()
		.passenger1_to_clickskip()
		.passenger2_to_seat()
		.passenger2_to_clickskip()
		.Assertofflightbooking_seatmap()
		
		.click_meals()
		.clicksandwich()
		.click_veg_sandwich()
		.breakfast()
		.breakfast_veg()
		.clicksandwich1()
		.click_nonveg_sandwich()
		.click_dinner()
		.dinner_veg()
		.Assertofflightbooking_meals()
		.clickdone()
		
		.scrolldown_excess()
		.continueclick()
		
		.scrolldown_payement()
		.Assertofflightbooking_payments()
		.fames1()
		.cardnumber("8459560017537178")
	    .defaultframes1()
	     .fames2()
		 .cardname("harikumaran")
		  .defaultframes2()
		.fames3()
		.expmonth("08")
		.defaultframes3()
		.fames4()
		.expyear("28")
		.defaultframes4()
		.fames5()
		.cvvcode("369")
		.defaultframes5()
		.payement_button()
	
		;
		
		
	}

}
