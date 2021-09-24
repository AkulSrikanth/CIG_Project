package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.CommercialAuto.CA_CommercialAutoLine;
import com.pages.Guidewire.CommercialAuto.CA_CoveredVehicles;
import com.pages.Guidewire.CommercialAuto.CA_Drivers;
import com.pages.Guidewire.CommercialAuto.CA_Locations;
import com.pages.Guidewire.CommercialAuto.CA_Modifiers;
import com.pages.Guidewire.CommercialAuto.CA_PolicyInfo;
import com.pages.Guidewire.CommercialAuto.CA_PolicyReview;
import com.pages.Guidewire.CommercialAuto.CA_Qualification;
import com.pages.Guidewire.CommercialAuto.CA_Quote;
import com.pages.Guidewire.CommercialAuto.CA_Reusable;
import com.pages.Guidewire.CommercialAuto.CA_RiskAnalysis;
import com.pages.Guidewire.CommercialAuto.CA_StateInfo;
import com.pages.Guidewire.CommercialAuto.CA_Vehicles;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_CommercialAuto extends GW_GetDriver {
	@Test

	public void AUT_CA_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
		PolicyCenter_AccountSummary.detail_Verify();
		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		CA_Reusable.newSubmission_SelectLOB_CommercialAuto();// select
															// LOB
		
		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");
		
		
		PolicyCenter_Resuables.offering();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Qualification.qualification();
		PolicyCenter_Resuables.clickButton("Next");
		CA_PolicyInfo.dateQuoteNeeded();
		CA_PolicyInfo.primaryNamedInsured();
		CA_PolicyInfo.policyAddress();
		CA_PolicyInfo.OfficialID();
		CA_PolicyInfo.OrganizationType();
		CA_PolicyInfo.policyDetails();
		PolicyCenter_Resuables.clickButton("Next");
		CA_CommercialAutoLine.coverages_Product();
		CA_CommercialAutoLine.coverages_Fleet();
		CA_CommercialAutoLine.coverages_SeasonalTrailerLiability();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Locations.Location();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Vehicles.VehicleInformation();
		PolicyCenter_Resuables.clickButton("Next");
		CA_StateInfo.Stateinfo();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Drivers.Driver();
		CA_Drivers.DriverDetails();
		PolicyCenter_Resuables.clickButton("Next");
		CA_CoveredVehicles.CoveredVehicles();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);
		CA_Modifiers.Modifiers();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);
		CA_RiskAnalysis.RiskAnalysis();
		PolicyCenter_Resuables.clickButton("Next");
		CA_PolicyReview.PolicyReview();
		CA_PolicyReview.PolicyDetails();
		PolicyCenter_Resuables.clickButton("Quote");
		CA_Reusable.CaValidationError();
		CA_Reusable.caMenuNavigation("Commercial Auto Line");
		CA_Reusable.CaValidationError();
		PolicyCenter_Resuables.clickButton("Quote");
		Thread.sleep(2000);
		CA_Quote.quoteDetails();
		
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

}
