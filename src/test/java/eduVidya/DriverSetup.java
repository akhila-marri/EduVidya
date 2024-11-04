package eduVidya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverSetup {
	
	public static WebDriver driver;
		
	public static WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		
			ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("--ignore-certificate-errors");
			
			driver = new ChromeDriver(chromeOptions);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			EdgeOptions edgeOptions = new EdgeOptions();
	        edgeOptions.addArguments("--ignore-certificate-errors");
			
			driver = new EdgeDriver(edgeOptions);
		}
		else {
			System.out.println("Try entering a valid edge browser");
		}
		return driver;
	}
	
	

}
