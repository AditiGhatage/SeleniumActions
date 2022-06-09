package com.java.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.generic.BaseTest;

public class EnterIntoElements extends BaseTest
{
	public void clickOntoElementsinDemoQA() 
	{	
		WebElement enterElements = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg > path"));
		JavascriptExecutor objJS = (JavascriptExecutor)driver;
		objJS.executeScript("arguments[0].scrollIntoView();", enterElements);
		enterElements.click();
	}

}
