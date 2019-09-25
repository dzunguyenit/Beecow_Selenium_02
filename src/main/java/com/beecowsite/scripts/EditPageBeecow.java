package com.beecowsite.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecowsite.actions.CreatePageBeecowSite;
import com.beecowsite.actions.EditPageBeecowSite;
import com.beecowsite.actions.LoginPagesBeecowSite;

import Common.CommonTestCases;

public class EditPageBeecow  extends CommonTestCases {
	WebDriver driver;
	LoginPagesBeecowSite logInPage;
	EditPageBeecowSite registerPage;
	CreatePageBeecowSite homPage;
	

	@Parameters({ "brower", "version", "url" })
	@BeforeClass
	public void BeforeClass(String brower, String version, String url) {
		driver = openBrower(brower, version, url); 
	}
	@Test
	public void createAccount() {
	

	}
	
	@AfterClass
	public void AfterClass() {
		//closeBrowser();
	}
}
