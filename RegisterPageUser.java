package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageUser extends Base{
	
	By loginLink = By.xpath("//li[@class='header-link']//span[contains(text(),'Login')]");
	By signUpLink = By.xpath("//a[normalize-space()='Sign up']");
	By rijksStudioName = By.xpath("//input[@id='register_name']");
	By email = By.xpath("//input[@id='register_email']");
	By passWord = By.cssSelector("#register_password");
	By passWordTwo = By.xpath("//input[@id='register_password2']");
	By checkBox = By.xpath("//input[@id='signupfornewsletter']");
	By signUpButton = By.cssSelector(" button[type='submit']");
	By avatarUser = By.xpath("//a[@Class = 'user-profile link']");

	public RegisterPageUser(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
public void registerUser() throws InterruptedException{
		By acceptButton = By.xpath("//span[contains(text(), 'Accept')]");
		click(acceptButton);
		click(loginLink);
		Thread.sleep(3000);
		click(signUpLink);
		if(isDisplayed(rijksStudioName)) {
			
			type("dmedinabcn", rijksStudioName);
			type("dmedinabcn3@gmail.com", email);
			type("dmedina2022", passWord);
			type("dmedina2022", passWordTwo);
			click(checkBox);	
			click(signUpButton);
			
		}
		else {
			System.out.print("Register page was not found");
		}
			
	}

}
