package com.java.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.BaseTest;

public class DropdownDemo extends BaseTest
{
	public void expandDropDown()
	{
		driver.findElement(By.xpath("//button[@class='dropdown dropdown-toggle']")).click();
	}
	
	/* public void clickDropdownExample() 
	 { 
		 driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click(); 
	 }
	 
	 public void selectBootstrapDropdown(String strDrpOption) 
	 {
	 List<WebElement> listWebElement = driver.findElements(By.xpath("//button[@class='btn btn-primary dropdown-toggle']/following::ul[@class='dropdown-menu']")); 
	 int intListSize = listWebElement.size();
	 System.out.println(" intListSize : "+intListSize); 
	 for (WebElement webElement: listWebElement) 
	 { 
		 if(webElement.getText().trim().equals(strDrpOption)) 
		 {
			 webElement.click(); 
			 break; 
		 }
		}
	 }*/
	 
	public void displayDropDownList(String strdropDown)
	{
		List<WebElement> listWebElement = driver.findElements(By.xpath("//button[@class='dropdown dropdown-toggle']/following::ul[@class='dropdown-menu']/li/a"));
		System.out.println("Size of list is: "+listWebElement.size());
		for (WebElement webElementdropDown : listWebElement) 
		{
			System.out.println(webElementdropDown.getAttribute("innerHTML"));
			if (webElementdropDown.getAttribute("innerHTML").trim().contains(strdropDown)) 
			{
				webElementdropDown.click();
				break;
			}
		}
	
	
	
	}
}
