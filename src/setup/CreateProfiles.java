package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BrowserInitialization.BrowserInit;
import ExcelReader.ExcelReader;

public class CreateProfiles extends BrowserInit{

	@Test
	public static void createWebProf()
	{
		WebElement Manage_Profiles = driver.findElement(By.xpath("//a[@href='/AtPar/AtParWeb/atpar/appsetup/manageprofiles']"));
		
		Manage_Profiles.click();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	WebElement createBtn =	driver.findElement(By.xpath("//button[@id='create']"));
	createBtn.click();
	
	WebElement ProfileID = driver.findElement(By.id("txtParamProfileId"));
	ProfileID.sendKeys("SKYProfff111");
	
	
	WebElement ProfileDesc = driver.findElement(By.id("txtParaDescription"));
	ProfileDesc.sendKeys("SKYProff Desc1");
	
	WebElement WebALL = driver.findElement(By.id("mseover"));
	WebALL.click();
	
	WebElement SaveBtn = driver.findElement(By.xpath("//button[@class='btn btn-purple sbtn']"));
	SaveBtn.click();
	System.out.println("clicked on Save Button");
	
try{
	
	Alert alert = driver.switchTo().alert();
	System.out.println("Alert Appeared");
	alert.accept();
	
}
catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}

	WebElement yes = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default btn-warning ui-corner-all ui-button-text-icon-left firepath-matching-node']"));
	yes.click();
	
	
	}

	
	
}
