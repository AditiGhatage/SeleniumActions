package com.java.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.BaseTest;

public class BrowseWindows extends BaseTest
{
	public void getnewtab()
	{
		WebElement newtabBrowseWindow = driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
		newtabBrowseWindow.click();
		System.out.println("New tab is opened.");
		waitFor(2);
	}
	
	public void getnewWindow()
	{
		WebElement newWindowBrowserWindows = driver.findElement(By.id("windowButton"));
		newWindowBrowserWindows.click();
		System.out.println("New window is opened.");
		waitFor(2);
	}
	
	public void getNewWindowMessage() 
	{
		WebElement newWindowMessageBrowserWindows = driver.findElement(By.id("messageWindowButton"));
		newWindowMessageBrowserWindows.click();
		System.out.println("New window message is displayed.");
		waitFor(2);
	}
	
	
}
