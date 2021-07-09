 /*
 Title:- Configure record with basic task scheduler page
 Owner:- Mitanshu Gupta
 Description:- In this Test case we are creating a record in data collection program and Configure properties of scheduled process record with basic task scheduler page.
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

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Data collection programs'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Data collection programs'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure properties of schedued process/Reconciliation'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Reconciliation'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Record Name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Access child form from other workflows/Record Name'), Title)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verify step for checking the record is created and Under task activities setup reconciliation schedule shall be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure properties of schedued process/Setup Reconciliation Schedule'), 
    GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Setup Reconciliation Schedule'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure properties of schedued process/Schedule Name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Configure properties of schedued process/Schedule Name'), Schedule_Title)

WebUI.setText(findTestObject('Test Cases/Configure properties of schedued process/Schedule Start'), Start)

WebUI.setText(findTestObject('Test Cases/Configure properties of schedued process/Schedule End'), End)

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Repeat'))

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Yearly'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the Task Scheduler page is filled up.This is a verifying step for checking the Task Scheduler page is filled up.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Create'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the record shall be scheduled with basic scheduler option.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Delete'))

WebUI.comment('Step 5')

WebUI.closeBrowser()

