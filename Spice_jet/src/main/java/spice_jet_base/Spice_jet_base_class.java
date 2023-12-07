package spice_jet_base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import spice_jet_utlilty.Spice_jet_utlility_class;

public class Spice_jet_base_class extends Spice_jet_utlility_class{
	

	@Parameters({"browser","url"})
	@BeforeMethod
	public void browserlaunch(String browser,String url) {
		launchbrowser(browser, url);
	}
	@AfterMethod
	public void browserclose() {
	closebrowser();
	}
}
