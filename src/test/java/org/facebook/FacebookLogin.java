package org.facebook;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.facebook.common.CommonFunction;
import com.objectRepository.facebook.SignUp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class FacebookLogin {

	CommonFunction co = new CommonFunction();
	SignUp si = new SignUp();
	
	@Given("Launch the facebook")
	public void launch_the_facebook() {

	}

	@When("Click on create account")
	public void click_on_create_account() {
	    co.button(si.getCreateAccount());
	}

	@When("enter first name")
	public void enter_first_name() throws InterruptedException {
	    
	    co.button(si.getFirstName(), 0);
	    co.sendText(si.getFirstName(), "udaya");
	}

	@When("enter last name")
	public void enter_last_name() {
		  co.button(si.getLastName(), 0);
		    co.sendText(si.getLastName(), "udaya");
	}

	@When("enter email")
	public void enter_email() throws IOException {
		  co.button(si.getEmail(), 0);
		    co.sendText(si.getEmail(), "udaya");
		File f = new File("C:\\Users\\ADMIN\\eclipse-Silambarasan\\Facebook\\src\\test\\resources\\ss.jpg");
		co.ss(f);
	}


}
