package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterUserTest {
	
	
	
	private WebDriver driver;
	RegisterPageUser registerPageUser;

	@Before
	public void setUp() throws Exception {
		registerPageUser = new RegisterPageUser(driver);
		driver = registerPageUser.chromeDriverConnection();
		registerPageUser.visit("https://www.rijksmuseum.nl/es/visit");
		Thread.sleep(5000);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		registerPageUser.registerUser();
	
	}

}
