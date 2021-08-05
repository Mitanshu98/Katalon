 /*
 Title:- Non-expedited reporting requirements overview Periodic SUSAR reporting requirements (Report ID 200)
 Owner:- Mitanshu Gupta
 Description:- In this test case we are creating a record in SUSAR and complete the workflow and then checking the fields of SUSAR in the Tabular reports.
 Environment:- HALO 3.0(https://halocodebase.insife.cloud:8080/ords/f?p=100)
 */ import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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

WebUI.takeScreenshot()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.comment('Step 3')

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Requirement Intelligence'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Requirement Intelligence'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Common Elements/SUSAR'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/SUSAR'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

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

WebUI.comment('Step 5')

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the record is created.')

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/SUSAR/Country'), Country, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.check(findTestObject('Test Cases/Reports/SUSAR/Is perioic SUSAR required'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Save form'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the SUSAR form shall be displayed')

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/Return Form'), GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Return Form'))

WebUI.comment('Step 8 and 9')

CustomKeywords.'reports.Record'()

WebUI.comment('This is a verify step for checking the Tabular reports shall be displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/SUSAR'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/SUSAR'))

WebUI.comment('Step 11,12,13 and 15')

CustomKeywords.'reports.Report_Download'()

WebUI.comment('Step 16')

WebUI.closeBrowser()

