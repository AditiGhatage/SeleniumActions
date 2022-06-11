package com.java.actions;

import org.openqa.selenium.By;

import com.generic.BaseTest;

public class WebTables extends BaseTest
{

public void clickOntoAddButton() {
		
		driver.findElement(By.id("addNewRecordButton")).click();
		System.out.println("Add button Clicked");
	}
	public void enterFirstNameinNewRecord() {
		
		String getname = "Aditi";
		driver.findElement(By.id("firstName")).sendKeys(getname);
		System.out.println("FirstName: " +getname);
	}
	public void enterLastNameinNewRecord() {
		String getLName = "Ghatage";
		driver.findElement(By.id("lastName")).sendKeys(getLName);
		System.out.println("LastName: " +getLName);
	}
	
	public void enteremailIDinNewRecord() {
	
	driver.findElement(By.id("userEmail")).sendKeys("aditi@gmail.com");
	System.out.println("EmailID is entered in New Reocrd ");
}

	public void enterAge() {
		driver.findElement(By.id("age")).sendKeys("27");
		System.out.println("Age added");
		}
	public void enterSalary() {
		driver.findElement(By.id("salary")).sendKeys("27000");
		System.out.println("Salary added");
		}
	public void enterDepartment() {
		driver.findElement(By.id("department")).sendKeys("compliance");
		System.out.println("Department added");
		waitFor(2);
		}
	public void clickSubmitToNewRecord(){
		driver.findElement(By.id("submit")).click();
		System.out.println("Record submitted successfully.");
		}
	public void editSelectedRecord() 
	{
		
		driver.findElement(By.id("edit-record-1")).click();
	}
	
	public void editinSelectedRecord() {
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Sangram");
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Ghatage");
		driver.findElement(By.id("userEmail")).clear();
		driver.findElement(By.id("userEmail")).sendKeys("sam12@gmail.com");
		driver.findElement(By.id("age")).clear();
		driver.findElement(By.id("age")).sendKeys("32");
		driver.findElement(By.id("salary")).clear();
		driver.findElement(By.id("salary")).sendKeys("25000");
		driver.findElement(By.id("submit")).click();
		System.out.println("Values of Selected Row are edited");
	
	}
	public void verifytheEditedRow() 
	{	
		driver.findElement(By.id("searchBox")).clear();
		System.out.println("Vega is removed from SearchBox");
	}
	
}
