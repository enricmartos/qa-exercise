package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

	public class UserLogInPage extends Base{
		
		
	public UserLogInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	By loginLink = By.xpath("//li[@class='header-link']//span[contains(text(),'Login')]");
	By email = By.id("email");
	By passWord = By.name("password");
	By submitBtn = By.xpath("//button[@type = 'submit']");
	By homePageLocator = By.xpath("//a[@class = 'user-profile link']");
	
	By explorer = By.xpath("//span[normalize-space()='Rijksstudio']");
	By jvArtist = By.xpath("//a[normalize-space()='Johannes Vermeer']");
	By headerArtist = By.xpath("//h1[normalize-space()='Johannes Vermeer']");
	By paintArtist = By.xpath("//img[@alt='The Milkmaid']");
	By avatarUser = By.xpath("(//div[@class='avatar-placeholder'][normalize-space()='D'])[2]");
	By myColletion = By.xpath("(//a[normalize-space()='My first collection'])[1]");
	By numOfPaints = By.xpath("//span[@xpath = '1']");
	By paintInMyCollection = By.xpath(" //a[normalize-space()='The Milkmaid']");
	
	By searchIcon = By.xpath("//a[@aria-label='Search']//*[name()='svg']");
	By searchBox = By.xpath("//input[@placeholder='For info, artist, guided tour or more']");
	By searchButton = By.xpath("(//button[normalize-space()='Search'])[1]");
	
	By viewAll = By.xpath("(//a[contains(text(),'View all')])[1]");
	
	By advanceSearch = By.xpath("//a[normalize-space()='Advanced search']");
	
	By nameArtist = By.xpath("(//input[@placeholder='Type to search'])[1]");
	By titleArtist = By.xpath("(//input[@type='text'])[12]");
	By checkBox = By.xpath("//input[@data-val-required='The Only with image field is required.']");
	By startYear = By.xpath("//input[@placeholder='Start year']");
	By endYear = By.xpath("//input[@placeholder='End year']");
	By findButton = By.xpath("//input[@value='Find']");
	
	By result = By.xpath("//a[normalize-space()='0 works']");
	
	
	
	
	
	public void SignInPage() {
		click(loginLink);
		if(isDisplayed(email)) {
			type("dmedinabcn3@gmail.com", email);
			type("dmedina2022", passWord);
			click(submitBtn);
		}
		else {
			System.out.print("Log In page was not fount");
		}
		
	}
	
	public boolean isHomePageDisplayed() {
		return isDisplayed(homePageLocator);
	}
	
	
	public void addMyCollection() throws InterruptedException{
		
		click(explorer);
		click(jvArtist);	
		Thread.sleep(3000);
		
		if(isDisplayed(headerArtist)) {
			
			System.out.print("Johannes Vermeer was found");
			
		}
		else {
			System.out.print("Johannes Vermeer was not found");
		}
		
	}
	
	public Boolean verifyMyColletion() throws InterruptedException {
		click(avatarUser);
		Thread.sleep(3000);
		By acceptButton = By.xpath("//button[contains(text(), 'Get started')]");
		click(acceptButton);
		click(myColletion);
		Thread.sleep(3000);
		By closeMessage = By.xpath("//button[contains(text(), 'Close')]");
		click(closeMessage);
		if(isDisplayed(paintInMyCollection)) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public String advancedSearch() throws InterruptedException {
		click(searchIcon);
		type("Utagawa Kuniyoshi" , searchBox);
		click(searchButton);
		Thread.sleep(3000);
		click(viewAll);
		Thread.sleep(3000);
		click(advanceSearch);
		type("Utagawa Kuniyoshi", nameArtist);
		type("De CHofu Tama", titleArtist);
		click(checkBox);
		type("1847", startYear);
		type("1850", endYear);
		click(findButton);
		Thread.sleep(3000);
		return findElement(result).getText();
		
	}

}
