package com.java.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.generic.BaseTest;

public class MouseActionEvents extends BaseTest
{
	
	public void hoverMouseEvent()
	{
		WebElement mouseHoverEventOverButton = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseHoverEventOverButton).build().perform();
		System.out.println("Hovered over button.");
		waitFor(2);
		
	}
	public void textHoverMouseEvent()
	{
		WebElement textHoverMouseEvent = driver.findElement(By.id("toolTipTextField"));
		Actions action = new Actions(driver);
		action.moveToElement(textHoverMouseEvent).build().perform();
		System.out.println("Hovered over text.");
		
	}
	
	public void droppableMouseEvent()
	{
		WebElement sourceDrag = driver.findElement(By.id("draggable"));
		WebElement destinationDrop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceDrag, destinationDrop).build().perform();
		System.out.println("Dargged successfully.");
		waitFor(2);
	}
	
	public void draggableMouseEvent()
	{
		WebElement sourceDrag = driver.findElement(By.id("dragBox"));
		WebElement destinationDrop = driver.findElement(By.id("dragBox"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceDrag, destinationDrop).build().perform();
		System.out.println("Dropped successfully.");
		waitFor(2);
		
	}

}
