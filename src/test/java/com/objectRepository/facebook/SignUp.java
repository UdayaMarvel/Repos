package com.objectRepository.facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.common.CommonFunction;

public class SignUp {
	
	CommonFunction co = new CommonFunction();

	public SignUp() {
		PageFactory.initElements(co.driver, this);
	}
	
	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createAccount;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement email;
}
