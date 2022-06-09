package com.java.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.BaseTest;

public class RadioButtonVerify extends BaseTest
{
	public void selectRadioButton()
	{
		WebElement yesOption = driver.findElement(By.xpath("//input[@id = 'yesRadio']"));
		yesOption.click();
		
		waitFor(3);
		WebElement noOption = driver.findElement(By.xpath("//input[@id = 'noRadio']"));
		noOption.click();
		
		waitFor(3);
		WebElement impOption = driver.findElement(By.xpath("//input[@id = 'impressiveRadio']"));
		impOption.click();
	}

}
