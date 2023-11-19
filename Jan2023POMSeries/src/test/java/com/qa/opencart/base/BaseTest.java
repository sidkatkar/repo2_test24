package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.factory.OptionsManager;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.RegisterPage;
import com.qa.opencart.pages.ResultsPage;

public class BaseTest {

	WebDriver driver;
	OptionsManager optionsManager;
	protected LoginPage loginPage;
	protected AccountsPage accPage;
	protected ResultsPage resultsPage;
	protected ProductInfoPage productInfoPage;
	protected RegisterPage registerPage;
	
	protected DriverFactory df;
	protected Properties prop;
	
	protected SoftAssert softAssert;
	public Properties propb;

	//@Parameters({"browser", "browserversion"})
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop = df.initProp();
//		String browserName =prop.getProperty("browser");
//		String browserVersion = prop.getProperty("browserversion");
			if(prop.getProperty("browser")!=null) {
				//prop.getProperty("browser");
				prop.getProperty("browser");
				prop.getProperty("browserversion");
//				prop.getProperty(browserName);
//				prop.getProperty(browserVersion);
				//prop.setProperty("browserversion", browserVersion);
			}		
		driver = df.initDriver(prop);
		
		loginPage = new LoginPage(driver);
		softAssert = new SoftAssert();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

