package com.testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;
import com.pageClasses.HomePage;
import com.pageClasses.LandingPage;
import com.utils.TestUtil;

public class StartTest extends BaseClass
{
	HomePage homePage;
	TestUtil testUtil;
	LandingPage landingpage;

	StartTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		landingpage = new LandingPage();

	}

/*	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}*/

		@Test
		public void startTest()
		{
			landingpage.clickOnStartNow()
			.sendSerachText("trignometry")
			.isSerachResultDisplayed()
			.clickOnFirstResultLink()
			.clickOnPartTestStartTest()
			.clickOnReadyToBeginButton()
			.clickOnContinueOnPopUp();
		}
}
