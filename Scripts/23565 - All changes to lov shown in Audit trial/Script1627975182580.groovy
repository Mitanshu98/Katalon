 /*
 Title:- All changes to LOVs shown in audit trial
 Owner:- Mitanshu Gupta
 Description:- In this test case we are checking the Audit Page for List value metadata(Expert) using the Test Metadata.
 Environment:- HALO 3.0(https://halocodebase.insife.cloud:8080/ords/f?p=100)
 */ import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

WebUI.comment('Step 1 and 2')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verifying Step for checking the roles of the User.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 3')

WebUI.click(findTestObject('Object Repository/HALO Front-End/Application management/Application management'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Application management/List value metadata (expert)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/List value metadata (expert)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Search Box Metadata'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Search Box Metadata'), 'Test Metadata')

//********************************************STEP 4:***********************************************************
WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/search button Metadata'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Test Metadata'))

//********************************************STEP 5:***********************************************************
WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.selectOptionByLabel(findTestObject('Test Cases/All changes to LOVs shown in audit trial/NUMVAL2 T6'), 'REGIONS', false)

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.comment('This is a verifying step for checking the LOV shall be updated.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Save'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

//********************************************STEP 6:************************************************************
WebUI.switchToDefaultContent()

WebUI.comment('Step 6 and 7')

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Audit log button'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.comment('This is a verifying step for checking Audit log shall display the updated fields and value.')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Remaining Fields'), GlobalVariable.Timeout)

WebUI.takeScreenshot()

WebUI.switchToDefaultContent()

//*********************************************STEP 8************************************************************
WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Close page'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

//obj taken from step4
WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Test Metadata'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Delete btn'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/DeleteOK btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking list Value Metadata page shall be displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Audit log button'), GlobalVariable.Timeout)

WebUI.comment('Step 9, 10 and 11')

WebUI.click(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Audit log button'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Audit log shall display the updated fields and value.')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Test Cases/All changes to LOVs shown in audit trial/Remaining Fields'), GlobalVariable.Timeout)

WebUI.takeScreenshot()

WebUI.closeBrowser()

