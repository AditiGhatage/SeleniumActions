package com.java.actions;

public class TestWebTables 
{

	public static void main(String[] args) throws Exception 
	{
		WebTables objwebtable = new WebTables();
		objwebtable.intializationDriver("https://demoqa.com/webtables");
		objwebtable.clickOntoAddButton();
		objwebtable.enterFirstNameinNewRecord();
		objwebtable.enterLastNameinNewRecord();
		objwebtable.enteremailIDinNewRecord();
		objwebtable.enterAge();
		objwebtable.enterDepartment();
		objwebtable.clickSubmitToNewRecord();
		objwebtable.editinSelectedRecord();
		
		objwebtable.tearDown();

	}

}
