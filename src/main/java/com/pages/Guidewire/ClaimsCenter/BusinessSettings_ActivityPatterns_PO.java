package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface BusinessSettings_ActivityPatterns_PO {

	final By ActivityPatterns_Header = By.xpath("//div[contains(@id,'ActivityPatternsTitle')]//div[@class='gw-TitleBar--title']");

	// -------> Header (Subject, Class, Category, Type, Priority, Mandatory,
	// Automated
	final By AP_Subject_column   = By.xpath("//div[contains(@id,'SubjectHeader')]//div[contains(@id,'SubjectHeader_inner')]");
	final By AP_Class_column     = By.xpath("//div[contains(@id,'ActivityClassHeader')]//div[contains(@id,'ActivityClassHeader_inner')]");
	final By AP_Category_column  = By.xpath("//div[contains(@id,'CategoryHeader')]//div[contains(@id,'CategoryHeader_inner')]");
	final By AP_Type_column      = By.xpath("//div[contains(@id,'TypeHeader')]//div[contains(@id,'TypeHeader_inner')]");
	final By AP_Priority_column  = By.xpath("//div[contains(@id,'PriorityHeader')]//div[contains(@id,'PriorityHeader_inner')]");
	final By AP_Mandatory_column = By.xpath("//div[contains(@id,'MandatoryHeader')]//div[contains(@id,'MandatoryHeader_inner')]");
	final By AP_Automated_column = By.xpath("//div[contains(@id,'AutomatedOnlyHeader')]//div[contains(@id,'AutomatedOnlyHeader_inner')]");

	// ----->Activity Pattern Activity1
	final By AP_Activity1 = By.xpath("//tr[contains(@id,'ActivityPatternsLV-0-1')]");

	// forActivities Columns in on Page
	final By AP_Subject   = By.xpath("//div[contains(@id,'Subject_button')]");
	final By AP_Class     = By.xpath("//td[contains(@id,'ActivityClass_Cell')]");
	final By AP_Category  = By.xpath("//td[contains(@id,'Category_Cell')]");
	final By AP_Type      = By.xpath("//td[contains(@id,'Type_Cell')]");
	final By AP_Priority  = By.xpath("//td[contains(@id,'Priority_Cell')]");
	final By AP_Mandatory = By.xpath("//td[contains(@id,'Mandatory_Cell')]");
	final By AP_Automated = By.xpath("//td[contains(@id,'AutomatedOnly_Cell')]");

	final By AP_PageNo   = By.xpath("//input[contains(@id,'ActivityPatternsLV-_ListPaging-input')]");
	final By rowCount    = By.xpath("//table/tbody/tr[contains(@id,'ActivityPatternsScreen-ActivityPatternsLV')]");
	final By columnCount = By.xpath("//tr[@id='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4']/td");

	/*------
	  Header for Activity Patterns
	 --- ---*/

	final By ActivityPatternDetails_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@class='gw-TitleBar--title']");
	/*----------
	  Activity Pattern
	  --------*/

	final By APD_ActivityPattern = By.xpath("//div[contains(@id,'AdminActivityPatternDV-1')]//div[@class='gw-label gw-boldLabel']");

	final By APD_AP_Subject                 = By.xpath("//div[contains(@id,'AdminActivityPatternDV-Subject')]//div[@class='gw-value-readonly-wrapper']");
	final By APD_AP_ShortSubject            = By.xpath("//div[contains(@id,'ShortSubject')]//div[@class='gw-value']");
	final By APD_AP_Class                   = By.xpath("//div[contains(@id,'ActivityClass')]//div[@class='gw-RangeValue']");
	final By APD_AP_Type                    = By.xpath("//div[contains(@id,'AdminActivityPatternDV-Type')]//div[@class='gw-RangeValue']");
	final By APD_AP_Category                = By.xpath("//div[contains(@id,'Category')]//div[@class='gw-RangeValue']");
	final By APD_AP_Code                    = By.xpath("//div[contains(@id,'Code')]//div[@class='gw-value-readonly-wrapper']");
	final By APD_AP_Priority                = By.xpath("//div[contains(@id,'Priority')]//div[@class='gw-RangeValue']");
	final By APD_AP_Mandatory               = By.xpath("//div[contains(@id,'Mandatory')]//div[@class='gw-RangeValue']");
	final By APD_AP_CalenderImportance      = By.xpath("//div[contains(@id,'Importance')]//div[@class='gw-RangeValue']");
	final By APD_AP_ClaimLossType           = By.xpath("//div[contains(@id,'ClaimLossType')]//div[@class='gw-value']");
	final By APD_AP_AutomatedOnly           = By.xpath("//div[contains(@id,'AutomatedOnly')]//div[@class='gw-RangeValue']");
	final By APD_AP_AvailableForClosedClaim = By.xpath("//div[contains(@id,'AvailableForClosedClaim')]//div[@class='gw-RangeValue']");
	final By APD_AP_ExternallyOwned         = By.xpath("//div[contains(@id,'ExternallyOwned')]//div[@class='gw-RangeValue']");
	final By APD_AP_DocumentTemplate        = By.xpath("//div[contains(@id,'CreateDocument')]//div[@class='gw-value']");
	final By APD_AP_EmailTemplate           = By.xpath("//div[contains(@id,'EmailTemplate')]//div[@class='gw-value']");
	final By APD_AP_Recurring               = By.xpath("//div[contains(@id,'Recurring')]//div[@class='gw-RangeValue']");
	final By APD_AP_Description             = By.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper']");

	/*-----------
	  Activity Pattern Dates
	  -------*/

	final By APD_ActivityPatternDates = By.xpath("//div[contains(@id,'AdminActivityPatternDV-3')]//div[@class='gw-label gw-boldLabel']");
	// final By APD_AP_Target =
	// By.xpath("//div[contains(@id,'TargetDays')]//div[@class='gw-value-readonly-wrapper']");

	final By APD_APDates_Target                     = By.xpath("//div[contains(@id,'TargetDays')]//div[@class='gw-value']");
	final By APD_APDates_TargetHours                = By.xpath("//div[contains(@id,'TargetHours')]//div[@class='gw-value']");
	final By APD_APDates_TargetStartPoint           = By.xpath("//div[contains(@id,'TargetStartPoint')]//div[@class='gw-value']");
	final By APD_APDates_TargetIncludeTheseDays     = By.xpath("//div[contains(@id,'TargetStartPoint_Input')]/following-sibling::div[contains(@id,'TargetIncludeDays_Input')]/div[@class='gw-value']");
	final By APD_APDates_TargetBusinesscalendarType = By.xpath("//div[contains(@id,'TargetIncludeDays_Input')]/following-sibling::div[contains(@id,'TargetBusCalType_Input')]/div[@class='gw-value']");

	final By APD_APDates_EscalationDays                 = By.xpath("//div[contains(@id,'EscalationDays')]//div[@class='gw-value']");
	final By APD_APDates_EscalationHours                = By.xpath("//div[contains(@id,'EscalationHours')]//div[@class='gw-value']");
	final By APD_APDates_EscalationStartPoint           = By.xpath("//div[contains(@id,'EscalationStartPoint')]//div[@class='gw-value']");
	final By APD_APDates_EscalationIncludeTheseDays     = By.xpath("//div[contains(@id,'EscalationStartPoint_Input')]/following-sibling::div[contains(@id,'EscalationIncludeDays_Input')]/div[@class='gw-value']");
	final By APD_APDates_EscalationBusinesscalendarType = By.xpath("//div[contains(@id,'EscalationIncludeDays_Input')]/following-sibling::div[contains(@id,'EscalationBusCalType_Input')]/div[@class='gw-value']");
	// final By AP_NextButton = By.xpath("//div[@class='gw-paging--button-next
	// gw-paging--button']");
	final By AP_Enter = By.xpath("//input[contains(@id,'ActivityPatternsLV-_ListPaging-input')]");
}
