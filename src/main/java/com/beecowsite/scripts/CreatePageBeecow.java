package com.beecowsite.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecowsite.actions.CreatePageBeecowSite;
import com.beecowsite.actions.EditPageBeecowSite;
import com.beecowsite.actions.LoginPagesBeecowSite;

import Common.CommonTestCases;
import ObjectPageJson.JsonData;

public class CreatePageBeecow extends CommonTestCases {
	WebDriver driver;
	LoginPagesBeecowSite logInPage;
	EditPageBeecowSite editpage;
	CreatePageBeecowSite homePage;
	JsonData commonData;


	@Parameters({ "brower", "version", "url" })
	@BeforeClass
	public void BeforeClass(String brower, String version, String url) throws InterruptedException {
		driver = openBrower(brower, version, url);

		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("Beecow.json");
		commonData = getDataJson(pathFileJson);
		homePage = PageFactory.initElements(driver, CreatePageBeecowSite.class);

		driver.get("https://www.beecow.com");
		logInPage = homePage.clickLoginbtn();
		logInPage.inputUserID(commonData.getHomePageBeecow().getEmail());
		logInPage.inputPassword(commonData.getHomePageBeecow().getPassTrue());
		logInPage.clickLogin();
		homePage.clickKenh();
		Thread.sleep(3000);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.beecow.com/page/upload-product");
		homePage.clickClosePopup();
	}

//	@Test
//	public void TC_008() throws InterruptedException {
//		assertEqual("https://www.beecow.com/page/upload-product", homePage.getCurrentUrl());
//		Thread.sleep(3000);
//	}
//
//	@Test
//	public void TC_009() {
//		homePage.clickDang();
//		assertEqual(homePage.getMessageImageToVerify(), commonData.getHomePageBeecow().getIMAGE_MSG());
//		assertEqual(homePage.getMessageNameSPToVerify(), commonData.getHomePageBeecow().getNAMESP_MSG());
//		assertEqual(homePage.getMessageCategorySPToVerify(), commonData.getHomePageBeecow().getCATEGORY_MSG());
//		assertEqual(homePage.getMessageDESCRIBEToVerify(), commonData.getHomePageBeecow().getDESCRIBE_MSG());
//		assertEqual(homePage.getMessageAMOUNTToVerify(), commonData.getHomePageBeecow().getAMOUNT_MSG());
//		assertEqual(homePage.getMessagePRICEToVerify(), commonData.getHomePageBeecow().getPRICE_MSG());
//		assertEqual(homePage.getMessageWEIGHTToVerify(), commonData.getHomePageBeecow().getWEIGHT_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//
//	@Test
//	public void TC_010() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.clickDang();
//		assertEqual(homePage.getMessageNameSPToVerify(), commonData.getHomePageBeecow().getNAMESP_MSG());
//		assertEqual(homePage.getMessageCategorySPToVerify(), commonData.getHomePageBeecow().getCATEGORY_MSG());
//		assertEqual(homePage.getMessageDESCRIBEToVerify(), commonData.getHomePageBeecow().getDESCRIBE_MSG());
//		assertEqual(homePage.getMessageAMOUNTToVerify(), commonData.getHomePageBeecow().getAMOUNT_MSG());
//		assertEqual(homePage.getMessagePRICEToVerify(), commonData.getHomePageBeecow().getPRICE_MSG());
//		assertEqual(homePage.getMessageWEIGHTToVerify(), commonData.getHomePageBeecow().getWEIGHT_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//
//	@Test
//	public void TC_011() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageDESCRIBEToVerify(), commonData.getHomePageBeecow().getDESCRIBE_MSG());
//		assertEqual(homePage.getMessageCategorySPToVerify(), commonData.getHomePageBeecow().getCATEGORY_MSG());
//		assertEqual(homePage.getMessageAMOUNTToVerify(), commonData.getHomePageBeecow().getAMOUNT_MSG());
//		assertEqual(homePage.getMessagePRICEToVerify(), commonData.getHomePageBeecow().getPRICE_MSG());
//		assertEqual(homePage.getMessageWEIGHTToVerify(), commonData.getHomePageBeecow().getWEIGHT_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//
//	public void TC_012() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
////		homePage.selectComboboxCategory2("Giày dép");
////		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.clickDang();
//		assertEqual(homePage.getMessageDESCRIBEToVerify(), commonData.getHomePageBeecow().getDESCRIBE_MSG());
//		assertEqual(homePage.getMessageAMOUNTToVerify(), commonData.getHomePageBeecow().getAMOUNT_MSG());
//		assertEqual(homePage.getMessagePRICEToVerify(), commonData.getHomePageBeecow().getPRICE_MSG());
//		assertEqual(homePage.getMessageWEIGHTToVerify(), commonData.getHomePageBeecow().getWEIGHT_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//
//	@Test
//	public void TC_013() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
////		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.clickDang();
//		assertEqual(homePage.getMessageDESCRIBEToVerify(), commonData.getHomePageBeecow().getDESCRIBE_MSG());
//		assertEqual(homePage.getMessageAMOUNTToVerify(), commonData.getHomePageBeecow().getAMOUNT_MSG());
//		assertEqual(homePage.getMessagePRICEToVerify(), commonData.getHomePageBeecow().getPRICE_MSG());
//		assertEqual(homePage.getMessageWEIGHTToVerify(), commonData.getHomePageBeecow().getWEIGHT_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_014() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageAMOUNTToVerify(), commonData.getHomePageBeecow().getAMOUNT_MSG());
//		assertEqual(homePage.getMessagePRICEToVerify(), commonData.getHomePageBeecow().getPRICE_MSG());
//		assertEqual(homePage.getMessageWEIGHTToVerify(), commonData.getHomePageBeecow().getWEIGHT_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_015() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessagePRICEToVerify(), commonData.getHomePageBeecow().getPRICE_MSG());
//		assertEqual(homePage.getMessageWEIGHTToVerify(), commonData.getHomePageBeecow().getWEIGHT_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_016() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageWEIGHTToVerify(), commonData.getHomePageBeecow().getWEIGHT_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_017() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHTFortynine_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageWeight50to1000ToVerify(), commonData.getHomePageBeecow().getWEIGHT50to1000_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_018() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1001_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageWeight50to1000ToVerify(), commonData.getHomePageBeecow().getWEIGHT50to1000_MSG());
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_019() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_020() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_021() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH1to50_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_022() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH51_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageWIDTHToVerify(), commonData.getHomePageBeecow().getWIDTH1to50_MSG());
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_023() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH1_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_024() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_025() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH1to30_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_026() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH31_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageLENGTHToVerify(), commonData.getHomePageBeecow().getLENGTH1to30_MSG());
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_027() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH1_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_028() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH30_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT_MSG());
//	}
//	@Test
//	public void TC_029() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH30_TXT());
//		homePage.inputHeight(commonData.getHomePageBeecow().getHEIGHT_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT1to50_MSG());
//	}
//	@Test
//	public void TC_030() {
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(commonData.getHomePageBeecow().getNAMESP_TXT());
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(commonData.getHomePageBeecow().getPRICE_TXT());
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH30_TXT());
//		homePage.inputHeight(commonData.getHomePageBeecow().getHEIGHT51_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageHEIGHTToVerify(), commonData.getHomePageBeecow().getHEIGHT1to50_MSG());
//	}
//	@Test
//	public void TC_031() {
//		String tenSanPham = commonData.getHomePageBeecow().getNAMESP_TXT() + randomNumberic();
//		String giasp = commonData.getHomePageBeecow().getPRICE_TXT();
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(tenSanPham);
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(giasp);
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH30_TXT());
//		homePage.inputHeight(commonData.getHomePageBeecow().getHEIGHT1_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageDoneToVerify(), commonData.getHomePageBeecow().getDone_MSG());
//		homePage.clickXemDanhMucSP();
//
//		assertEqual(homePage.getName(tenSanPham).toLowerCase(), tenSanPham.toLowerCase());
//		assertEqual(homePage.getPrice(tenSanPham), "đ " + giasp + ",000");
//
//	}

//	 @Test
//	public void TC_032() throws Exception {
//	
//		String tenSanPham = commonData.getHomePageBeecow().getNAMESP_TXT() + randomNumberic();
//		String giasp = commonData.getHomePageBeecow().getPRICE_TXT();
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(tenSanPham);
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(giasp);
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH30_TXT());
//		homePage.inputHeight(commonData.getHomePageBeecow().getHEIGHT1_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageDoneToVerify(), commonData.getHomePageBeecow().getDone_MSG());
//		homePage.clickXemDanhMucSP();
//		assertEqual(homePage.getName(tenSanPham).toLowerCase(), tenSanPham.toLowerCase());
//		assertEqual(homePage.getPrice(tenSanPham), "đ " + giasp + ",000");
//		
//	}
//	@Test
//	public void TC_033() throws Exception {
//		String tenSanPham = commonData.getHomePageBeecow().getNAMESP_TXT() + randomNumberic();
//		String giasp = commonData.getHomePageBeecow().getPRICE_TXT();
//		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
//		Upload.sendKeys("D:\\BeecowSite\\data\\hoa.jpg");
////		Upload.sendKeys("C:\\Users\\THUY\\eclipse-workspace\\BeecowSite\\data\\hoa.jpg");
//		homePage.inputNameSp(tenSanPham);
//		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
//		homePage.selectComboboxCategory1("Thời Trang Nữ");
//		homePage.selectComboboxCategory2("Giày dép");
//		homePage.selectComboboxCategory3("Giày đế dẹt");
//		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
//		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT_TXT());
//		homePage.inputPrice(giasp);
//		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT1000_TXT());
//		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH50_TXT());
//		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH30_TXT());
//		homePage.inputHeight(commonData.getHomePageBeecow().getHEIGHT50_TXT());
//		homePage.clickDang();
//		assertEqual(homePage.getMessageDoneToVerify(), commonData.getHomePageBeecow().getDone_MSG());
//		homePage.clickXemDanhMucSP();
//		assertEqual(homePage.getName(tenSanPham).toLowerCase(), tenSanPham.toLowerCase());
//		assertEqual(homePage.getPrice(tenSanPham), "đ " + giasp + ",000");
//
//		editpage = homePage.EditPageBeecowSite(tenSanPham);
//
//		assertEqual(tenSanPham, editpage.getNameValue(" $('input#name').val()"));
//		assertEqual("đ " + giasp + ",000",
//				editpage.getPriceValue("\"đ \" + $('input[formcontrolname=\"orgPrice\"]').val()"));
//		assertEqual(commonData.getHomePageBeecow().getDESCRIBE_TXT(), editpage.getEditDESCRIBE("$('[class=\"fr-element fr-view\"] p').text()"));
//
////		assertEqual(commonData.getHomePageBeecow().selectComboboxCategory1("Thời Trang Nữ"),editpage.getCombobox1()); 
////		assertEqual(commonData.getHomePageBeecow().selectComboboxCategory2("Giày dép"),editpage.getCombobox2()); 
////		assertEqual(commonData.getHomePageBeecow().selectComboboxCategory3("Giày đế dẹt"),editpage.getCombobox3()); 
//
//		assertEqual(commonData.getHomePageBeecow().getSKU_TXT(),editpage.getEditSKU("$('[id =\"org-sku\"]').val()")); 
//		assertEqual(commonData.getHomePageBeecow().getAMOUNT_TXT(),editpage.getEditAMOUNT("$('[formcontrolname=\"totalItem\"]').val()")); 
//		assertEqual(commonData.getHomePageBeecow().getWEIGHT1000_TXT(), editpage.getEditWEIGHT("$('[formcontrolname=\"weight\"]').val()"));
//		assertEqual(commonData.getHomePageBeecow().getWIDTH50_TXT(),editpage.getEditWIDTH("$('[formcontrolname=\"width\"]').val()")); 
//		assertEqual(commonData.getHomePageBeecow().getLENGTH30_TXT(),editpage.getEditLENGTH("$('[formcontrolname=\"length\"]').val()")); 
//		assertEqual(commonData.getHomePageBeecow().getHEIGHT50_TXT(),editpage.getEditHEIGHT("$('[formcontrolname=\"height\"]').val()")); 
//		
//	}

	@Test
	public void TC_034() throws InterruptedException {
		String tenSanPham = commonData.getHomePageBeecow().getNAMESP_TXT() + randomNumberic();
		String giasp = commonData.getHomePageBeecow().getPRICE_TXT();
		WebElement Upload = driver.findElement(By.xpath("//div[@id='upload-empty']/input"));
		Upload.sendKeys("D:\\Beecow_Selenium_02-master\\data\\hoa.jpg");
		homePage.inputNameSp(tenSanPham);
		homePage.inputDescribe(commonData.getHomePageBeecow().getDESCRIBE_TXT());
		homePage.selectComboboxCategory1("Thời Trang Nữ");
		homePage.selectComboboxCategory2("Giày dép");
		homePage.selectComboboxCategory3("Giày đế dẹt");
		homePage.inputSKU(commonData.getHomePageBeecow().getSKU_TXT());
		homePage.inputAmount(commonData.getHomePageBeecow().getAMOUNT9_TXT());
		homePage.inputPrice(giasp);
//		homePage.inputGiam(commonData.getHomePageBeecow().getGIAM9_TXT());
		homePage.inputWeight(commonData.getHomePageBeecow().getWEIGHT9000_TXT());
		homePage.inputWidth(commonData.getHomePageBeecow().getWIDTH49_TXT());
		homePage.inputLenght(commonData.getHomePageBeecow().getLENGTH29_TXT());
		homePage.inputHeight(commonData.getHomePageBeecow().getHEIGHT49_TXT());
		homePage.clickDang();
		assertEqual(homePage.getMessageDoneToVerify(), commonData.getHomePageBeecow().getDone_MSG());
		homePage.clickXemDanhMucSP();
		assertEqual(homePage.getName(tenSanPham).toLowerCase(), tenSanPham.toLowerCase());
		assertEqual(homePage.getPrice(tenSanPham), "đ " + giasp + ",000");
		editpage = homePage.EditPageBeecowSite(tenSanPham);

		Thread.sleep(2000);
		String EdittenSanPham = commonData.getHomePageBeecow().getNAMESP_TXT() + randomNumberic();
		homePage.inputNameSp(EdittenSanPham);
		
		Thread.sleep(2000);
		String EditPrice = commonData.getHomePageBeecow().getPRICE_TXT();
		homePage.inputPrice(EditPrice);
		
		editpage.clickEditQtySpan();
		editpage.inputEditAmount("0");
		editpage.clickEditXacNhan();
		editpage.clickEditCapnhat();
		editpage.clickEditXemChiTiet();
		assertEqual(editpage.getHetHang(),"Hết hàng");
		assertEqual(editpage.NameMsg(),EdittenSanPham);
		assertEqual(editpage.PriceMsg(), EditPrice);
//		assertEqual("đ " + giasp + ",000",
//				editpage.getPriceValue("\"đ \" + $('input[formcontrolname=\"orgPrice\"]').val()"));
//		assertEqual(commonData.getHomePageBeecow().getDESCRIBE_TXT(), editpage.getEditDESCRIBE("$('[class=\"fr-element fr-view\"] p').text()"));
		
//		assertEqual(EdittenSanPham, homePage.getTenSanPhamEdit());
//		assertEqual("đ " + EditPrice + ",000", homePage.getGiaSanPhamEdit());

	}

}
