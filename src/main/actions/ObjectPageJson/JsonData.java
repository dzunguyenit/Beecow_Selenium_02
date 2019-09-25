
package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonData {

	@SerializedName("LoginPageBeecow")
	@Expose
	private LoginPageBeecow loginPageBeecow;

	public LoginPageBeecow getLoginPageBeecow() {
		return loginPageBeecow;
	}

	public void setLoginPageBeecow(LoginPageBeecow loginPageBeecow) {
		this.loginPageBeecow = loginPageBeecow;
	}

	@SerializedName("HomePageBeecow")
	@Expose
	private CreatePageBeecow homePageBeecow;

	public CreatePageBeecow getHomePageBeecow() {
		return homePageBeecow;
	}

	public void setHomePageBeecow(CreatePageBeecow homePageBeecow) {
		this.homePageBeecow = homePageBeecow;
	}
	@SerializedName("EditPageBeecow")
	@Expose
	private EditPageBeecow EditPageBeecow;
	public EditPageBeecow getEditPageBeecow() {
		return EditPageBeecow;
	}

	public void setEditPageBeecow(EditPageBeecow editPageBeecow) {
		EditPageBeecow = editPageBeecow;
	}

	}



	
	