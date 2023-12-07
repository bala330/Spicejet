package spice_jet_utlilty;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spice_jet_utlility_class {
	
	public WebDriver driver;
	
	public void launchbrowser(String browser,String url) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifactions");
		WebDriver driver=new ChromeDriver(option);
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.spicejet.com/");
	}
	public void sendkeys(WebElement element,String values) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(values);
	}
	public void click(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	public void Action(WebElement element) {
  		Actions a=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		a.click(element).build().perform();
	}
	public void clear(WebElement elemnt) {
		elemnt.clear();
	}
	public void scrolldown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void Asserturl(String actualurl,String Exceptedurl) {
	    Asserturl(actualurl, Exceptedurl);
	}
	public void closebrowser() {
		driver.quit();
	}
	

}
