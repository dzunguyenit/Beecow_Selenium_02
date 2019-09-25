package com.beecowsite.ui;

public class LoginPageBeecowUI {
	public static String LOGINHOME_BTN = "//a[@class='login']//span[contains(text(),'Đăng nhập')]";
	public static String USERID_TXT = "//input[@id='usr']";
	public static String PASSID_TXT = "//input[contains(@class,'mrgb15')]";
	public static String ERRMSG_LBL = "//span[@beetranslate='beecow.login.error.validateFormError']";
	public static String ERRMSGPHONE_LBL = "//span[contains(text(),'Số điện thoại không đúng')]";
	public static String LOGIN_BTN = "//button[@class='btn-solid-orange btn-login']/span";

	public static String EMAILSDTPASS_MSG = "//span[@beetranslate='beecow.login.error.validateFormError']/span";
	public static String PHONEFAIL_MSG = "//span[@beetranslate='beecow.login.error.phoneValidError']/span";
	public static String VANDE_MSG = "//div[@class='form-error left']/span";
	public static String EMAILFAIL_MSG = "//span[@beetranslate= 'beecow.login.error.emailValidError']/span";
	public static String PASSFAIL_MSG = "//span[@beetranslate='beecow.login.error.loginError']/span";
	public static String minimumCharacterIsInvaildFormatMsg_MSG = "//span[@beetranslate='beecow.error.genera']/span";
	public static String IsProblemTryAgainMsg = "//div[@class='name']/span[text()='genymotionios']";

	
}
