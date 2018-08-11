package com.pageClasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.baseClass.BaseClass;
import com.utils.TestUtil;

public class HomePage extends BaseClass
{
	public static TestUtil util;

	public HomePage()
	{
		PageFactory.initElements(driver, this);
		util = new TestUtil();
	}

	@FindBy(xpath = "//input[@role='combobox']")
	private WebElement serachBox;

	@FindBy(xpath = "//div[@class='search_results']/div/a/h3")
	private List<WebElement> serachResults;

	@FindBy(xpath = "//*[@title='Trigonometry']")
	private WebElement trignometryLink;

	public HomePage sendSerachText(String serachString)
	{
		util.explicitWait(serachBox);
		serachBox.clear();
		serachBox.sendKeys(serachString);
		return new HomePage();
	}

	public HomePage isSerachResultDisplayed()
	{
		Assert.assertTrue(serachResults.size() > 1, "No Search result found");
		return new HomePage();
	}

	public TestStartPage clickOnFirstResultLink()
	{
		// serachResults.get(0).click();
		try
		{
			Thread.sleep(10000);
			util.explicitWait(trignometryLink);
			trignometryLink.click();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			return new TestStartPage();
		}

	}

}
