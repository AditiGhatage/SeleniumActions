package com.java.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.BaseTest;

public class LinksDemo extends BaseTest
{
	public void getHomeLink()
	{
		WebElement link = driver.findElement(By.linkText("Home"));
		link.click();
		System.out.println("Page navigated succesfully.");
	}
	
	public void getDynamicLink()
	{
		WebElement link = driver.findElement(By.id("dynamicLink"));
		link.click();
		System.out.println("Page navigated succesfully in dynamic.");
	}
	
	public void createdAPILink() {
		driver.findElement(By.id("created")).click();
		System.out.println("Created Link is Clicked");
		
	}
	
	public void no_ContentAPILink() {
		driver.findElement(By.id("no-content")).click();
		System.out.println("No Content Link is Clicked");
		
	}
	
	public void movedAPILink() {
		driver.findElement(By.id("moved")).click();
		System.out.println("Moved Link is Clicked");
		
	}
	
	public void badRequestAPILink() {
		driver.findElement(By.xpath("//a[@id='bad-request']")).click();
		System.out.println("Bad Request Link is Clicked");
		
	}
	public void unAuthorizedAPILink() {
		driver.findElement(By.linkText("Unauthorized")).click();
		System.out.println("Unauthorized Link is clicked");
	}
	public void forbiddenAPILink() {
		driver.findElement(By.id("forbidden")).click();
		System.out.println("Forbidden Link is Clicked");
	}
	public void notFoundAPILink() {
		driver.findElement(By.id("invalid-url")).click();
		System.out.println("Not Found Link is Clicked");
	}

	
	//Broken links
	public void validLinks()
	{
		driver.findElement(By.linkText("Click Here for Valid Link"));
		System.out.println("Valid link clicked..");
	}
	
	public void brokenLinks() 
	{
		driver.findElement(By.linkText("Click Here for Broken Link"));
		System.out.println("Broken link clicked..");
	}
	
}
