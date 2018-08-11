package com.pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.utils.TestUtil;

public class LandingPage extends BaseClass
{
	TestUtil util;
	HomePage homepage;

	public LandingPage()
	{
		PageFactory.initElements(driver, this);
		util = new TestUtil();
		homepage = new HomePage();
	}

	@FindBy(xpath = "//a[contains(text(),'START NOW')]")
	private WebElement startNowButton;

	public HomePage clickOnStartNow()
	{
		driver.navigate().refresh();/*
		util.explicitWait(startNowButton);
		startNowButton.click();*/
		return new HomePage();
	}
}
