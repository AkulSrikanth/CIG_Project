package com.pages.Guidewire.ClaimsCenter;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class CC_NewClaimWizard extends SeleniumWebDriver_Commands implements CC_NewClaimWizard_PO {

	static String strClaims_AssignedGroup = null;
	static String strClaims_AssignedUser  = null;

	public CC_NewClaimWizard(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void ncw_SearchorCreatePolicy_FindPolicy_Search() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asFindPolicy");

			strPolicyNumber = null;
			strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");

			// ------> Verifying the page -
			GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "contains", "Search or Create Policy");

			GuidewireAutomate("Find Policy", SCP_FindPolicy, "clickAndwait", "click");

			GuidewireAutomate("Policy Number", SCP_FP_PolicyNumber, "clearANDsendKeys", strPolicyNumber);
			GuidewireAutomate("First Name", SCP_FP_FirstName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_FirstName"));
			GuidewireAutomate("Last Name", SCP_FP_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_LastName"));
			GuidewireAutomate("Organization Name", SCP_FP_OrganizationName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_OrganizationName"));
			GuidewireAutomate("Policy Type", SCP_FP_PolicyType, "selectByVisibleText", lhm_TestCase_Table_Data.get("SCP_FP_PolicyType"));

			// ----->Verify Policy should be retrieved and displayed.
			GuidewireAutomate("Search", SP_FP_Search, "clickAndwait", "click");

			GuidewireAutomate_Validation("Policy", SCP_FP_PR_Policy, "equals", strPolicyNumber);
			GuidewireAutomate_Validation("Insured", SCP_FP_PR_Insured, "equals", lhm_TestCase_Table_Data.get("SCP_FP_PR_Insured"));
			GuidewireAutomate_Validation("EffectiveDate", SCP_FP_PR_EffectiveDate, "fetch", lhm_TestCase_Table_Data.get("SCP_FP_PR_EffectiveDate"));
			GuidewireAutomate_Validation("ExpirationDate", SCP_FP_PR_ExpirationDate, "fetch", lhm_TestCase_Table_Data.get("SCP_FP_PR_ExpirationDate"));
			GuidewireAutomate_Validation("Type", SCP_FP_PR_Type, "equals", lhm_TestCase_Table_Data.get("SCP_FP_PolicyType"));

			oExtentTest.log(Status.PASS, "Search PolicyNumber = [" + strPolicyNumber + "] is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Search PolicyNumber = [" + strPolicyNumber + "] is Unsuccesful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_SearchorCreatePolicy_FindPolicy_NewClaim() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asFindPolicy");

		String strSCP_NC_TypeofClaim = lhm_TestCase_Table_Data.get("SCP_TypeOfClaim");

		try {

			GuidewireAutomate_Validation("New Claim", SCP_NewClaim, "equals", "New Claim");

			GuidewireAutomate("LossDate", SCP_NC_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
			GuidewireAutomate("Time", SCP_NC_Time, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_Time"));

			By SCP_NC_TypeofClaim = By.xpath("//span[@class='gw-label--inner' and text()='" + strSCP_NC_TypeofClaim + "']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimMode')]");
			GuidewireAutomate("TypeofClaim = " + strSCP_NC_TypeofClaim, SCP_NC_TypeofClaim, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "New Claim Type = [" + strSCP_NC_TypeofClaim + "] selection is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "New Claim Type = [" + strSCP_NC_TypeofClaim + "] selection is succesful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_SearchorCreatePolicy_FindPolicy_ClaimsHistory() throws Throwable {

		/*
		 * <All fields should be added> <20-july-2021> <Akula Srikanh>
		 */

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asFindPolicy");

		GuidewireAutomate_Validation("Claims History", SCP_ClaimsHistory, "equals", "Claims History");

	}

	public static void ncw_Auto_BasicInformation() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");

			//String InsuredName = ClaimCenter_Resuables.infoBar("InsuredName");

			GuidewireAutomate_Validation("Screen Header", NCW_BasicInformation_Header, "equals", "Step 2 of 5: Basic information");

			/*
			 * Reported By
			 */
			GuidewireAutomate_Validation("Section", BI_ReportedBy, "equals", "Reported By");
			GuidewireAutomate("How Reported", BI_RB_HowReported, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_RB_HowReported"));
			GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_RB_Name"));
			getStaleElement("Relation to Insured", BI_RB_RelationtoInsured);
			GuidewireAutomate("Relation to Insured", BI_RB_RelationtoInsured, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_RB_RelationtoInsured"));
			GuidewireAutomate("Date of Notice", BI_RB_DateofNotice, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_RB_DateofNotice"));

			/*
			 * Verify Date of Birth
			 */
			GuidewireAutomate_Validation("Section", BI_VerifyDateofBirth, "equals", "Verify Date of Birth");
			GuidewireAutomate_Validation("Date of Birth", BI_VDOB_DateofBirth, "equals", lhm_TestCase_Table_Data.get("BI_VDOB_DateofBirth"));
			/*
			 * Confirm Contact Info
			 */
			GuidewireAutomate_Validation("Section", BI_ConfirmContactInfo, "equals", "Confirm Contact Info");
			GuidewireAutomate_Validation("Address", BI_CCI_Address, "equals", lhm_TestCase_Table_Data.get("BI_CCI_Address"));
			GuidewireAutomate_Validation("Work Phone", BI_CCI_WorkPhone, "valueEquals", lhm_TestCase_Table_Data.get("BI_CCI_WorkPhone"));
			GuidewireAutomate_Validation("Home Phone", BI_CCI_HomePhone, "valueEquals", lhm_TestCase_Table_Data.get("BI_CCI_HomePhone"));
			GuidewireAutomate("Mobile", BI_CCI_Mobile, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_CCI_Mobile"));
			GuidewireAutomate("Primary Phone", BI_CCI_PrimaryPhone, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_CCI_PrimaryPhone"));
			GuidewireAutomate("Email", BI_CCI_Email, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_CCI_Email"));
			/*
			 * Insured
			 */
			GuidewireAutomate_Validation("Section", BI_Insured, "equals", "Insured");
			GuidewireAutomate_Validation("Name", BI_I_Name, "equals", lhm_TestCase_Table_Data.get("BI_I_Name"));
			GuidewireAutomate_Validation("Address", BI_I_Address, "equals", lhm_TestCase_Table_Data.get("BI_I_Address"));
			GuidewireAutomate_Validation("Primary Phone", BI_I_PrimaryPhone, "equals", lhm_TestCase_Table_Data.get("BI_I_PrimaryPhone"));

			/*
			 * Main Contact
			 */
			GuidewireAutomate_Validation("Section", BI_MainContact, "equals", "Main Contact");
			if (lhm_TestCase_Table_Data.get("BI_MC_SamePerson").equals("Same as reporter")) {
				GuidewireAutomate("Same Person", BI_MC_SamePerson_SameAsReporter, "click", lhm_TestCase_Table_Data.get("BI_MC_SamePerson"));
			} else if (lhm_TestCase_Table_Data.get("BI_MC_SamePerson").equals("Different person")) {
				GuidewireAutomate("Same Person", BI_MC_SamePerson_Differentperson, "click", lhm_TestCase_Table_Data.get("BI_MC_SamePerson"));

				GuidewireAutomate("Name", BI_MC_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_MC_Name"));
				GuidewireAutomate("Relation to Insured", BI_MC_RelationtoInsured, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_MC_RelationtoInsured"));
			}

			/*
			 * Involved Vehicle(s)
			 */
			GuidewireAutomate_Validation("Section", BI_InvolvedVehicle, "equals", "Involved Vehicle(s)");

			String strBI_IV_Select = lhm_TestCase_Table_Data.get("BI_IV_Select");
			By     BI_IV_Select    = By.xpath("//div[@role='heading' and text()='" + strBI_IV_Select + "']/preceding-sibling::div//input[@type='checkbox']");
			GuidewireAutomate("Select = " + strBI_IV_Select, BI_IV_Select, "clickAndwait", strBI_IV_Select);

			oExtentTest.log(Status.PASS, "Basic Information is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Basic Information is not succesful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_PossibleDuplicateClaims() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", DC_PossibleDuplicateClaims_Header, "equals", "Possible Duplicate Claims");
		GuidewireAutomate_Validation("Possible duplicate claims", DC_Possibleduplicateclaimsfound, "contains", "Possible duplicate claims found");

		oExtentTest.log(Status.PASS, "Basic Information is succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

		GuidewireAutomate("Close", DC_Close, "clickAndwait", "click");
	}

	public static void ncw_Auto_AddClaimInformation() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asAddClaimInfo");

			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 5: Add claim information");

			GuidewireAutomate("What Happened", ACI_WhatHappened, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_WhatHappened"));
			GuidewireAutomate_Validation("Loss Date", AI_LossDate, "fetch", lhm_TestCase_Table_Data.get("ACI_LossDate"));
			GuidewireAutomate("Loss Cause", ACI_LossCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_LossCause"));
			GuidewireAutomate("Incident Only", ACI_IncidentOnly, "click", lhm_TestCase_Table_Data.get("ACI_IncidentOnly"));

			GuidewireAutomate("Location", ACI_Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_Location"));
			GuidewireAutomate("Country", ACI_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_Country"));
			GuidewireAutomate("State", ACI_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_State"));
			GuidewireAutomate("Address1", ACI_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_Address1"));
			GuidewireAutomate("Address2", ACI_Address2, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_Address2"));
			GuidewireAutomate_Validation("Address3", ACI_Address3, "valueEquals", lhm_TestCase_Table_Data.get("ACI_Address3"));
			GuidewireAutomate_Validation("City", ACI_City, "valueEquals", lhm_TestCase_Table_Data.get("ACI_City"));
			GuidewireAutomate_Validation("County", ACI_County, "valueEquals", lhm_TestCase_Table_Data.get("ACI_County"));
			GuidewireAutomate_Validation("ZIP Code", ACI_ZIPCode, "valueEquals", lhm_TestCase_Table_Data.get("ACI_ZIPCode"));
			GuidewireAutomate("Location Description", ACI_LocationDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_LocationDescription"));
			GuidewireAutomate("Location Code", ACI_LocationCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_LocationCode"));
			GuidewireAutomate("Jurisdiction", ACI_Jurisdiction, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_Jurisdiction"));

			GuidewireAutomate_Validation("Section", ACI_VehiclesPeopleProperty, "equals", "Vehicles, People, & Property");
			GuidewireAutomate_Validation("Section", ACI_AttheScene, "equals", "At the Scene");
			GuidewireAutomate_Validation("Section", ACI_Categorization, "equals", "Categorization");

			oExtentTest.log(Status.PASS, "Add claim Information is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Add claim Information is not succesful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_Auto_AddClaimInformation_VehiclesPeopleProperty() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asAddClaimInfo");

		GuidewireAutomate_Validation("Section", ACI_VehiclesPeopleProperty, "equals", "Vehicles, People, & Property");

		GuidewireAutomate_Validation("Add Vehicle", ACI_AddVehicle, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddVehicle"));
		GuidewireAutomate_Validation("Add Pedestrian", ACI_AddPedestrian, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddPedestrian"));
		GuidewireAutomate_Validation("Add Property Damage", ACI_AddPropertyDamage, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddPropertyDamage"));

	}

	public static void ncw_Auto_AddClaimInformation_Vehicles() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asAddClaimInfo");

		GuidewireAutomate_Validation("Section", ACI_VehiclesPeopleProperty, "equals", "Vehicles, People, & Property");
		GuidewireAutomate_Validation("Add Vehicle", ACI_AddVehicle, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddVehicle"));

	}

	public static void ncw_Auto_AddClaimInformation_People() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asAddClaimInfo");

		GuidewireAutomate_Validation("Section", ACI_VehiclesPeopleProperty, "equals", "Vehicles, People, & Property");
		GuidewireAutomate_Validation("Add Pedestrian", ACI_AddPedestrian, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddPedestrian"));

	}

	public static void ncw_Auto_AddClaimInformation_Property() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asAddClaimInfo");

		GuidewireAutomate_Validation("Section", ACI_VehiclesPeopleProperty, "equals", "Vehicles, People, & Property");
		GuidewireAutomate_Validation("Add Property Damage", ACI_AddPropertyDamage, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddPropertyDamage"));

	}

	public static void ncw_Services() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asServices");

		GuidewireAutomate_Validation("Screen Header", Services_Header, "equals", "Step 4 of 5: Services");
		GuidewireAutomate_Validation("Section", Services_InvolvedVehicles, "equals", "Involved Vehicles");

		String strVehicleName = lhm_TestCase_Table_Data.get("VehicleName");
		By     VehicleName    = By.xpath("//div[contains(@id,'VehicleName')]/div[contains(@class,'gw-boldLabel') and text()='" + strVehicleName + "']");
		GuidewireAutomate_Validation("Vehicle Name", VehicleName, "isDisplayed", lhm_TestCase_Table_Data.get("VehicleName"));

		oExtentTest.log(Status.PASS, "Services is succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

	}

	public static void ncw_SaveAndAssignClaim() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asSaveAndAssignClaim");

		// ---->Add script to Select a user 09-07-2021 dinesh
		GuidewireAutomate_Validation("Screen Header", SaveAndAssignClaim_Header, "equals", "Step 5 of 5: Save and Assign Claim");
		GuidewireAutomate_Validation("Section", SAC_Assignment, "equals", "Assignment");

		GuidewireAutomate("CommonAssign", SAC_A_CommonAssign, "clickAndwait", "click");
		GuidewireAutomate_Validation("Assign claim and all exposures to", SAC_A_AssignclaimExposuresto, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("SAC_A_AssignclaimExposuresto"));

		oExtentTest.log(Status.PASS, "Save and Assign Claim is succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
	}

	public static void ncw_newClaimSaved() throws Throwable {

		strClaimsNumber = null;

		GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");

		GuidewireAutomate_Validation("Claim Saved", NCS_ClaimSaved, "contains", "has been successfully saved");

		strClaimsNumber         = getText_Element(NCS_ClaimSaved).substring(6, 19);
		strClaims_AssignedGroup = getText_Element(NCS_AssignedGroup).replace("Assigned Group: ", "");
		strClaims_AssignedUser  = getText_Element(NCS_AssignedUser).replace("Assigned User: ", "");

		Selenium_Utils_DataBase.UpdateData_ClaimsCenter("searchValues", "ClaimsNumber", strClaimsNumber);
		Selenium_Utils_DataBase.UpdateData_ClaimsCenter("asSaveAndAssignClaim", "ClaimsNumber", strClaimsNumber);
		Selenium_Utils_DataBase.UpdateData_ClaimsCenter("asSaveAndAssignClaim", "AssignedGroup", strClaims_AssignedGroup);
		Selenium_Utils_DataBase.UpdateData_ClaimsCenter("asSaveAndAssignClaim", "AssignedToUser", strClaims_AssignedUser);

		oExtentTest.log(Status.PASS, "New Claim Saved is succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
	}

	public static void ncw_ClaimAssign_RoundRobin() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");

		String            currentUserAssign = "Terence Mazzon";
		ArrayList<String> rrExpectedUsers   = new ArrayList<String>();

		String[] aExpectedUsers = {"Betty Baker", "Heidi Johnson", "Terence Mazzon", "Isabel Numin", "Carlos Oppley", "Rick Ralston"};

		for (int intUser = 0; intUser < aExpectedUsers.length; intUser++) {

			// ------>Creating New Claim
			CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

			GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");

			String strActual_AssignedUser = getText_Element(NCS_AssignedUser).replace("Assigned User: ", "");
			if (strActual_AssignedUser.equals(aExpectedUsers[intUser])) {
				oExtentTest.log(Status.PASS, "ClaimAssign To User " + aExpectedUsers[intUser]);
			} else {
				oExtentTest.log(Status.FAIL, "ClaimAssign To User " + strActual_AssignedUser);
			}
		}

	}

	public static void ncw_newClaimSaved_Verify_ClaimAssignToUser(String strExpected_AssignedUser) throws Throwable {

		strClaimsNumber = null;

		GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");

		String strActual_AssignedUser = getText_Element(NCS_AssignedUser).replace("Assigned User: ", "");
		if (strActual_AssignedUser.equals(strExpected_AssignedUser)) {
			oExtentTest.log(Status.PASS, "ClaimAssign To User " + strActual_AssignedUser);
		} else {
			oExtentTest.log(Status.FAIL, "ClaimAssign To User " + strExpected_AssignedUser);
		}

	}

	public static void ncw_SearchorCreatePolicy_CreateUnverifiedPolicy() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("ncwStep1");

		strPolicyNumber = null;
		strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");
		String strTypeOfClaim = lhm_TestCase_Table_Data.get("SCP_TypeOfClaim");

		// ------> Verifying the page -
		GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "equals", "Step 1 of 5: Search or Create Policy");

		GuidewireAutomate("Create Unverified Policy", CreateUnverifiedPolicy, "clickAndwait", "click");
		GuidewireAutomate("Policy Number", CUP_PolicyNumber, "clearANDsendKeys", strPolicyNumber);
		GuidewireAutomate("Type", CUP_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("Type"));

		By TypeOfClaim = By.xpath("//span[@class='gw-label--inner' and text()='" + strTypeOfClaim + "']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimLossType')]");
		GuidewireAutomate("Type Of Claim = " + strTypeOfClaim, TypeOfClaim, "clickAndwait", "click");

		GuidewireAutomate("Loss Date", CUP_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDate"));
		GuidewireAutomate("Time", CUP_Time, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDate"));

	}

	public static void selectPolicy() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("selectPolicy");

		GuidewireAutomate_Validation("Screen Header", PolicyGeneral_Header, "equals", "Policy: General");
		GuidewireAutomate("Select Policy", SelectPolicy, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", SelectPolicy_Header, "equals", "Select Policy");
		GuidewireAutomate("Policy Number", SP_PolicyNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PolicyNumber"));
		GuidewireAutomate("Search", SP_Search, "clickAndwait", "click");
		GuidewireAutomate("Select", SP_Select, "clickAndwait", "click");

	}

	public static void basicInfo() throws Throwable {

		String insuredName = ClaimCenter_Resuables.infoBar("InsuredName");

		GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleText", insuredName);

	}

	public static void basicInfoAssignClaim() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("basicInfo");

		String insuredName = ClaimCenter_Resuables.infoBar("InsuredName");

		GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleText", insuredName);

	}

	public static void ncw_CreateUnverifiedPolicy_BasicInformation() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("CUPstep1");

		strPolicyNumber = null;
		strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");

		GuidewireAutomate_Validation("Basic Information", CUP_BasicInformation, "equals", "Basic Information");

		GuidewireAutomate_Validation("Policy Number", NCW_SearchorCreatePolicy_Header, "equals", strPolicyNumber);
		GuidewireAutomate_Validation("Type", NCW_SearchorCreatePolicy_Header, "equals", lhm_TestCase_Table_Data.get("Type"));
		GuidewireAutomate("Effective Date", CUP_BI_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Type"));
		GuidewireAutomate("Expiration Date", CUP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ExpirationDate"));
		GuidewireAutomate("Cancellation Date", CUP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CancellationDate"));
		GuidewireAutomate("Original Effective Date", CUP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("OriginalEffectiveDate"));
		GuidewireAutomate("Status", CUP_BI_ExpirationDate, "selectByVisibleText", lhm_TestCase_Table_Data.get("Status"));

	}

	public static void ncw_CreateUnverifiedPolicy_Insured_Search() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("CUPstep1");

		GuidewireAutomate("Insured Select", CUP_Insured_SelectMenu_Button, "clickAndwait", "click");
		GuidewireAutomate("Search", CUP_Insured_Menu_Search, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Search Address Book");

		GuidewireAutomate("LastName", NP_P_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));
		GuidewireAutomate("TaxID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));
		GuidewireAutomate("Address1", NP_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));

	}

	public static void ncw_CreateUnverifiedPolicy_Insured_NewPerson() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("CUPstep1");

		GuidewireAutomate("Insured Select", CUP_Insured_SelectMenu_Button, "clickAndwait", "click");
		GuidewireAutomate("New Person", CUP_Insured_Menu_NewPerson, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "New Person");

		GuidewireAutomate_Validation("Section", PolicyCenter_Resuables_PO.Screen_Header, "equals", "This contact is not linked to the Address Book");

		GuidewireAutomate_Validation("Section", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Person");

		GuidewireAutomate("LastName", NP_P_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));
		GuidewireAutomate("TaxID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));

	}

	public static void fnol_Search_UnverifiedPolicy_AddVehicle() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("SearchPolicy");

		GuidewireAutomate("AddVehicle", CUP_ANV_AddVehicle, "clickAndwait", "click");

		GuidewireAutomate_Validation("Screen Header", SP_NewVehicle, "equals", "New Vehicle");
		GuidewireAutomate("Make", CUP_ANV_Make, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Make"));
		GuidewireAutomate("Model", CUP_ANV_Model, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Model"));
		GuidewireAutomate("Year", CUP_ANV_Year, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Year"));

		GuidewireAutomate("AddCoverages", CUP_ANV_AddCoverages, "clickAndwait", "click");

		GuidewireAutomate("CoverageType", CUP_ANV_CoverageType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CoverageType"));
		GuidewireAutomate("ExposureLimit", CUP_ANV_ExposureLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ExposureLimit"));
		GuidewireAutomate("IncidentLimit", CUP_ANV_IncidentLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("IncidentLimit"));
		GuidewireAutomate("Ok", Ok, "clickAndwait", "click");
	}

	public static void ncw_ViewtheNewlySavedClaim() throws Throwable {
		// GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");

		GuidewireAutomate("ViewtheNewlySavedClaim", NCS_ViewtheNewlySavedClaim, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", Summary_Header, "equals", "Summary");

	}

	public static void assignClaim() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", Assign_Header, "equals", "Assign");
		GuidewireAutomate("Assign", Assign_Button, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Summary_Header, "equals", "Summary");

	}

	public static void ncw_AutoFirstandFinal() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("acAutoFirstandFinal", strTestCaseName);

		String strInsuredName = lhm_TestCase_Table_Data.get("AFF_InsuredName");

		GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "equals", "Step 1 of 2: Search or Create Policy");
		ClaimCenter_Resuables.clickButton("Next");
		GuidewireAutomate_Validation("Screen Header", AutoFirstandFinal_Header, "equals", "Step 2 of 2: Auto First and Final");

		By WhoReportedClaim = By
				.xpath("//span[@class='gw-label--inner' and text()='" + lhm_TestCase_Table_Data.get("AFF_WhoreportedClaim") + "']//parent::label[@class='gw-RangeRadioValueWidget--label']//input[contains(@id,'FirstFinalReportedAgencyRadioButton')]");
		GuidewireAutomate("Who Reported Claim", WhoReportedClaim, "clickAndwait", "click");

		GuidewireAutomate("Name", AFF_Insured_Name, "selectByVisibleText", strInsuredName);

		GuidewireAutomate_Validation("Section", AFF_Damage, "equals", "Damage");
		GuidewireAutomate("Loss Description", AFF_Damage_LossDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDescription"));

		GuidewireAutomate_Validation("Section", AFF_Claimant, "equals", "Claimant");
		GuidewireAutomate("Name", AFF_ClaimantName, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_ClaimantName"));
		GuidewireAutomate("Claimant Type", AFF_ClaimantType, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_ClaimantType"));

		GuidewireAutomate("Location", AFF_Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_Location"));
		GuidewireAutomate("Country", AFF_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_Country"));
		GuidewireAutomate("State", AFF_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_State"));
		GuidewireAutomate("Address1", AFF_Address1, "sendKeys", lhm_TestCase_Table_Data.get("AFF_Address1"));

		RepairShop_Search();

		GuidewireAutomate("Financials Name", AFF_Financials_Name, "selectByVisibleText", strInsuredName);
		GuidewireAutomate_Validation("Screen Header", AutoFirstandFinal_Header, "equals", "Step 2 of 2: Auto First and Final");
		GuidewireAutomate("Financials PayeeType", AFF_Financials_PayeeType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("PayeeType"));
		GuidewireAutomate("Financials Amount", AFF_Financials_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("FinancialsAmount"));
		GuidewireAutomate("Financials State", AFF_Financials_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("FinancialsState"));
		GuidewireAutomate("Finish_Button", Finish_Button, "clickAndwait", "click");

	}

	public static void RepairShop_Search() throws Throwable {

		String strSABFV_Name = lhm_TestCase_Table_Data.get("SABFV_Name");

		GuidewireAutomate_Validation("Section", AFF_Repair, "equals", "Repair");
		GuidewireAutomate("Repair", AFF_RepairShop_TypeButton, "clickAndwait", "click");
		GuidewireAutomate("Search", AFF_RepairShop_Search, "clickAndwait", "click");

		GuidewireAutomate_Validation("Screen Header", SearchAddressBookForVendors_Header, "equals", "Search Address Book For Vendors");

		GuidewireAutomate("Type", SABFV_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("SABFV_Type"));
		GuidewireAutomate("Name", SABFV_Name, "clearANDsendKeys", strSABFV_Name);

		GuidewireAutomate("Search", SABFV_Search, "clickAndwait", "click");

		By RepairShop_Select = By.xpath("//div[@class='gw-ActionValueWidget' and text()='" + strSABFV_Name + "']/ancestor::td[contains(@id,'DisplayName_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
		GuidewireAutomate("selectVendor", RepairShop_Select, "clickAndwait", "click");

	}

	public static void RepairShop_NewAutobodyRepairShop() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AutoFirstandFinal", strTestCaseName);

		// ----->Based on Type Of Contact in partiesInvolved we have to select name in line no 164 09-07-2021

		GuidewireAutomate_Validation("Section", AFF_Repair, "equals", "Repair");
		GuidewireAutomate("Repair", AFF_RepairShop_TypeButton, "clickAndwait", "click");
		GuidewireAutomate("NewAutobodyRepairShop", AFF_RepairShop_NewAutobodyRepairShop, "clickAndwait", "click");

		GuidewireAutomate_Validation("Screen Header", NewAutoRepairShop_Header, "equals", "New Auto Repair Shop");

		// String AutoRepairShopName =
		// lhm_TestCase_Table_Data.get("AutoRepairShopName");
		String AutoRepairShopName = "AutoRepairShopName" + getRandomNumeric(5);
		GuidewireAutomate("AutoRepairShop_Name", AFF_AutoRepairShop_Name, "clearANDsendKeys", AutoRepairShopName);

		String TaxID = lhm_TestCase_Table_Data.get("AutoRepairShopTaxID");
		if (TaxID.equalsIgnoreCase("345-34-310")) {
			String NewTaxId = TaxID + getRandomNumeric(1);
			GuidewireAutomate("Comments", AFF_AutoRepairShop_TaxID, "clearANDsendKeys", NewTaxId);
		} else {
			GuidewireAutomate("Comments", AFF_AutoRepairShop_TaxID, "clearANDsendKeys", TaxID);
		}

		GuidewireAutomate("Address1", AFF_AutoRepairShop_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));
		GuidewireAutomate("City", AFF_AutoRepairShop_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("City"));
		GuidewireAutomate("County", AFF_AutoRepairShop_County, "clearANDsendKeys", lhm_TestCase_Table_Data.get("County"));
		GuidewireAutomate("State", AFF_AutoRepairShop_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("AutoRepairShop_State"));
		GuidewireAutomate("ZIPCode", AFF_AutoRepairShop_ZIPCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ZIPCode"));
		GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");
		GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");
	}

	public static void RepairShop_NewVendor_Company() throws Throwable {
	}

	public static void RepairShop_NewVendor_Person() throws Throwable {
	}

	public static void RepairShop_NewVendor_ViewContactDetails() throws Throwable {
	}

	public static void New_QuickClaimAuto() throws Throwable {

		String insuredName = driver.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("QuickClaimAuto", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", QuickClaimAuto_Header, "equals", "Step 2 of 2: Quick Claim Auto");
		GuidewireAutomate("ReportedBy_Name", QCA_ReportedBy_Name, "selectByVisibleText", insuredName);
		GuidewireAutomate("LossCause", QCA_LossDetails_LossCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossCause"));
		GuidewireAutomate("State", QCA_LossDetails_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));
		GuidewireAutomate("Location", QCA_Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("Location"));

	}

	public static void assignClaimProcess(String strClaimType) throws Throwable {

		Tab_Menu_Navigation.ccTabNavigation("New Claim", "NA");

		switch (strClaimType) {
			case "VerifiedPolicyAuto" :
				ncw_SearchorCreatePolicy_FindPolicy_Search();
				ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
				ncw_SearchorCreatePolicy_FindPolicy_ClaimsHistory();
				ClaimCenter_Resuables.clickButton("Next");
				ncw_Auto_BasicInformation();
				ClaimCenter_Resuables.clickButton("Next");
				ncw_PossibleDuplicateClaims();
				ncw_Auto_AddClaimInformation();
				ncw_Auto_AddClaimInformation_VehiclesPeopleProperty();
				ClaimCenter_Resuables.clickButton("Next");
				ncw_Services();
				ClaimCenter_Resuables.clickButton("Next");
				ncw_SaveAndAssignClaim();
				ClaimCenter_Resuables.clickButton("Finish");
				// ClaimCenter_Resuables.clickButton("Finish");
				ncw_newClaimSaved();
				ncw_ViewtheNewlySavedClaim();
				break;

			case "VerifiedPolicyAutoFirstandFinal" :
				ncw_SearchorCreatePolicy_FindPolicy_Search();
				ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
				ncw_SearchorCreatePolicy_FindPolicy_ClaimsHistory();
				ncw_AutoFirstandFinal();
				break;
			case "QuickClaimAuto" :

				break;

		}
	}

}
