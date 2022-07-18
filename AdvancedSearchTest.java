package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearchTest {
	 
	private WebDriver driver;
	UserLogInPage advancedSearch;

	@Before
	public void setUp() throws Exception {
		advancedSearch = new UserLogInPage(driver);
		driver = advancedSearch.chromeDriverConnection();
		advancedSearch.visit("https://www.rijksmuseum.nl/es/visit");
		Thread.sleep(5000);	
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {

		advancedSearch.SignInPage();
		Thread.sleep(3000);
		String result = advancedSearch.advancedSearch();
		
		System.out.print(result);
		
		
	}

}
