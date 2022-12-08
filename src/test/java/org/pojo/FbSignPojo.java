package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbSignPojo extends BaseClass {
          
	     //Non Parameterized Constructor
	    public FbSignPojo() {
		 PageFactory.initElements(driver, this);
		}
	    @FindBy(xpath ="//a[text()='Create New Account']")
	    private WebElement CreateNewAccount;
	    
	    @FindBy(name ="firstname")
	    private WebElement FirstName;
	    
	    @FindBy(name ="lastname")
	    private WebElement SurName;
	    
	    @FindBy(name = "reg_email__")
	    private WebElement MoblieNumber;
	    
	    @FindBy(name = "reg_passwd__")
	    private WebElement Newpassword;

		public WebElement getCreateNewAccount() {
			return CreateNewAccount;
		}

		public WebElement getFirstName() {
			return FirstName;
		}

		public WebElement getSurName() {
			return SurName;
		}

		public WebElement getMoblieNumber() {
			return MoblieNumber;
		}

		public WebElement getNewpassword() {
			return Newpassword;
		}
    
}
