 /*
 Title:- Nullify and Reactivate records
 Owner:- Mitanshu Gupta
 Description:- In this test case we are creating a record, Nullify it and Reactivate it.
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

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verify step for checking the record page shall be opened.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the record shall be created and saved.')

WebUI.takeScreenshot()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Nullify or deactivate record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record Nullification'), 
    GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record Nullification'), Comment)

WebUI.comment('This is a verifying step for checking the change workflow page will open.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Save confirm'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 9 : This is a verifying step for checking View/Edit process record page shall be displayed.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.click(findTestObject('Test Cases/Initiating Workflow/Record Revision'))

WebUI.delay(2)

Record_Id = WebUI.getText(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Master_Id'))

WebUI.click(findTestObject('Test Cases/User can see attachment from revision/Revision close'))

WebUI.comment('Step 10')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Create view and edit process/Refresh record button'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Create view and edit process/Refresh record button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Include Nullified Record'), 
    GlobalVariable.Timeout)

WebUI.comment('Step 11')

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Include Nullified Record'))

WebUI.comment('This is a verifying step for checking Nullified records shall be displayed with Active task status as Nullified.')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Record Search'), Record_Id)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Record search button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Fill In Mandatory/Record search button'), GlobalVariable.Timeout)

WebUI.comment('Step 12')

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record', [('nullify') : title]))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verifying step for checking that the record is nullified and for Re-activate we have initiate the workflow.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Initiate Workflow'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Initiate Workflow'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking record is reactivated.')

WebUI.takeScreenshot()

WebUI.comment('Step 15')

WebUI.closeBrowser()

