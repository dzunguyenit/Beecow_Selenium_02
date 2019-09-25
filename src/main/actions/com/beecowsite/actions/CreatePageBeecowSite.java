package com.beecowsite.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecowsite.ui.CreatePageBeecowUI;
import com.beecowsite.ui.LoginPageBeecowUI;

import Common.CommomFunctions;

public class CreatePageBeecowSite extends CommomFunctions {
	public CreatePageBeecowSite(WebDriver driver) {
		super(driver);
	}


	public LoginPagesBeecowSite clickLoginbtn() {
		waitForElementVisible(CreatePageBeecowUI.LoginPage);
		clickToElement(CreatePageBeecowUI.LoginPage);
		return PageFactory.initElements(driver, LoginPagesBeecowSite.class);
	}
	
	public void inputUserID(String value) {
		waitForElementVisible(LoginPageBeecowUI.USERID_TXT);
		inputElement(LoginPageBeecowUI.USERID_TXT, value);
	}

	public void inputPassword(String value) {
		waitForElementVisible(LoginPageBeecowUI.PASSID_TXT);
		inputElement(LoginPageBeecowUI.PASSID_TXT, value);
	}

	public void clickKenh() {
		waitForElementVisible(CreatePageBeecowUI.KENHBANHANG_BTN);
		clickToElement(CreatePageBeecowUI.KENHBANHANG_BTN);
	}

	public void clickClosePopup() {
		waitForElementVisible(CreatePageBeecowUI.POPUP);
		waitForElementVisible(CreatePageBeecowUI.CLOSE_BTN);
		clickToElement(CreatePageBeecowUI.CLOSE_BTN);
	}

	public String getMessageImageToVerify() {
		waitForElementVisible(CreatePageBeecowUI.IMAGE_MSG);
		return getTextElement(CreatePageBeecowUI.IMAGE_MSG);
	}

	public String getMessageNameSPToVerify() {
		waitForElementVisible(CreatePageBeecowUI.NAMESP_MSG);
		return getTextElement(CreatePageBeecowUI.NAMESP_MSG);
	}

	public String getMessageCategorySPToVerify() {
		waitForElementVisible(CreatePageBeecowUI.CATEGORY_MSG);
		return getTextElement(CreatePageBeecowUI.CATEGORY_MSG);
	}

	public String getMessageDESCRIBEToVerify() {
		waitForElementVisible(CreatePageBeecowUI.DESCRIBE_MSG);
		return getTextElement(CreatePageBeecowUI.DESCRIBE_MSG);
	}

	public String getMessageAMOUNTToVerify() {
		waitForElementVisible(CreatePageBeecowUI.AMOUNT_MSG);
		return getTextElement(CreatePageBeecowUI.AMOUNT_MSG);
	}

	public String getMessagePRICEToVerify() {
		waitForElementVisible(CreatePageBeecowUI.PRICE_MSG);
		return getTextElement(CreatePageBeecowUI.PRICE_MSG);
	}

	public String getMessageWEIGHTToVerify() {
		waitForElementVisible(CreatePageBeecowUI.WEIGHT_MSG);
		return getTextElement(CreatePageBeecowUI.WEIGHT_MSG);
	}

	public String getMessageWIDTHToVerify() {
		waitForElementVisible(CreatePageBeecowUI.WIDTH_MSG);
		return getTextElement(CreatePageBeecowUI.WIDTH_MSG);
	}

	public String getMessageLENGTHToVerify() {
		waitForElementVisible(CreatePageBeecowUI.LENGTH_MSG);
		return getTextElement(CreatePageBeecowUI.LENGTH_MSG);
	}

	public String getMessageHEIGHTToVerify() {
		waitForElementVisible(CreatePageBeecowUI.HEIGHT_MSG);
		return getTextElement(CreatePageBeecowUI.HEIGHT_MSG);
	}

	public void clickDang() {
		waitForElementVisible(CreatePageBeecowUI.DANG_BTN);
		clickToElement(CreatePageBeecowUI.DANG_BTN);
	}

	public void clickXemDanhMucSP() {
		waitForElementVisible(CreatePageBeecowUI.XEMDANHMUCCS_BTN);
		clickToElement(CreatePageBeecowUI.XEMDANHMUCCS_BTN);
	}

	public void inputNameSp(String value) {
		waitForElementVisible(CreatePageBeecowUI.NAMESP_TXT);
		inputElement(CreatePageBeecowUI.NAMESP_TXT, value);
	}

	public void inputAmount(String value) {
		waitForElementVisible(CreatePageBeecowUI.AMOUNT_TXT);
		inputElement(CreatePageBeecowUI.AMOUNT_TXT, value);
	}

	public void inputSKU(String value) {
		waitForElementVisible(CreatePageBeecowUI.SKU_TXT);
		inputElement(CreatePageBeecowUI.SKU_TXT, value);
	}

	public void inputPrice(String value) {
		waitForElementVisible(CreatePageBeecowUI.PRICE_TXT);
		inputElement(CreatePageBeecowUI.PRICE_TXT, value);
	}

	public void inputGiam(String value) {
		waitForElementVisible(CreatePageBeecowUI.GIAM_TXT);
		inputElement(CreatePageBeecowUI.GIAM_TXT, value);
	}

	public void inputMoi(String value) {
		waitForElementVisible(CreatePageBeecowUI.MOI_TXT);
		inputElement(CreatePageBeecowUI.MOI_TXT, value);
	}

	public void inputWeight(String value) {
		waitForElementVisible(CreatePageBeecowUI.WEIGHT_TXT);
		inputElement(CreatePageBeecowUI.WEIGHT_TXT, value);
	}

	public void inputWidth(String value) {
		waitForElementVisible(CreatePageBeecowUI.WIDTH_TXT);
		inputElement(CreatePageBeecowUI.WIDTH_TXT, value);
	}

	public void inputLenght(String value) {
		waitForElementVisible(CreatePageBeecowUI.LENGTH_TXT);
		inputElement(CreatePageBeecowUI.LENGTH_TXT, value);
	}

	public void inputHeight(String value) {
		waitForElementVisible(CreatePageBeecowUI.HEIGHT_TXT);
		inputElement(CreatePageBeecowUI.HEIGHT_TXT, value);
	}

	public void inputDescribe(String value) {
		waitForElementVisible(CreatePageBeecowUI.DESCRIBE_TXT);
		inputElement(CreatePageBeecowUI.DESCRIBE_TXT, value);
	}

	public String getMessageWeight50to1000ToVerify() {
		waitForElementVisible(CreatePageBeecowUI.WEIGHT50to1000_MSG);
		return getTextElement(CreatePageBeecowUI.WEIGHT50to1000_MSG);
	}

	public void selectComboboxCategory1(String valueSelect) {
		selectComboboxSpecial(CreatePageBeecowUI.DROPDOW1, CreatePageBeecowUI.LISTCATEGORY1, valueSelect);
	}

	public void selectComboboxCategory2(String valueSelect) {
		selectComboboxSpecial(CreatePageBeecowUI.DROPDOW2, CreatePageBeecowUI.LISTCATEGORY2, valueSelect);
	}

	public void selectComboboxCategory3(String valueSelect) {
		selectComboboxSpecial(CreatePageBeecowUI.DROPDOW3, CreatePageBeecowUI.LISTCATEGORY3, valueSelect);
	}

	public String getMessageGiaSPToVerify() {
		waitForElementVisible(CreatePageBeecowUI.GiaSP_MSG);
		return getTextElement(CreatePageBeecowUI.GiaSP_MSG);
	}

	public String getMessageTenSPToVerify() {
		waitForElementVisible(CreatePageBeecowUI.TenSP_MSG);
		return getTextElement(CreatePageBeecowUI.TenSP_MSG);
	}

	public String getMessageDoneToVerify() {
		waitForElementVisible(CreatePageBeecowUI.Done_MSG);
		return getTextElement(CreatePageBeecowUI.Done_MSG);
	}

	public void clickCapNhat() {
		waitForElementVisible(CreatePageBeecowUI.CAPNHATQTY_BTN);
		clickToElement(CreatePageBeecowUI.CAPNHATQTY_BTN);
	}

	public String getMessageHoanTatToVerify() {
		waitForElementVisible(CreatePageBeecowUI.HOANTAT_MSG);
		return getTextElement(CreatePageBeecowUI.HOANTAT_MSG);
	}
	public String getTenSanPhamEdit() {
		waitForElementVisible(CreatePageBeecowUI.TENSPEdit);
		return getTextElement(CreatePageBeecowUI.TENSPEdit);
	}
	public String getGiaSanPhamEdit() {
		waitForElementVisible(CreatePageBeecowUI.GIASPEdit);
		return getTextElement(CreatePageBeecowUI.GIASPEdit);
	}
	public void ClearInputWEIGHT() {
		waitForElementVisible(CreatePageBeecowUI.WEIGHT_TXT);
		clearElement(CreatePageBeecowUI.WEIGHT_TXT);
	}
	public void ClearInputLeght() {
		waitForElementVisible(CreatePageBeecowUI.LENGTH_TXT);
		clearElement(CreatePageBeecowUI.LENGTH_TXT);
	}
	public void ClearInputWIDTH() {
		waitForElementVisible(CreatePageBeecowUI.WIDTH_TXT);
		clearElement(CreatePageBeecowUI.WIDTH_TXT);
	}

	public void ClearInputHeight() {
		waitForElementVisible(CreatePageBeecowUI.HEIGHT_TXT);
		clearElement(CreatePageBeecowUI.HEIGHT_TXT);
	}

	public void ClearSKU() {
		waitForElementVisible(CreatePageBeecowUI.SKU_TXT);
		clearElement(CreatePageBeecowUI.SKU_TXT);
	}
	public void ClearInputAMOUNT() {
		waitForElementVisible(CreatePageBeecowUI.AMOUNT_TXT);
		clearElement(CreatePageBeecowUI.AMOUNT_TXT);
	}

	public String getPrice(String dynamicLocator) {
		waitForDynamicVisible(CreatePageBeecowUI.GiaSP_MSG, dynamicLocator);
		return getTextDynamicElement(CreatePageBeecowUI.GiaSP_MSG, dynamicLocator);
	}

	public String getName(String dynamicLocator) {
		waitForDynamicVisible(CreatePageBeecowUI.TenSP_MSG, dynamicLocator);
		return getTextDynamicElement(CreatePageBeecowUI.TenSP_MSG, dynamicLocator);
	}

	public  EditPageBeecowSite EditPageBeecowSite(String dynamicLocator) {
		waitForDynamicVisible(CreatePageBeecowUI.CHINHSUA_BTN, dynamicLocator);
		clickDynamicElement(CreatePageBeecowUI.CHINHSUA_BTN, dynamicLocator);
		return  PageFactory.initElements(driver, EditPageBeecowSite.class); 
	}

	public void clickXemChiTiet() {
		waitForElementVisible(CreatePageBeecowUI.XEMCHITIET_BTN);
		clickToElement(CreatePageBeecowUI.XEMCHITIET_BTN);
	}

	public String getTENSAUCHINHSUAMSG(String dynamicLocator) {
		waitForDynamicVisible(CreatePageBeecowUI.TENSAUCHINHSUA_MSG, dynamicLocator);
		return getTextDynamicElement(CreatePageBeecowUI.TENSAUCHINHSUA_MSG, dynamicLocator);
	}

	public String getGIASAUCHINHSUAMSG(String dynamicLocator) {
		waitForDynamicVisible(CreatePageBeecowUI.GIASAUCHINHSUA_MSG, dynamicLocator);
		return getTextDynamicElement(CreatePageBeecowUI.GIASAUCHINHSUA_MSG, dynamicLocator);
	}
	
	public void ClearNameSP() {
		waitForElementVisible(CreatePageBeecowUI.NAMESP_TXT);
		clearElement(CreatePageBeecowUI.NAMESP_TXT);
	}
	public void ClearPriceSP() {
		waitForElementVisible(CreatePageBeecowUI.PRICE_TXT);
		clearElement(CreatePageBeecowUI.PRICE_TXT);
	}


	


}
