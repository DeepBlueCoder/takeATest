package com.pageClasses;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.utils.TestUtil;

public class TestStartPage extends BaseClass
{

	TestUtil util;
	HomePage homepage;

	public TestStartPage()
	{
		PageFactory.initElements(driver, this);
		util = new TestUtil();
		homepage = new HomePage();
	}

	@FindBy(xpath = "//a[text()='Start Test']")
	private List<WebElement> startTestLinks;

	public TestInstructionPage clickOnPartTestStartTest()
	{
		util.implicitWait();

		String currentWindowHandle = driver.getWindowHandle();

		util.explicitWait(startTestLinks.get(startTestLinks.size() - 1));
		startTestLinks.get(startTestLinks.size() - 1).click();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String expcetedhandle : allWindowHandles)
		{
			if (expcetedhandle != currentWindowHandle)
			{
				driver.switchTo().window(expcetedhandle);
			}
		}

		return new TestInstructionPage();
	}

}
