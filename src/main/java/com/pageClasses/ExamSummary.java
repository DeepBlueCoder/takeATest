package com.pageClasses;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.utils.TestUtil;

public class ExamSummary extends BaseClass
{

	TestUtil util;
	HomePage homepage;

	public ExamSummary()
	{
		PageFactory.initElements(driver, this);
		util = new TestUtil();
		homepage = new HomePage();
	}
	
//	@FindBy

}
