package com.beecowsite.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecowsite.ui.LoginPageBeecowUI;

import Common.CommomFunctions;

public class LoginPagesBeecowSite   extends CommomFunctions{
	
	public LoginPagesBeecowSite(WebDriver driver) {
		super(driver);
		
	}
	public CreatePageBeecowSite clickLoginLink() {
		waitForElementVisible(LoginPageBeecowUI.LOGIN_BTN);
		clickToElement(LoginPageBeecowUI.LOGIN_BTN);
		return  PageFactory.initElements(driver, CreatePageBeecowSite.class);
	}

	public void inputUserID(String value) {
		waitForElementVisible(LoginPageBeecowUI.USERID_TXT);
		inputElement(LoginPageBeecowUI.USERID_TXT, value);
	}
	public void inputPassword(String value) {
		waitForElementVisible(LoginPageBeecowUI.PASSID_TXT);
		inputElement(LoginPageBeecowUI.PASSID_TXT, value);
	}
	public void clickLogin() {
		waitForElementVisible(LoginPageBeecowUI.LOGIN_BTN);
		clickToElement(LoginPageBeecowUI.LOGIN_BTN);
	}
	public String getMessageToVerify() {
		waitForElementVisible(LoginPageBeecowUI.ERRMSG_LBL);
		return getTextElement(LoginPageBeecowUI.ERRMSG_LBL);
	}
	public String getMessageGeneralToVerify() {
		waitForElementVisible(LoginPageBeecowUI.VANDE_MSG);
		return getTextElement(LoginPageBeecowUI.VANDE_MSG);
	}
	public String getMessagePassFailToVerify() {
		waitForElementVisible(LoginPageBeecowUI.PASSFAIL_MSG);
		return getTextElement(LoginPageBeecowUI.PASSFAIL_MSG);
	}
	public String getMessageEmailFailToVerify() {
		waitForElementVisible(LoginPageBeecowUI.EMAILFAIL_MSG);
		return getTextElement(LoginPageBeecowUI.EMAILFAIL_MSG);
	}
	public String getMessageEMAILSDTPASSToVerify() {
		waitForElementVisible(LoginPageBeecowUI.EMAILSDTPASS_MSG);
		return getTextElement(LoginPageBeecowUI.EMAILSDTPASS_MSG);
	}
	public String getMessageAcountPassToVerify() {
		waitForElementVisible(LoginPageBeecowUI.IsProblemTryAgainMsg);
		return getTextElement(LoginPageBeecowUI.IsProblemTryAgainMsg);
	}
	
	
	public String getMessagePhoneToVerify() {
		waitForElementVisible(LoginPageBeecowUI.ERRMSGPHONE_LBL);
		return getTextElement(LoginPageBeecowUI.ERRMSGPHONE_LBL);
	}
	public String getMessagePhoneFailToVerify() {
		waitForElementVisible(LoginPageBeecowUI.PHONEFAIL_MSG);
		return getTextElement(LoginPageBeecowUI.PHONEFAIL_MSG);
	}
	
	
}
