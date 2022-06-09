package com.java.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.generic.BaseTest;

public class ButtonsClick extends BaseTest
{
	public void doubleClickButton() {

		WebElement doubleClickdemo = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClickdemo).perform();
		System.out.println("You have done a double click");
		}

		public void rightClickButton() {

		WebElement rightClickdemo = driver.findElement(By.id("rightClickBtn"));
		Actions action1 = new Actions(driver);
		action1.contextClick(rightClickdemo).perform();
		System.out.println("You have done a right click");
		}

		public void clickButton() 
		{

		WebElement clickdemo = driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]"));
		clickdemo.click();
		System.out.println("Clicked Me");
		}

		

}
