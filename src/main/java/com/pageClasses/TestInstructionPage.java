package com.pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.utils.TestUtil;

public class TestInstructionPage extends BaseClass
{

	TestUtil util;
	HomePage homepage;

	public TestInstructionPage()
	{
		PageFactory.initElements(driver, this);
		util = new TestUtil();
		homepage = new HomePage();
	}

	@FindBy(xpath = "//button[text()='I am ready to begin']")
	private WebElement readyToBeginButton;

	@FindBy(xpath="//*[contains(text(), 'Continue')]")
	private WebElement continueButton;
	
	
	public TestInstructionPage clickOnReadyToBeginButton()
	{
		util.explicitWait(readyToBeginButton);
		readyToBeginButton.click();

		return new TestInstructionPage();
	}
	
	public QuestionPaper  clickOnContinueOnPopUp()
	{
		util.explicitWait(continueButton);
		continueButton.click();
		
		return new QuestionPaper();
		
	}

}
