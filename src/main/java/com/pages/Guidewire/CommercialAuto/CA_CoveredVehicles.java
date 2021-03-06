package com.pages.Guidewire.CommercialAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CA_CoveredVehicles extends SeleniumWebDriver_Commands {

	public CA_CoveredVehicles(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		
	}
private static By CoveredVehiclesHeader = By.xpath("//div[contains(@id,'CoveredAutoSymbolsScreen-ttlBar')]//div[@role='heading']");
private static By EditCoveredVehicleButton = By.xpath("//div[contains(@id,'EditAutoSymbols')]//div[@role='button']");
private static By CoveredAutosHeader = By.xpath("//div[contains(@id,'CoveredAutoSymbolsLV')]//div[@role='heading']");


public static void CoveredVehicles() throws Throwable {
	
	try {
		
		GuidewireAutomate_Validation("Covered Vehicles Header", CoveredVehiclesHeader, "equals", "Covered Vehicles");
		GuidewireAutomate_Validation("Covered Autos Header", CoveredAutosHeader, "equals", "Covered Autos");
		
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}
public static void EditCoveredVehicles() throws Throwable {
	
	try {
		
		GuidewireAutomate("Edit Covered Vehicles", EditCoveredVehicleButton, "clickAndwait", "clickAndwait");
		
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}
	
	
	
}
