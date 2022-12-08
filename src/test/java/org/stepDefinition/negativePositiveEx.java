package org.stepDefinition;

import org.base.BaseClass;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class negativePositiveEx extends BaseClass{
      FbLoginPojo f;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
	    launchUrl("https://www.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
	   f = new FbLoginPojo();
	   passText("seleniuminmakes@gmail.com", f.getEmail());
	}

	@When("To pass invaild password in password field")
	public void to_pass_invaild_password_in_password_field() {
		 f = new FbLoginPojo();
		 passText("inmakes", f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FbLoginPojo();
		clickBtn(f.getLoginBtn());
	}

	@When("To check whether navigate to the homepage or not")
	public void to_check_whether_navigate_to_the_homepage_or_not() {
	   System.out.println("Check your Credentials.....");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser();
	}


}
