package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyMyColletionTest {
	
	private WebDriver driver;
	UserLogInPage verifyMyOwnColletion;

	@Before
	public void setUp() throws Exception {
		verifyMyOwnColletion = new UserLogInPage(driver);
		driver = verifyMyOwnColletion.chromeDriverConnection();
		verifyMyOwnColletion.visit("https://www.rijksmuseum.nl/es/visit");
		Thread.sleep(5000);	
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		verifyMyOwnColletion.SignInPage();
		Thread.sleep(3000);
		Boolean update = verifyMyOwnColletion.verifyMyColletion();
		
		System.out.print(update);
	}

}
