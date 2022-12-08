package org.stepDefinition;
import java.util.List;

import org.base.BaseClass;
import org.pojo.FbSignPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;
public class FbRegistrationDataTable1and2DList extends BaseClass {
	FbSignPojo s;

	@Given("To Launch the browser and Maximize the window")
	public void to_Launch_the_browser_and_Maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}
	@When("To launch the Url of fb  application")
	public void to_launch_the_Url_of_fb_application() {
		launchUrl("https://www.facebook.com/");
	}
	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		s = new FbSignPojo();
		clickBtn(s.getCreateNewAccount());
	}
	@When("To pass firstname in firstname textbox")
	public void to_pass_firstname_in_firstname_textbox(DataTable d) throws InterruptedException {
		Thread.sleep(5000);
		List<String> l = d.asList();
		s = new FbSignPojo();
		passText(l.get(1), s.getFirstName());
	}
	@When("To pass secondname in secondname textbox")
	public void to_pass_secondname_in_secondname_textbox() {
		s = new FbSignPojo();
        passText("Sivakumar", s.getSurName());
	}
	@When("To pass mobileno or email in email textbox")
	public void to_pass_mobileno_or_email_in_email_textbox(DataTable d) {
		List<List<String>> l = d.asLists();
		s = new FbSignPojo();
		passText(l.get(1).get(3), s.getMoblieNumber());
	}
	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		s = new FbSignPojo();
		passText("Darkskin@98", s.getNewpassword());
	}
	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		//closeEntireBrowser();
	}

}
