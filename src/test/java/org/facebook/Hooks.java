package org.facebook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.facebook.common.CommonFunction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	CommonFunction co = new CommonFunction();
	@Before
	public void browserSteps(Scenario scenario) {
		co.browserLaunch();
		 final byte[] before = ((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
		 scenario.embed(before, "image/png");
	}
	
	@After
	public void browserStep(Scenario scenario) {
//		co.browserClose();
		final byte[] after = ((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(after, "image/png");
	}
	
}
