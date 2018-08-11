package com.testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;
import com.pageClasses.HomePage;
import com.pageClasses.LandingPage;
import com.utils.TestUtil;

public class SearchTest extends BaseClass
{
	HomePage homePage;
	TestUtil testUtil;
	LandingPage landingpage;
	
	BaseClass nextPage;

	SearchTest()
	{
		super();
	}

	@BeforeClass
	public void setUp()
	{
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		landingpage = new LandingPage();

	}

/*	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/

	@Test
	public void searchTest()
	{
		homePage = landingpage.clickOnStartNow().sendSerachText("trignometry");
		homePage.isSerachResultDisplayed();
	}
	
	@Test
	public void startTest()
	{
		homePage.isSerachResultDisplayed()
		.clickOnFirstResultLink()
		.clickOnPartTestStartTest()
		.clickOnReadyToBeginButton()
		.clickOnContinueOnPopUp();
	}

	
}
