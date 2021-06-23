package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Test(dependsOnMethods = { "MobileLoginCarLoan", "LoginAPICarLoan" })
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCar");
		// selenium
	}

	@AfterMethod

	public void BeforeMethod() {

		System.out.println("I will execute after every  method just check!!!");
	}

	@Test()
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCar");
		Assert.assertTrue(true);
	}

	@Parameters({ "URL" })
	@Test
	public void LoginAPICarLoan(String urlname) {

		System.out.println("APILoginCar");

		System.out.println(urlname);
		// Rest API Automation
	}
}
