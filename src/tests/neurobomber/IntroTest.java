package tests.neurobomber;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.neurobomber.home.IntroPage;
import setup.WebDriverStartup;

public class IntroTest extends WebDriverStartup{
	IntroPage introPage;
	
	@Test
	public void FirstTest(){
		driver.get("http://www.neurobomber.com");
		introPage = new IntroPage(driver);
		introPage.click(By.xpath("//a[contains(text(),'Blog')]"));
		introPage.pause(5);
		String blogheader = introPage.getText(By.xpath("(//h2[@class='blog-post-title'])[1]"));
		System.out.println(blogheader);
	}
	
	@AfterMethod
	public void closeDriver(){
		driver.close();
		driver.quit();
	}
}
