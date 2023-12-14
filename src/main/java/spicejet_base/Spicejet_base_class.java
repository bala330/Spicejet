package spicejet_base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import spicejet_ultility.Spicejet_ultility_class;

public class Spicejet_base_class extends Spicejet_ultility_class {
	
	
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
