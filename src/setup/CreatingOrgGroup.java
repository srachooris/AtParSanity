package setup;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import BrowserInitialization.BrowserInit;
import ExcelReader.ExcelReader;

public class CreatingOrgGroup extends BrowserInit{

	//Creating a User
	
	@Test(priority=1, description="Creating an Org Group")
	public static void orgGroupCreation() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//WebElement Atpar = driver.findElement(By.xpath("//p[contains(.,' AtPar ')]"));
		//Atpar.isEnabled();
		
		System.out.println("Org Group Method");
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[contains(.,'Administration')]"))));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebElement administration = driver.findElement(By.xpath("//h4[contains(.,'Administration')]"));
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		administration.click();
		//System.out.println("Org Group");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebElement sidebar = driver.findElement(By.xpath("//div[@id='sidebar-menu']"));
		sidebar.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement AppSetup = driver.findElement(By.xpath("//a[contains(.,'App Setup')]"));
		AppSetup.click();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		WebElement ManageOrgGroup = driver.findElement(By.xpath("//a[@href='/AtPar/AtParWeb/atpar/appsetup/manageorggroups']"));
				ManageOrgGroup.click();
		
			//	driver.findElement(By.xpath("//a[contains(@href,'/AtPar/AtParWeb/atpar/appsetup/manageorggroups')]"));
		
		String ManageOrgGroupTitle = driver.getTitle();
		AssertJUnit.assertEquals(ManageOrgGroupTitle, "AtPar - Manage Org Groups" );
		
	
		System.out.println("Title Verified");
		
	}
	
	@Test(priority = 2, dependsOnMethods = "orgGroupCreation", description="Creating an Org Group ID")
	public static void createOrgGroupID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		System.out.println("Creating an Org Group ID");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebElement Createbtn = driver.findElement(By.id("add"));
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Createbtn.click();
		
		WebElement orgGroupID = driver.findElement(By.xpath("//input[@id='txtOrgGrpId']"));
		orgGroupID.sendKeys(ExcelReader.getCellData(13,4));
		
		WebElement saveBtn = driver.findElement(By.xpath("//button[contains(.,'Save')]"));
		boolean savebtnState = saveBtn.isEnabled();
		System.out.println("State "+savebtnState);
		WebElement orgGroupname = driver.findElement(By.xpath("//input[@id='txtOrgGrpName']"));
		orgGroupname.sendKeys(ExcelReader.getCellData(14,4));
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebElement saveBtn1 = driver.findElement(By.xpath("//button[contains(.,'Save')]"));
		boolean savebtnState1 = saveBtn.isEnabled();
		System.out.println("State "+savebtnState1);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		saveBtn.click();
		WebElement successGrowl = driver.findElement(By.xpath("//span[contains(.,'Success')]"));
		
		String growlMsg = successGrowl.getText();
		AssertJUnit.assertEquals(growlMsg, "Success");
		
		System.out.println("assert success");
		
	
		

		
		
		
	}
	
}
