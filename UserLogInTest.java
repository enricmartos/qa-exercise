package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLogInTest {
	
	private WebDriver driver;
	UserLogInPage userLogInpage;

	@Before
	public void setUp() throws Exception {
		userLogInpage = new UserLogInPage(driver);
			driver = userLogInpage.chromeDriverConnection();
			userLogInpage.visit("https://www.rijksmuseum.nl/es/visit");
			Thread.sleep(5000);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {

		userLogInpage.SignInPage();
		
		assertEquals("Rijksmuseum", driver.getTitle());
	}

}
