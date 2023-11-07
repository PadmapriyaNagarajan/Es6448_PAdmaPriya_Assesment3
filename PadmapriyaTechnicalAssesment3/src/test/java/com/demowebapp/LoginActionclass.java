package com.demowebapp;

import org.openqa.selenium.support.PageFactory;

public class LoginActionclass {
LoginLocatorsclass loginloc;
	
	public LoginActionclass() {
		this.loginloc = new LoginLocatorsclass();
		PageFactory.initElements(HelperClass.getdriver(), loginloc);
	}
	
	public void clickLoginaction() {
		loginloc.clicklogin.click();
	}
	
	public void setEmail(String strEmail) {
		loginloc.email.sendKeys(strEmail);
	}
	
	public void setPwd(String strPwd) {
		loginloc.password.sendKeys(strPwd);
	}
	
	public void clickingLoginBtn() {
		loginloc.loginButton.click();
	}
	
	public String loginVerify() {
		return loginloc.verifyemail.getText();
	}
	
	public void clickLogOut() {
		loginloc.logout.click();
	}
	public void checkingLoginError() {
		loginloc.verifyLoginText.getText();
	}
	
	public void loginDetails(String strEmail,String strPwd) {
		setEmail(strEmail);
		setPwd(strPwd);
	}
}
 