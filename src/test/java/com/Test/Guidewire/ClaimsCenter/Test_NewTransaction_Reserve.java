package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Reserve;

public class Test_NewTransaction_Reserve {

	@Test

	public void AUT_CollisionReserves_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

		ClaimCenter_Reserve.FinancialsTransactions_VerificationForDefaultReserve();

		ClaimCenter_Reserve.FinancialsTransactions_Verification();
	}

	@Test
	public void AUT_CollisionReserves_ClaimCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

		ClaimCenter_Reserve.FinancialsTransactions_VerificationForDefaultReserve();

		ClaimCenter_Reserve.FinancialsTransactions_Verification();
		ClaimCenter_Reserve.FinancialTransaction_NextPageValidation();
	}

	@Test
	public void AUT_CollisionReserves_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

		ClaimCenter_Reserve.FinancialsTransactions_VerificationForDefaultReserve();
		ClaimCenter_Reserve.FinancialsTransactions_Verification();

	}

	@Test
	public void AUT_CollisionReserves_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

		ClaimCenter_Reserve.FinancialsTransactions_VerificationForDefaultReserve();
		ClaimCenter_Reserve.FinancialsTransactions_Verification();

	}

	// -----------------------------------------------------------------------------------------------------------------------
	@Test
	public void AUT_ComprehensiveCoverage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_ComprehensiveCovearge_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_ComprehensiveCovearge_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_ComprehensiveCovearge_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

// --------------------------------------------------------------------------------------------------->
	@Test
	public void AUT_RentalReimbursementCovearge_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> 2002 Acura RL ->
		// RentalReimbursement
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");

		// Adding NewExposure
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.ValidationResults();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

		ClaimCenter_Reserve.EditReserves_ValidationResults();

		ClaimCenter_Reserve.FinancialsTransactions_VerificationForDefaultReserve();

		ClaimCenter_Reserve.FinancialsTransactions_Verification();
		ClaimCenter_Reserve.FinancialTransaction_NextPageValidation();
	}

	@Test
	public void AUT_RentalReimbursementCovearge_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> 2002 Acura RL ->
		// RentalReimbursement
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.ValidationResults();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

		ClaimCenter_Reserve.EditReserves_ValidationResults();

	}

	@Test
	public void AUT_RentalReimbursementCovearge_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> 2002 Acura RL ->
		// RentalReimbursement
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.ValidationResults();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

		ClaimCenter_Reserve.EditReserves_ValidationResults();

	}

	@Test
	public void AUT_RentalReimbursementCovearge_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> 2002 Acura RL ->
		// RentalReimbursement
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.ValidationResults();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

		ClaimCenter_Reserve.EditReserves_ValidationResults();

	}
	// --------------------------------------------------------------------------------------------------------->

	@Test
	public void AUT_TowingandLaborCoverage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> 2002 Acura RL ->TowingandLabor

		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TowingandLaborCoverage_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> 2002 Acura RL ->TowingandLabor

		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TowingandLaborCoverage_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> 2002 Acura RL ->TowingandLabor

		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
	}

	@Test
	public void AUT_TowingandLaborCoverage_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> 2002 Acura RL ->TowingandLabor

		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}
	// --------------------------------------------------------------------------------------------------------------------->

	@Test
	public void AUT_CollisionLimitedCoverage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Collision Limited Coverage

		Tab_Menu_Navigation.ccMenuNavigation("Collision Limited Coverage");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

		ClaimCenter_Reserve.FinancialsTransactions_VerificationForDefaultReserve();
		ClaimCenter_Reserve.FinancialsTransactions_Verification();
		ClaimCenter_Reserve.FinancialTransaction_NextPageValidation();
	}

	@Test
	public void AUT_CollisionLimitedCoverage_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Collision Limited Coverage

		Tab_Menu_Navigation.ccMenuNavigation("Collision Limited Coverage");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_CollisionLimitedCoverage_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Collision Limited Coverage

		Tab_Menu_Navigation.ccMenuNavigation("Collision Limited Coverage");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_CollisionLimitedCoverage_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Collision Limited Coverage

		Tab_Menu_Navigation.ccMenuNavigation("Collision Limited Coverage");

		// Adding NewExposure RentalReimbursement
		CC_ChooseCoverage.NewExposureValidation();

		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}
// -------------------------------------------------------------------------------------------------------------------->

	@Test
	public void AUT_DeathDisabilityBenefit_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_DeathDisabilityBenefit_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_DeathDisabilityBenefit_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_DeathDisabilityBenefit_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

//-----------------------------------------------------------------------------------------------------------------	

	@Test
	public void AUT_ElectronicEquipment_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_ElectronicEquipment_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_ElectronicEquipment_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_ElectronicEquipment_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

//-------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_LiabilityBodilyInjury_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_LiabilityBodilyInjury_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_LiabilityBodilyInjury_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_LiabilityBodilyInjury_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

//-----------------------------------------------------------------------------------------------------------------------
	@Test
	public void AUT_LiabilityPropertyDamage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_LiabilityPropertyDamage_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_LiabilityPropertyDamage_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_LiabilityPropertyDamage_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}
//---------------------------------------------------------------------------------------------------------
//Execution pending

	@Test
	public void AUT_LiabilityVehicle_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_LiabilityVehicle_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_LiabilityVehicle_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_LiabilityVehicle_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.EditReserves_Save();

	}

//----------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_MexicoCovBI_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov BI
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovBI_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov BI
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovBI_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov BI
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovBI_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov BI
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovPD_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov PD
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Property New Incident
		CC_ChooseCoverage.PropertyNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovPD_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov PD
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Property New Incident
		CC_ChooseCoverage.PropertyNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovPD_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov PD
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Property New Incident
		CC_ChooseCoverage.PropertyNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovPD_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov PD
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Property New Incident
		CC_ChooseCoverage.PropertyNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovVehicleDamage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage
		// limited-->Navigate to Mexico Cov Vehicle Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle New Incident
		CC_ChooseCoverage.VehicleNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovVehicleDamage_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage
		// limited-->Navigate to Mexico Cov Vehicle Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle New Incident
		CC_ChooseCoverage.VehicleNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovVehicleDamage_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage
		// limited-->Navigate to Mexico Cov Vehicle Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle New Incident
		CC_ChooseCoverage.VehicleNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovVehicleDamage_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage
		// limited-->Navigate to Mexico Cov Vehicle Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle New Incident
		CC_ChooseCoverage.VehicleNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovGenDamages_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov Gen Damages
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Click on update
		CC_ChooseCoverage.UpdateButton();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovGenDamages_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov Gen Damages
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Click on update
		CC_ChooseCoverage.UpdateButton();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovGenDamages_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov Gen Damages
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Click on update
		CC_ChooseCoverage.UpdateButton();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MexicoCovGenDamages_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Maxico Coverage limited-->
		// Navigate to Mexico Cov Gen Damages
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Click on update
		CC_ChooseCoverage.UpdateButton();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MedicalPayments_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Navigate to Medical
		// Payments
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Medical Payments");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MedicalPayments_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Navigate to Medical
		// Payments
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Medical Payments");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MedicalPayments_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Navigate to Medical
		// Payments
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Medical Payments");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_MedicalPayments_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage-->Policy level coverage-->Navigate to Medical
		// Payments
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Medical Payments");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPArkansas_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Arkansas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Arkansas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPArkansas_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Arkansas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Arkansas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPArkansas_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Arkansas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Arkansas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPArkansas_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Arkansas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Arkansas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Delaware
		Tab_Menu_Navigation.ccMenuNavigation("PIP Delaware");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPDelware_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Delaware
		Tab_Menu_Navigation.ccMenuNavigation("PIP Delaware");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPDelware_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Delaware
		Tab_Menu_Navigation.ccMenuNavigation("PIP Delaware");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPDelware_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Delaware
		Tab_Menu_Navigation.ccMenuNavigation("PIP Delaware");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPDistrictofColumbia_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP District of Columbia
		Tab_Menu_Navigation.ccMenuNavigation("PIP District of Columbia");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPDistrictofColumbia_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP District of Columbia
		Tab_Menu_Navigation.ccMenuNavigation("PIP District of Columbia");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPDistrictofColumbia_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP District of Columbia
		Tab_Menu_Navigation.ccMenuNavigation("PIP District of Columbia");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPDistrictofColumbia_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP District of Columbia
		Tab_Menu_Navigation.ccMenuNavigation("PIP District of Columbia");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPFlorida_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Florida
		Tab_Menu_Navigation.ccMenuNavigation("PIP Florida");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPFlorida_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Florida
		Tab_Menu_Navigation.ccMenuNavigation("PIP Florida");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPFlorida_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Florida
		Tab_Menu_Navigation.ccMenuNavigation("PIP Florida");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPFlorida_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Florida
		Tab_Menu_Navigation.ccMenuNavigation("PIP Florida");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Hawaii
		Tab_Menu_Navigation.ccMenuNavigation("PIP Hawaii");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPHawaii_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Hawaii
		Tab_Menu_Navigation.ccMenuNavigation("PIP Hawaii");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPHawaii_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Hawaii
		Tab_Menu_Navigation.ccMenuNavigation("PIP Hawaii");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPHawaii_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Choose by Coverage Type --> P--> Navigate to PIP Hawaii
		Tab_Menu_Navigation.ccMenuNavigation("PIP Hawaii");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Kansas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kansas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPKansas_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Kansas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kansas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPKansas_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Kansas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kansas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPKansas_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Kansas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kansas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPKentucky_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Kentucky
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPKentucky_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Kentucky
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPKentucky_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Kentucky
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPKentucky_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Kentucky
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Maryland
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMaryland_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Maryland
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMaryland_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Maryland
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMaryland_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Maryland
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Massachusetts
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Massachusetts
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMassachusetts_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Massachusetts
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMassachusetts_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Massachusetts
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMichigans_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Michigan
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMichigans_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Michigan
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMichigans_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Michigan
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMichigans_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Michigan
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMinnesota_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Minnesota
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMinnesota_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Minnesota
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMinnesota_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Minnesota
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPMinnesota_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Minnesota
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNewJersey_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP New Jersey
		Tab_Menu_Navigation.ccMenuNavigation("PIP NewJersey");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNewJersey_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP New Jersey
		Tab_Menu_Navigation.ccMenuNavigation("PIP NewJersey");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNewJersey_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP New Jersey
		Tab_Menu_Navigation.ccMenuNavigation("PIP NewJersey");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNewJersey_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP New Jersey
		Tab_Menu_Navigation.ccMenuNavigation("PIP NewJersey");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNewYork_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP New York
		Tab_Menu_Navigation.ccMenuNavigation("PIP NewYork");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNewYork_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP New York
		Tab_Menu_Navigation.ccMenuNavigation("PIP NewYork");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNewYork_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP New York
		Tab_Menu_Navigation.ccMenuNavigation("PIP NewYork");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNewYork_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP New York
		Tab_Menu_Navigation.ccMenuNavigation("PIP NewYork");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNorthDakota_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP North Dakota
		Tab_Menu_Navigation.ccMenuNavigation("PIP NorthDakota");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNorthDakota_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP North Dakota
		Tab_Menu_Navigation.ccMenuNavigation("PIP NorthDakota");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNorthDakota_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP North Dakota
		Tab_Menu_Navigation.ccMenuNavigation("PIP NorthDakota");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPNorthDakota_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP North Dakota
		Tab_Menu_Navigation.ccMenuNavigation("PIP NorthDakota");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPOregon_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Oregon
		Tab_Menu_Navigation.ccMenuNavigation("PIP Oregon");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPOregon_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Oregon
		Tab_Menu_Navigation.ccMenuNavigation("PIP Oregon");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPOregon_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Oregon
		Tab_Menu_Navigation.ccMenuNavigation("PIP Oregon");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPOregon_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Oregon
		Tab_Menu_Navigation.ccMenuNavigation("PIP Oregon");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPPennsylvania_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Pennsylvania
		Tab_Menu_Navigation.ccMenuNavigation("PIP Pennsylvania");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPPennsylvania_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Pennsylvania
		Tab_Menu_Navigation.ccMenuNavigation("PIP Pennsylvania");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPPennsylvania_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Pennsylvania
		Tab_Menu_Navigation.ccMenuNavigation("PIP Pennsylvania");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPPennsylvania_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Pennsylvania
		Tab_Menu_Navigation.ccMenuNavigation("PIP Pennsylvania");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPTexas_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Texas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Texas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPTexas_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Texas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Texas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPTexas_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Texas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Texas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPTexas_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Texas
		Tab_Menu_Navigation.ccMenuNavigation("PIP Texas");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPUtah_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Utah
		Tab_Menu_Navigation.ccMenuNavigation("PIP Utah");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPUtah_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Utah
		Tab_Menu_Navigation.ccMenuNavigation("PIP Utah");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPUtah_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Utah
		Tab_Menu_Navigation.ccMenuNavigation("PIP Utah");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPUtah_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Utah
		Tab_Menu_Navigation.ccMenuNavigation("PIP Utah");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPWashington_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Washington
		Tab_Menu_Navigation.ccMenuNavigation("PIP Washington");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPWashington_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Washington
		Tab_Menu_Navigation.ccMenuNavigation("PIP Washington");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPWashington_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Washington
		Tab_Menu_Navigation.ccMenuNavigation("PIP Washington");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PIPWashington_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to PIP Washington
		Tab_Menu_Navigation.ccMenuNavigation("PIP Washington");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.PIPClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PropertyProtectionInsurance_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to Property Protection
		// Insurance
		Tab_Menu_Navigation.ccMenuNavigation("Property Protection Insurance");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Property New Incident
		CC_ChooseCoverage.PropertyNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PropertyProtectionInsurance_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to Property Protection
		// Insurance
		Tab_Menu_Navigation.ccMenuNavigation("Property Protection Insurance");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Property New Incident
		CC_ChooseCoverage.PropertyNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PropertyProtectionInsurance_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to Property Protection
		// Insurance
		Tab_Menu_Navigation.ccMenuNavigation("Property Protection Insurance");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Property New Incident
		CC_ChooseCoverage.PropertyNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_PropertyProtectionInsurance_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> P-->Navigate to Property Protection
		// Insurance
		Tab_Menu_Navigation.ccMenuNavigation("Property Protection Insurance");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Property New Incident
		CC_ChooseCoverage.PropertyNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_RentalCarLossofUse_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> R-->Navigate to Rental Car Loss of Use
		Tab_Menu_Navigation.ccMenuNavigation("Rental Car Loss of Use");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Add Location
		CC_ChooseCoverage.Location();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_RentalCarLossofUse_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> R-->Navigate to Rental Car Loss of Use
		Tab_Menu_Navigation.ccMenuNavigation("Rental Car Loss of Use");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Add Location
		CC_ChooseCoverage.Location();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_RentalCarLossofUse_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> R-->Navigate to Rental Car Loss of Use
		Tab_Menu_Navigation.ccMenuNavigation("Rental Car Loss of Use");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Add Location
		CC_ChooseCoverage.Location();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_RentalCarLossofUse_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> R-->Navigate to Rental Car Loss of Use
		Tab_Menu_Navigation.ccMenuNavigation("Rental Car Loss of Use");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Add Location
		CC_ChooseCoverage.Location();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TapeDiscMedia_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> T-->Tape Disc Media
		Tab_Menu_Navigation.ccMenuNavigation("Tape Disc Media");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Update Button
		CC_ChooseCoverage.UpdateButton();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TapeDiscMedia_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> T-->Tape Disc Media
		Tab_Menu_Navigation.ccMenuNavigation("Tape Disc Media");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Update Button
		CC_ChooseCoverage.UpdateButton();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TapeDiscMedia_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> T-->Tape Disc Media
		Tab_Menu_Navigation.ccMenuNavigation("Tape Disc Media");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Update Button
		CC_ChooseCoverage.UpdateButton();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TapeDiscMedia_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type --> T-->Tape Disc Media
		Tab_Menu_Navigation.ccMenuNavigation("Tape Disc Media");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Update Button
		CC_ChooseCoverage.UpdateButton();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TowingandLabor_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage --->Vehicle Coverage --->Towing And Labor
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TowingandLabor_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage --->Vehicle Coverage --->Towing And Labor
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TowingandLabor_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage --->Vehicle Coverage --->Towing And Labor
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_TowingandLabor_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage --->Vehicle Coverage --->Towing And Labor
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UnderinsuredMotoristBodilyInjury_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type ---->U ----->Underinsured Motorist Bodily
		// Injury
		Tab_Menu_Navigation.ccMenuNavigation("Underinsured Motorist Bodily Injury");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UnderinsuredMotoristBodilyInjury_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type ---->U ----->Underinsured Motorist Bodily
		// Injury
		Tab_Menu_Navigation.ccMenuNavigation("Underinsured Motorist Bodily Injury");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UnderinsuredMotoristBodilyInjury_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type ---->U ----->Underinsured Motorist Bodily
		// Injury
		Tab_Menu_Navigation.ccMenuNavigation("Underinsured Motorist Bodily Injury");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UnderinsuredMotoristBodilyInjury_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage Type ---->U ----->Underinsured Motorist Bodily
		// Injury
		Tab_Menu_Navigation.ccMenuNavigation("Underinsured Motorist Bodily Injury");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage ---->Policy Level coverage--->Underinsured Motorist
		// - Property Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Underinsured Motorist - Property Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage ---->Policy Level coverage--->Underinsured Motorist
		// - Property Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Underinsured Motorist - Property Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage ---->Policy Level coverage--->Underinsured Motorist
		// - Property Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Underinsured Motorist - Property Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage ---->Policy Level coverage--->Underinsured Motorist
		// - Property Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Underinsured Motorist - Property Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage ---->Policy Level coverage---> Uninsured Motorist
		// Bodily Injury
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage ---->Policy Level coverage---> Uninsured Motorist
		// Bodily Injury
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UninsuredMotoristBodilyInjury_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage ---->Policy Level coverage---> Uninsured Motorist
		// Bodily Injury
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UninsuredMotoristBodilyInjury_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage ---->Policy Level coverage---> Uninsured Motorist
		// Bodily Injury
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		;

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Injury New Incident
		CC_ChooseCoverage.InjuryNewIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UninsuredMotoristPropertyDamage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage---->Policy Level coverage--->Uninsured Motorist
		// Property Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UninsuredMotoristPropertyDamage_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage---->Policy Level coverage--->Uninsured Motorist
		// Property Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UninsuredMotoristPropertyDamage_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage---->Policy Level coverage--->Uninsured Motorist
		// Property Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		;

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

	@Test
	public void AUT_UninsuredMotoristPropertyDamage_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// -----> Choose by Coverage---->Policy Level coverage--->Uninsured Motorist
		// Property Damage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");

		// ------> Validate New Exposure Header and Exposure Title
		CC_ChooseCoverage.NewExposureValidation();

		// ------> Select Claimant
		CC_ChooseCoverage.AllClaimant();

		// ------>Vehicle Edit Incident
		CC_ChooseCoverage.VehicleEditIncident();

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();

	}

}
