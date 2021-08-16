 /*
 Title:- INSIFE-HALOPV 3.0-CORE-Export-REG-OQ-423-40
 Owner:- Mitanshu Gupta
 Description:- In this Test case we are checking that we can generate the report in word format and download report in csv format.
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

WebUI.comment('Step 1')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/ICSRs'), GlobalVariable.Timeout)

WebUI.comment('Step 2')

WebUI.click(findTestObject('HALO Front-End/Processes/ICSRs'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/ICSR processing'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Regression/ICSR processing'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/Existing record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Regression/Existing record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Limit access of uploaded documents/Print'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Print'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Limit access of uploaded documents/Template'), Template, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Print button'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Thisi is a verifying step for checking teh report is genertated.')

WebUI.takeScreenshot()

WebUI.comment('Step 3')

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Return'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Regression/Workflow history'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/Actions'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Regression/Actions'))

WebUI.waitForElementClickable(findTestObject('Test Cases/Regression/Download'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Regression/Download'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Tabular Reports/Download button'))

WebUI.comment('This is a verifyinhg step for checking the CSV file is downloaded.')

WebUI.takeScreenshot()

WebUI.comment('Step 5')

WebUI.closeBrowser()

