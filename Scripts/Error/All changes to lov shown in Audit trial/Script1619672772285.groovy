import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//***********************************************STEP 1:**************************************************
//Open the browser and enter application url
//Open the browser and enter application url
CustomKeywords.'HALO.HaloLogin'()

//********************************************STEP 3:**********************************************************
WebUI.click(findTestObject('Object Repository/HALO Front-End/Application management/Application management'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Application management/List value metadata (expert)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/List value metadata (expert)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Search Box Metadata'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Search Box Metadata'), 'Test Metadata')

//********************************************STEP 4:***********************************************************
WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/search button Metadata'))

WebUI.delay(2)

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Edit_Agreement location'))

//********************************************STEP 5:***********************************************************
WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Step5/NUMVAL2 T6'), 'REGIONS', 
    false)

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Step5/Save'))

WebUI.waitForPageLoad(Timeout)

//********************************************STEP 6:************************************************************
WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Audit log button'))

WebUI.delay(GlobalVariable.Delay)

//*********************************************STEP 8************************************************************
WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Step8/Close page'))

WebUI.waitForPageLoad(Timeout)

//obj taken from step4
WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Edit_Agreement location'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), Timeout)

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Step8/Delete btn'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Step8/DeleteOK btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Audit log button'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Audit log button'))

