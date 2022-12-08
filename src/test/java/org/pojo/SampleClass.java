package org.pojo;

import org.base.BaseClass;

public class SampleClass extends BaseClass {
	public static void main(String[] args) {

		launchBrowser();
		launchUrl("https://www.facebook.com/");
		windowMaximize();
		FbLoginPojo f = new  FbLoginPojo();
		passText("Selenium", f.getEmail());
		passText("inmakes", f.getPassword());

		driver.navigate().to(driver.getCurrentUrl());
		passText("Pushparaj", f.getEmail());

	}

}
