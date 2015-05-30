package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
 * Web Driver Tools
 * These are very general functions designed to perform basic commands
 * e.g clicking, dragging, reading text, etc.
 * 
 * Most functions will take a locator and will sometimes return a value
 */ 
public class WebDriverTools {
	WebDriver driver;
	public WebDriverTools(WebDriver driver){
		this.driver = driver;
	}
	//Pauses for x amount of seconds
	public void pause(int time){
		try{
			Thread.sleep(time * 1000);
		}catch(Exception e){
			
		}
	}
	
	public void open(String url){
		driver.get(url);
	}
	
	public void click(By locator){
		driver.findElement(locator).click();
	}
	
	public String getText(By locator){
		return driver.findElement(locator).getText();
	}
}
