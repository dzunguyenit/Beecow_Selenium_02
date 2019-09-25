package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginPageBeecow {
	@SerializedName("ValueUser")
	@Expose
	private String ValueUser;

	public String getValueUser() {
		return ValueUser;
	}

	public void setValueUser(String valueUser) {
		ValueUser = valueUser;
	}

	@SerializedName("ValuePass")
	@Expose
	private String valuePass;

	public String getValuePass() {
		return valuePass;
	}

	public void setValuePass(String valuePass) {
		this.valuePass = valuePass;
	}

	@SerializedName("Numberic")
	@Expose
	private String Numberic;

	public String getNumberic() {
		return Numberic;
	}

	public void setNumberic(String numberic) {
		Numberic = numberic;
	}

	@SerializedName("NumbericEmail")
	@Expose
	private String NumbericEmail;

	public String getNumbericEmail() {
		return NumbericEmail;
	}

	public void setNumbericEmail(String numbericEmail) {
		NumbericEmail = numbericEmail;
	}

	@SerializedName("EmailAndPhoneOrPassMsg")
	@Expose
	private String EmailAndPhoneOrPassMsg;

	public String getEmailAndPhoneOrPassMsg() {
		return EmailAndPhoneOrPassMsg;
	}

	public void setEmailAndPhoneOrPassMsg(String emailAndPhoneOrPassMsg) {
		EmailAndPhoneOrPassMsg = emailAndPhoneOrPassMsg;
	}

	@SerializedName("Email")
	@Expose
	private String Email;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@SerializedName("EmailFailMsg")
	@Expose
	private String EmailFailMsg;

	public String getEmailFailMsg() {
		return EmailFailMsg;
	}

	public void setEmailFailMsg(String emailFailMsg) {
		EmailFailMsg = emailFailMsg;
	}

	@SerializedName("Passthreenumber")
	@Expose
	private String Passthreenumber;

	public String getPassthreenumber() {
		return Passthreenumber;
	}

	public void setPassthreenumber(String passthreenumber) {
		Passthreenumber = passthreenumber;
	}

	@SerializedName("minimumCharacterIsInvaildFormatMsg")
	@Expose
	private String minimumCharacterIsInvaildFormatMsg;

	public String getMinimumCharacterIsInvaildFormatMsg() {
		return minimumCharacterIsInvaildFormatMsg;
	}

	public void setMinimumCharacterIsInvaildFormatMsg(String minimumCharacterIsInvaildFormatMsg) {
		this.minimumCharacterIsInvaildFormatMsg = minimumCharacterIsInvaildFormatMsg;
	}

	@SerializedName("PhoneNumerIsInvaildFormatMsg")
	@Expose
	private String PhoneNumerIsInvaildFormatMsg;

	public String getPhoneNumerIsInvaildFormatMsg() {
		return PhoneNumerIsInvaildFormatMsg;
	}

	public void setPhoneNumerIsInvaildFormatMsg(String phoneNumerIsInvaildFormatMsg) {
		PhoneNumerIsInvaildFormatMsg = phoneNumerIsInvaildFormatMsg;
	}
	@SerializedName("PassFail")
	@Expose
	private String PassFail;


	public String getPassFail() {
		return PassFail;
	}

	public void setPassFail(String passFail) {
		PassFail = passFail;
	}
	@SerializedName("PassFailMsg")
	@Expose
	private String PassFailMsg;

	public String getPassFailMsg() {
		return PassFailMsg;
	}

	public void setPassFailMsg(String passFailMsg) {
		PassFailMsg = passFailMsg;
	}

	@SerializedName("PassTrue")
	@Expose
	private String PassTrue;
	

	public String getPassTrue() {
		return PassTrue;
	}

	public void setPassTrue(String passTrue) {
		PassTrue = passTrue;
	}
	@SerializedName("isProblemTryAgainMsg")
	@Expose
	private String isProblemTryAgainMsg;

	

	public String getIsProblemTryAgainMsg() {
		return isProblemTryAgainMsg;
	}

	public void setIsProblemTryAgainMsg(String isProblemTryAgainMsg) {
		this.isProblemTryAgainMsg = isProblemTryAgainMsg;
	}

	@SerializedName("invalidUserAndPassMsg")
	@Expose
	private String invalidUserAndPassMsg;

	public String getInvalidUserAndPassMsg() {
		return invalidUserAndPassMsg;
	}

	public void setInvalidUserAndPassMsg(String invalidUserAndPassMsg) {
		this.invalidUserAndPassMsg = invalidUserAndPassMsg;
	}

}
