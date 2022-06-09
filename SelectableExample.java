package com.java.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.generic.BaseTest;

public class SelectableExample extends BaseTest
{
	public void selectlist()
	{
		Select selectfromList = new Select(driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]")));
		selectfromList.selectByVisibleText("Cras justo odio");
		System.out.println("Selected...");
		waitFor(2);
		//selectfromList.deselectAll();
	}
	
	public void dropdownSelection()
	{
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        List<WebElement> list = select.getOptions();

        System.out.println("The dropdown options are:");
        for(WebElement options: list)
        {
        System.out.println(options.getText());
        }

        System.out.println("Select the Option by Index 4");
        select.selectByIndex(4);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        
        System.out.println("Select the Option by Text Magenta");
        select.selectByVisibleText("Magenta");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

      
        System.out.println("Select the Option by value 6");
        select.selectByValue("6");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
        waitFor(2);
        
	}
}
