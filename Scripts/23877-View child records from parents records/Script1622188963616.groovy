 /*
 Title:- View child Records from parent record
 Owner:- Mitanshu Gupta
 Description:- Here in this test case we are creating a child record and view through parent record.
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

WebUI.comment('Step 2')

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.waitForElementPresent(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step-5')

WebUI.waitForElementVisible(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.waitForElementPresent(findTestObject('Test Cases/Navigate from child record to parent record/Associated child'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Associated child'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Navigate from child record to parent record/Add child record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Add child record'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Core process'), 
    GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Core process'), 
    Core_Process, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Workflow'), 
    Workflow, false)

WebUI.setText(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Title'), Title)

WebUI.delay(GlobalVariable.Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Type'), Type, 
    false)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Organizational Entity'), 
    Organizational_entity, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Create and Return'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Associated child'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a Verification step to check the Related record are there in the record')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 7')

WebUI.closeBrowser()

