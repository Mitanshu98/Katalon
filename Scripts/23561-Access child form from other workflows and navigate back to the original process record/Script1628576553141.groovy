 /*
 Title:- Access child form from other workflows and navigate back to the original process record
 Owner:- Mitanshu Gupta
 Description:- In this test case we are accessing the child form from other workflows and navigate back to Data collection record.
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

WebUI.comment('This is a verifying step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Data collection programs'), GlobalVariable.Timeout)

WebUI.comment('Step 3,4 and 5')

WebUI.click(findTestObject('HALO Front-End/Processes/Data collection programs'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Data collection program'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Data collection program'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Fill In Mandatory/Record Search'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Record Search'), Record_ID)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Record search button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Old record', [('record') : Record_ID]), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Old record', [('record') : Record_ID]))

/*
WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Record Name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Access child form from other workflows/Record Name'), Title)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Access child form from other workflows/Record Type'), Type, false)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create'))
*/
WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Data collection Program form'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Data collection Program form'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Fill In Mandatory/Program Objective'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Program Objective'), objective)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Start Date'), Start_date)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/End Date (Expected)'), End_Date)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/External Parties/External Parties'), 
    GlobalVariable.Timeout)

WebUI.comment('Step 6 and 7')

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/External Parties'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/External Parties/Partner-Button'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Partner-Button'))

WebUI.switchToDefaultContent()

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

/*
WebUI.setText(findTestObject('Test Cases/Access child form from other workflows/External Parties/Search-Field'), 'Denmark (DK)', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Search-button'), FailureHandling.CONTINUE_ON_FAILURE)
*/
WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/External Parties/Partner'), 
    GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Partner'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Access child form from other workflows/External Parties/SDEA(Active only)'), 
    'Peters Agreement', false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Add to Program'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/External Parties/External Parties'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/External Parties'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking External party shall be added.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Open-Partner'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Record shall be opened in a workflow Entities/Agreements form.')

WebUI.takeScreenshot()

WebUI.comment('Step 8 and 9')

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/1st-Return'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Data collection program details form shall be displayed.')

WebUI.takeScreenshot()

WebUI.comment('Step 10')

WebUI.closeBrowser()

