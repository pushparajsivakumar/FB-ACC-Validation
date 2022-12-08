package org.stepDefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooksClass extends BaseClass {
	
	@Before
	//Pre-Condition
	private void precondition() {
		launchBrowser();
		windowMaximize();
	}
	
	@After
	//Post-Condition
	private void postCondition() {
		closeEntireBrowser();

	}
	

}
