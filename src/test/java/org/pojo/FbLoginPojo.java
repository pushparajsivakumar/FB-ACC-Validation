package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {

	// 1. Non Parameterized Constructor
	public  FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement LoginBtn;
	
	// 3. Getters to access webElements outside the class

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		LoginBtn = loginBtn;
	}
	
	
    
}
