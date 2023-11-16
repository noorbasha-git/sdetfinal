package com.portal.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends Base {
	
	@Test
	@Parameters({"validuser","validpass"})	
	public void portal_login_valid(String user,String pass) throws InterruptedException {
		driver.get("http://www.saucedemo.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
	String title=driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
	Assert.assertTrue(title.equalsIgnoreCase("Swag Labs"));
	
	
	
	}
	

}
