package setup;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import setup.LoginPage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import BrowserInitialization.BrowserInit;

public class TestScript extends BrowserInit {

	//public static void main(String args[]) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	
	@Test
	public static void browserLaunch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		System.out.println("Initializing the Browser");
		BrowserInit.initbrowser();
		
		System.out.println("Logging into the application sing admin credentials");
		
		//BrowserInit.initbrowser();
		
		LoginPage.userLogin();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	CreatingOrgGroup.orgGroupCreation();
	CreatingOrgGroup.createOrgGroupID();
	CreateProfiles.createWebProf();
	}
	
}
