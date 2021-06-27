/*
 Title:- Country KPI dashboard support drill down of to show individual records
 Owner:- Mitanshu Gupta
 Description:- Here in this test case we are accessing the Drill down page in Organizational KPI Dashboard.
 Environment:- HALO 3.0(https://halocodebase.insife.cloud:8080/ords/f?p=100)
*/


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

WebUI.comment('Step 1 and 2')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Dashboards and reports/Dashboards and reports'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Dashboards and reports'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Dashboards and reports/Dashboards'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Dashboards'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Dashboards and reports/Organizational entity KPI dashboard'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Organizational entity KPI dashboard'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the Organizational Entity dashboard shall be display')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Dashboards and reports/75'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/75'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the Drill down page shall be display.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 5')

WebUI.closeBrowser()

