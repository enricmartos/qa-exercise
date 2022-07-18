package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToMyCollectionTest {
	
	private WebDriver driver;
	UserLogInPage addToMyOwnColletion;

	@Before
	public void setUp() throws Exception {
		addToMyOwnColletion = new UserLogInPage(driver);
		driver = addToMyOwnColletion.chromeDriverConnection();
		addToMyOwnColletion.visit("https://www.rijksmuseum.nl/es/visit");
		Thread.sleep(5000);	
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		By acceptButton = By.xpath("//span[contains(text(), 'Accept')]");
		driver.findElement(acceptButton).click();
		addToMyOwnColletion.SignInPage();
		addToMyOwnColletion.addMyCollection();
		
		WebElement heart = driver.findElement(By.xpath("//img[@alt='The Milkmaid']"));
		Actions act = new Actions(driver);
		act.moveToElement(heart).perform();
		By addheart = By.xpath("//a[@data-title = \"The Milkmaid\"]");
		driver.findElement(addheart).click();
		Thread.sleep(3000);
		By myCollecButton = By.xpath("//a[normalize-space()='My first collection']");
		driver.findElement(myCollecButton).click();
		
	}

}
