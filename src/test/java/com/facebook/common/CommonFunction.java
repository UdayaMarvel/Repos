package com.facebook.common;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunction {

	public static WebDriver driver;
	public static Actions act;
	public static JavascriptExecutor js;
	public static Select s;
	public static Wait w;
	
	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		act = new Actions(driver);
		js = (JavascriptExecutor)driver;
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void browserClose() {
		driver.quit();
	}
	
	public void scroll(WebElement ele) {
		act.moveToElement(ele).build().perform();
	}
	
	public void scroll(WebElement ele, int i) {
		js.executeScript("arguments[0].scrollIntoView('false')", ele);
	}
	
	public void sendText(WebElement ele, String s) {
		act.sendKeys(ele, s).build().perform();
	}
	public void sendText(String s, WebElement ele) {
		ele.sendKeys(s);
	}
	
	public void button( WebElement ele) {
		ele.click();
	}
	public void button(WebElement ele, int i) {
		act.click(ele).build().perform();
	}
	public void selectByValue(WebElement ele,String string) {
		s = new Select(ele);
		s.selectByValue(string);
	}
	public void selectByText(WebElement ele,String string) {
		s = new Select(ele);
		s.selectByVisibleText(string);
	}
	public void selectByIndex(WebElement ele,int index) {
		s = new Select(ele);
		s.selectByIndex(index);
	}
	
	public void ss(File target) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source  = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, target);
	}
	public void timeOut() {
		w = new WebDriverWait(driver, 10);
	}
	
}
