/*
 Title:- Organizational entity overview - Distributors (Report ID 307)
 Owner:- Mitanshu Gupta
 Description:- In this test case we are creating a record in Entity and agreements(internal) and complete the workflow and then checking the fields of Entities and agreement(internal) in the Tabular reports.
 Environment:- HALO 3.0(https://halocodebase.insife.cloud:8080/ords/f?p=100)
 */

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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.comment('Step 1 and 2')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 3 and 4')

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Process-Entities agreement management(internal)'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Process-Entities agreement management(internal)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementPresent(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the record is created.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the workflow is completed')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToDefaultContent()

WebUI.comment('Step 6 and 7')

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Dashboards and reports'))

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Entities Dropdown'), GlobalVariable.Timeout)

WebUI.comment('Step 8,9,10,11 and 12')

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Entities Dropdown'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the Tabular reports are there.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/Organizatinal Entitiy'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Organizatinal Entitiy'))

CustomKeywords.'reports.Report_Download'()

WebUI.comment('Step 13')

CustomKeywords.'HALO.Logout'()

WebUI.closeBrowser()

