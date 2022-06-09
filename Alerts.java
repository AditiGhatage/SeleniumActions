package com.java.actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generic.BaseTest;

public class Alerts extends BaseTest
{
	public void getAlert() 
	{
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton.click();
		System.out.println("Alert generated.");
	}
	public void confirmationAlert() 
	{
		/*WebElement confirmationButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmationButton.click();
		System.out.println("Confirm Alert generated.");*/
		driver.findElement(By.id("confirmButton")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("Alert text is : "+alertText);
		confirmationAlert.accept();
	}
	public void promptAlert() 
	{
		/*WebElement promptButton =
		 * driver.findElement(By.xpath("//button[@id='promtButton']")); //
		 * promptButton.click(); // System.out.println("Prompt Alert generated."); //
		 * waitFor(3);
		 */		
		driver.findElement(By.id("promptButton")).click();
		Alert promptAlert = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is : "+alertText);
		promptAlert.dismiss();
	}
	
	public void printAlertMessage() {
		Alert alert = driver.switchTo().alert();
		
		String strAlertMsg = alert.getText();
		System.out.println("Alert message is : "+strAlertMsg);
	}
	
	public void sendTextToAlert() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Aditi Ghatage");
	}
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void dismissAlert() 
	{
		driver.findElement(By.id("confirmButton")).click();
		Alert dismissconfirmationAlert = driver.switchTo().alert();
		String alertText = dismissconfirmationAlert.getText();
		System.out.println("Alert text is : "+alertText);
		dismissconfirmationAlert.dismiss();
		
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
	}
	
	public void timeAlert() 
	{
		try {
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		System.out.println("unexpected alert accepted");
		}
		catch(Exception e) {
		System.out.println("unexpected alert not present");
		}
	}
}
	
