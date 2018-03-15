package setup;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import BrowserInitialization.BrowserInit;
import ExcelReader.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginPage extends BrowserInit {

	@Test(priority = 1, description = "This will login into the application using Admin credentials")
	public static void userLogin() throws EncryptedDocumentException, InvalidFormatException, IOException {
		System.out.println("Login Page");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement loginUserID = driver.findElement(By.id("txtUserID"));
		loginUserID.sendKeys(ExcelReader.getCellData(4, 1));

		WebElement loginPswd = driver.findElement(By.id("txtPassword"));
		loginPswd.sendKeys(ExcelReader.getCellData(5, 1));

		WebElement systemId =  (driver.findElement(By.xpath("//span[contains(.,'Select System ID')]")));
		systemId.click();
		
	//	WebElement drop = driver.findElement(By.xpath("//atpar-select[contains(.,'Select System ID')]"));
		
		WebElement manual = driver.findElement(By.xpath("//li[contains(.,'MANUAL (MANUAL)')]"));
		manual.click();
		
	//	Select sys = new Select(driver.findElement(By.xpath("//atpar-select[contains(.,'Select System ID')]")));

		//List<WebElement> options = systemId.getOptions();
		//options.
	//sys.selectByVisibleText("MANUAL");
	
	
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement Home = driver.findElement(By.xpath("//a[contains(.,'Home ')]"));
		Home.isEnabled();
		System.out.println("Login Successful");

	}

}
