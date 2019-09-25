package com.beecowsite.actions;

import org.openqa.selenium.WebDriver;

import com.beecowsite.ui.CreatePageBeecowUI;
import com.beecowsite.ui.EditPageBeecowUI;

import Common.CommomFunctions;

public class EditPageBeecowSite extends CommomFunctions {

	public EditPageBeecowSite(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getNameValue(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditNAME_TXT);
		Thread.sleep(2000);
		return getTextByJs(script);
//		return js.executeScript("return $('input#name').val()").toString();
	}

	public String getCombobox1() {
		waitForElementVisible(EditPageBeecowUI.LISTCATEGORY1);
		return getTextElement(EditPageBeecowUI.LISTCATEGORY1);
	}

	public String getCombobox2() {
		waitForElementVisible(EditPageBeecowUI.LISTCATEGORY2);
		return getTextElement(EditPageBeecowUI.LISTCATEGORY2);
	}

	public String getCombobox3() {
		waitForElementVisible(EditPageBeecowUI.LISTCATEGORY3);
		return getTextElement(EditPageBeecowUI.LISTCATEGORY3);
	}

	public String getPriceValue(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditPRICE_TXT);
		return getTextByJs(script);
//		return js.executeScript("return \"đ \" + $('input[formcontrolname=\"orgPrice\"]').val()").toString();
	}

	public String getEditCATEGORY(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditCATEGORY_TXT);
		Thread.sleep(2000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditCATEGORY_TXT);
	}

	public String getEditDESCRIBE(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditDESCRIBE_TXT);
		Thread.sleep(2000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditDESCRIBE_TXT);
	}

	public String getEditAMOUNT(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditAMOUNT_TXT);
		Thread.sleep(2000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditAMOUNT_TXT);
	}

	public String getEditQTY(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditQTY_TXT);
		Thread.sleep(2000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditQTY_TXT);
	}

	public String getEditSKU(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditSKU_TXT);
		Thread.sleep(2000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditSKU_TXT);
	}

	public String getEditDiscount(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditDiscount_TXT);
		Thread.sleep(2000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditDiscount_TXT);
	}

	public String getEditWEIGHT(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditWEIGHT_TXT);
		Thread.sleep(2000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditWEIGHT_TXT);
	}

	public String getEditLENGTH(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditLENGTH_TXT);
		Thread.sleep(1000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditLENGTH_TXT);
		
	}

	public String getEditHEIGHT(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditHEIGHT_TXT);
		Thread.sleep(1000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditHEIGHT_TXT);
	}

	public String getEditWIDTH(String script) throws Exception {
		waitForElementVisible(EditPageBeecowUI.EditWIDTH_TXT);
		Thread.sleep(1000);
		return getTextByJs(script);
//		return getTextElement(EditPageBeecowUI.EditWIDTH_TXT);
	}

	public void inputEditName(String value) {
		waitForElementVisible(EditPageBeecowUI.EditNAME_TXT);
		inputElement(EditPageBeecowUI.EditNAME_TXT, value);
	}

	public void inputEditAmount(String value) {
		waitForElementVisible(EditPageBeecowUI.EditAMOUNT_TXT);
		inputElement(EditPageBeecowUI.EditAMOUNT_TXT, value);
	}

	public void inputEditSKU(String value) {
		waitForElementVisible(EditPageBeecowUI.EditSKU_TXT);
		inputElement(EditPageBeecowUI.EditSKU_TXT, value);
	}

	public void inputEditPrice(String value) {
		waitForElementVisible(EditPageBeecowUI.EditPRICE_TXT);
		inputElement(EditPageBeecowUI.EditPRICE_TXT, value);
	}

	public void inputEditDiscount(String value) {
		waitForElementVisible(EditPageBeecowUI.EditDiscount_TXT);
		inputElement(EditPageBeecowUI.EditDiscount_TXT, value);
	}

	public void inputEditWeight(String value) {
		waitForElementVisible(EditPageBeecowUI.EditWEIGHT_TXT);
		inputElement(EditPageBeecowUI.EditWEIGHT_TXT, value);
	}

	public void inputEditWidth(String value) {
		waitForElementVisible(EditPageBeecowUI.EditWIDTH_TXT);
		inputElement(EditPageBeecowUI.EditWIDTH_TXT, value);
	}

	public void inputEditLenght(String value) {
		waitForElementVisible(EditPageBeecowUI.EditLENGTH_TXT);
		inputElement(EditPageBeecowUI.EditLENGTH_TXT, value);
	}

	public void inputEditHeight(String value) {
		waitForElementVisible(EditPageBeecowUI.EditHEIGHT_TXT);
		inputElement(EditPageBeecowUI.EditHEIGHT_TXT, value);
	}

	public void inputEditDescribe(String value) {
		waitForElementVisible(EditPageBeecowUI.EditDESCRIBE_TXT);
		inputElement(EditPageBeecowUI.EditDESCRIBE_TXT, value);
	}

	public void clickEditQtySpan() {
		waitForElementVisible(EditPageBeecowUI.EditPrice_BTN);
		clickToElement(EditPageBeecowUI.EditPrice_BTN);
	}

	
//	public EditPageBeecowSite clickEditBtn() {
//		String dynamicLocator = String.format(EditPageBeecowUI.Edit_BTN, CreatePageBeecowSite.tenSanPham.toLowerCase());	
//		waitForElementVisible(dynamicLocator);
//		clickToElement(dynamicLocator);
//		return PageFactory.initElements(driver, EditPageBeecowSite.class);
//	}
//	public void setQuantityInput(String value) {
//		waitForElementVisible(EditPageBeecowUI.EditQTY_TXT);
//		clearElement(EditPageBeecowUI.EditQTY_TXT);
//		inputElement(EditPageBeecowUI.EditQTY_TXT, value);
//	}
	public void clickEditCapnhat() {
		waitForElementVisible(EditPageBeecowUI.CAPNHAT_BTN);
		clickToElement(EditPageBeecowUI.CAPNHAT_BTN);
	}
	public void clickEditXacNhan() {
		waitForElementVisible(EditPageBeecowUI.XacNhan_BTN);
		clickToElement(EditPageBeecowUI.XacNhan_BTN);
	}
	public void clickEditXemChiTiet() {
		waitForElementVisible(EditPageBeecowUI.XemChiTiet_BTN);
		clickToElement(EditPageBeecowUI.XemChiTiet_BTN);
	}
	

	public String getHetHang() {
		waitForElementVisible(EditPageBeecowUI.HetHang_LBL);
		return getTextElement(EditPageBeecowUI.HetHang_LBL);
	}
	public String PriceMsg() {
		waitForElementVisible(EditPageBeecowUI.Price_LBL);
		return getTextElement(EditPageBeecowUI.Price_LBL);
	}
	public String NameMsg() {
		waitForElementVisible(EditPageBeecowUI.Name_LBL);
		return getTextElement(EditPageBeecowUI.Name_LBL);
	}
}
