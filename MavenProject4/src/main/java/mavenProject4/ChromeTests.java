package mavenProject4;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTests {

	public ChromeTests() { 
	//System.setProperty("webdriver.chrome.driver","C:/Users/gmcke/oculus/automation/Drivers/ChromeDriver/chromedriver_win32/chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
	 
	ChromeDriver cd = new ChromeDriver();
	cd.get("https://www.redstate.com");
	}
}
