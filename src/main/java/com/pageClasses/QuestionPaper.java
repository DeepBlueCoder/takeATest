package com.pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.utils.TestUtil;

public class QuestionPaper extends BaseClass
{

	TestUtil util;
	HomePage homepage;

	public QuestionPaper()
	{
		PageFactory.initElements(driver, this);
		util = new TestUtil();
		homepage = new HomePage();
	}

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[text()='Review Later']")
	private WebElement reviewLaterButton;
	
	@FindBy(xpath="//div[text()='Finish']")
	private WebElement finishButton;

	public QuestionPaper clickOnSaveButton()
	{
		util.explicitWait(saveButton);
		saveButton.click();

		return new QuestionPaper();

	}

	public QuestionPaper clickOnReviewLaterButton()
	{
		util.explicitWait(reviewLaterButton);
		reviewLaterButton.click();

		return new QuestionPaper();

	}
	
	public ExamSummary cliclOnFinishButton()
	{
		util.explicitWait(finishButton);
		finishButton.click();
		
		return new ExamSummary();
	}

}
