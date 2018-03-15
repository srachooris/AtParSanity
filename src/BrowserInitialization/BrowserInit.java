package BrowserInitialization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.eclipse.jetty.util.log.LoggerLog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ExcelReader.ExcelReader;


public class BrowserInit extends ExcelReader {
//public static LoggerLog log = new LoggerLog("BrowserInit");
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void initbrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.gecko.driver","E:\\Sravan\\AtPar\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 5);
		
	//	log.getLogger("Browser Initialized");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println("Reading the application URL from the Excel sheet");
		
		String URL = ExcelReader.getCellData(1, 1);
				
				//"http://192.168.176.113/AtPar/AtParWeb/index.html";
		
		
		System.out.println("URL read from the Excel");
		
		driver.get(URL);
		
		System.out.println("Page is loaded with the given URL");
		//log.getLogger("Access excel");
	}
	
	
	
	
}
