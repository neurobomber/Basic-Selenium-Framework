package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverStartup {
	protected WebDriver driver = new FirefoxDriver();
	
	public WebDriverStartup(){
		driver.manage().window().maximize();
		
	}
}
