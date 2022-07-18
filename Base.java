package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebDriver chromeDriverConnection() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public List<WebElement> findElements(By locator){
		return findElements(locator);
	}
	
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void clearField(By locator) {
		driver.findElement(locator).clear();
		
	}
	
	
	public void visit(String url) {
		driver.get(url);
	}

}
