package com.java.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.BaseTest;

public class CheckBoxClass extends BaseTest
{
	public void toggleCheckBox()
	{
		driver.findElement(By.xpath("//button[@class= 'rct-collapse rct-collapse-btn']")).click();
		waitFor(2);
		//driver.findElement(By.xpath("//label[for ='tree-node-home']")).click();
	}
	
	public void clickDesktopcheckbox()
	{
		driver.findElement(By.xpath("//input[@id = 'tree-node-desktop']/parent::label/span[@class = 'rct-checkbox']")).click();
		//driver.findElement(By.xpath("//button[@class= 'rct-collapse rct-collapse-btn']")).click();
		waitFor(2);
	}

	public void checkDocuments()
	{
		driver.findElement(By.xpath("//input[@id='tree-node-documents']/parent::label/span[@class='rct-checkbox']")).click();
	}
	
	public void checkDownload()
	{
	driver.findElement(By.xpath("//input[@id='tree-node-downloads']/parent::label/span[@class='rct-checkbox']")).click();

	}
	
	
	public void verifyIsDisplayedAction() {
		WebElement Desktop = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
		if(Desktop.isDisplayed()) {
			System.out.println("Desktop option is checked.");
		}else {
			System.out.println("Desktop option is unchecked.");
		}
	}
	
	public void verifyIsEnabledAction() {
		WebElement Desktop = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
		if(Desktop.isEnabled()) {
			System.out.println("Desktop option is Enabled.");
		}else {
			System.out.println("Desktop option is disabled.");
		}
	}
	
	public void verifyIsSelectedAction() {
		WebElement Desktop = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
		if(Desktop.isSelected()) {
			System.out.println("Desktop checkbox is selected");
		}else {
			System.out.println("Checkbox is not selected");
		}
	}
	
	
}
