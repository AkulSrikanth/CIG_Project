package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_Resuables_PO {

	final By Next = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");

	final By Finish                = By.xpath("//div[contains(@id,'Finish')]//div[@role='button']");
	final By Finish_Button         = By.xpath("//div[@id='FNOLWizard-Finish']/div[@role='button']");
	final By OK                    = By.xpath("//div[contains(@id,'NewInjuryIncidentScreen-Update')]//div[@role='button']");
	final By Update                = By.xpath("//div[contains(@id,'CustomUpdateButton')]/div[@role='button']");
	final By Update_Button         = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");
	final By ExposureUpdate_Button = By.xpath("//div[contains(@id,'NewExposure-NewExposureScreen-Update')]//div[@role='button']");
	final By Cancel_Button         = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Cancel']");

	final By PolicyNumber = By.xpath("//div[contains(@id,'PolicyNumber')]//div[@class='gw-label gw-infoValue']");
	final By InsuredName  = By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']");
	final By LostDate     = By.xpath("//div[contains(@id,'LossDate')]//div[@class='gw-label gw-infoValue']");
	final By Adjuster     = By.xpath("//div[contains(@id,'Adjuster')]//div[@class='gw-label gw-infoValue']");

	/*
	 * Claims Tab
	 */
	final By TabCC_Claim                    = By.xpath("//div[@id='TabBar-ClaimTab']//div[@class='gw-label']");
	final By TabCC_Claim_dd                 = By.xpath("//div[@id='TabBar-ClaimTab']//div[3]");
	final By TabCC_Claim_NewClaim           = By.xpath("//div[@id='TabBar-ClaimTab-ClaimTab_FNOLWizard']//div[@class='gw-label']");
	final By TabCC_Claim_ClaimNumber        = By.xpath("//input[@name='TabBar-ClaimTab-ClaimTab_FindClaim']");
	final By TabCC_Claim_ClaimNumber_Search = By.xpath("//div[@id='TabBar-ClaimTab-ClaimTab_FindClaim_Button']//span");

	/*
	 * Headers
	 */

	final By Screen_Header            = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By AutoFirstandFinal_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Auto First and Final']");
	final By NewPerson_Header         = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='New Person']");
	final By EditReserves_Header      = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Edit Reserves']");
	final By NewAutoRepairShop_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='New Auto Repair Shop']");
	final By QuickClaimAuto_Header    = By.xpath("//div[contains(@id,'NewQuickClaimScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By PolicyGeneral_Header     = By.xpath("//div[contains(@id,'ClaimPolicyGeneralScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By SelectPolicy_Header      = By.xpath("//div[contains(@id,'ClaimPolicySelectPolicyScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By Summary_Header           = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Summary']");

	final By SR_RentalBeginDate = By.xpath("//input[contains(@name,'RentalInputGroup-RentalBeginDate')]");
	final By SR_RentalEndDate   = By.xpath("//input[contains(@name,'RentalInputGroup-RentalEndDate')]");
	final By SR_RentalDailyRate = By.xpath("//input[contains(@name,'RentalInputGroup-RentalRate')]");
	final By SR_RentalAgency    = By.xpath("//select[contains(@name,'RentalInputGroup-RentalAgency')]");
	final By SR_PickupLocation  = By.xpath("//select[contains(@name,'ServiceAddressPicker')]");

	/*
	 * NewExposure-MedPay
	 */
	final By NewExposurMedPay_Header = By.xpath("//div[@id='NewExposure-NewExposureScreen-ttlBar']//div[@class='gw-TitleBar--title']");
	final By Exposure_Header         = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By NEMP_Claimant           = By.xpath("//select[contains(@name,'NewExposureDV-Claimant_Picker')]");

	/*
	 * Injury Incident Overview
	 */
	final By Injury_Incident_Overview = By.xpath("//div[contains(@id,'Injury_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	final By IIO_NewIncident          = By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@class='gw-label']");
	final By II_LossParty             = By.xpath("//select[contains(@name,'InjuryIncidentInputSet-LossParty')]");

	/*
	 * Edit reserve
	 */

	final By ER_ExposureSelect       = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//div[contains(@id,'_Checkbox')]/input");
	final By ER_Exposure             = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'Exposure_Cell')]//select[contains(@name,'Exposure')]");
	final By ER_Coverage             = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'Coverage_Cell')]//select[contains(@name,'Coverage')]");
	final By ER_CostType             = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'CostType_Cell')]//select[contains(@name,'CostType')]");
	final By ER_CostCategory         = By.xpath("//tr[contains(@id,'EditableReservesLV')]//td[contains(@id,'CostCategory_Cell')]//select[contains(@name,'CostCategory')]");
	final By ER_NewAvailableReserves = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'NewAmount_Cell')]//input[contains(@name,'NewAmount')]");
	final By ER_Comments             = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'Comments_Cell')]//input[contains(@name,'Comments')]");
	final By ER_Save                 = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Save']");

}
