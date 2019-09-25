package com.beecowsite.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecowsite.actions.CreatePageBeecowSite;
import com.beecowsite.actions.LoginPagesBeecowSite;

import Common.CommonTestCases;
import ObjectPageJson.JsonData;

public class LoginPageBeecow extends CommonTestCases {
	WebDriver driver;
	LoginPagesBeecowSite logInPage;
	
	CreatePageBeecowSite homePage;
	JsonData commonData;

	@Parameters({ "brower", "version", "url" })
	@BeforeClass
	public void BeforeClass(String brower, String version, String url) {
		driver = openBrower(brower, version, url);

		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("Beecow.json");
		commonData = getDataJson(pathFileJson);
		homePage = PageFactory.initElements(driver, CreatePageBeecowSite.class);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.beecow.com");
		logInPage = homePage.clickLoginbtn();

	}

	@Test
	public void TC_001() {
		logInPage.inputUserID(commonData.getLoginPageBeecow().getValueUser());
		logInPage.inputPassword(commonData.getLoginPageBeecow().getValuePass());
		logInPage.clickLogin();
		assertEqual(logInPage.getMessageToVerify(), commonData.getLoginPageBeecow().getInvalidUserAndPassMsg());
	}

	@Test
	public void TC_002() {
		logInPage.inputUserID(commonData.getLoginPageBeecow().getNumberic());
		logInPage.clickLogin();
		assertEqual(logInPage.getMessagePhoneToVerify(),
				commonData.getLoginPageBeecow().getPhoneNumerIsInvaildFormatMsg());
		assertEqual(logInPage.getMessageToVerify(), commonData.getLoginPageBeecow().getInvalidUserAndPassMsg());
	}

	@Test
	public void TC_003() {
		logInPage.inputUserID(commonData.getLoginPageBeecow().getNumbericEmail());
		logInPage.clickLogin();
		assertEqual(logInPage.getMessageEmailFailToVerify(), commonData.getLoginPageBeecow().getEmailFailMsg());
		assertEqual(logInPage.getMessageToVerify(), commonData.getLoginPageBeecow().getInvalidUserAndPassMsg());
	}

	@Test
	public void TC_004() {
		logInPage.inputUserID(commonData.getLoginPageBeecow().getEmail());
		logInPage.clickLogin();
		assertEqual(logInPage.getMessageToVerify(), commonData.getLoginPageBeecow().getInvalidUserAndPassMsg());
	}

	@Test
	public void TC_005() {
		logInPage.inputUserID(commonData.getLoginPageBeecow().getEmail());
		logInPage.inputPassword(commonData.getLoginPageBeecow().getPassthreenumber());
		logInPage.clickLogin();
		assertEqual(logInPage.getMessageGeneralToVerify(),
				commonData.getLoginPageBeecow().getMinimumCharacterIsInvaildFormatMsg());
//		String a =logInPage.getMessageGeneralToVerify();
//		assertEqual(a, commonData.getLoginPageBeecow().getInvalidUserAndPassMsg());

	}

	@Test
	public void TC_006() {
		logInPage.inputUserID(commonData.getLoginPageBeecow().getEmail());
		logInPage.inputPassword(commonData.getLoginPageBeecow().getPassFail());
		logInPage.clickLogin();

		assertEqual(logInPage.getMessagePassFailToVerify(), commonData.getLoginPageBeecow().getPassFailMsg());

	}

	@Test
	public void TC_007() {
		logInPage.inputUserID(commonData.getLoginPageBeecow().getEmail());
		logInPage.inputPassword(commonData.getLoginPageBeecow().getPassTrue());
		logInPage.clickLogin();
		assertEqual(logInPage.getMessageAcountPassToVerify(), commonData.getLoginPageBeecow().getIsProblemTryAgainMsg());
	}

	@AfterClass
	public void AfterClass() {
		closeBrowser();
	}
}
