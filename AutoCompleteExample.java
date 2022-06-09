package com.java.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.BaseTest;

public class AutoCompleteExample extends BaseTest
{
	public void autoSuggest()
	{
		/*
		 * driver.findElement(By.id("autoCompleteMultipleContainer")).sendKeys("Red");
		 * List<WebElement> autoSuggest =
		 * driver.findElements(By.className("auto-complete__control css-yk16xz-control")
		 * ); for (WebElement alpha : autoSuggest) { System.out.println("Values are = "
		 * + alpha.getText()); if
		 * (alpha.getText().equalsIgnoreCase("selenium webdriver")); alpha.click();
		 * waitFor(2); break; }
		 */
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
        List<WebElement> autoSuggest = driver.findElements(By.className("UUbT9"));
      
        // print the auto suggest
        for (WebElement alpha : autoSuggest)
        {
        	System.out.println("Values are = " + alpha.getText());
        	if (alpha.getText().equalsIgnoreCase("selenium webdriver"));
        	alpha.click();
        	waitFor(2);
        	break;
        }
	}

	
}
