 /*
 Title:- Non-expedited reporting requirements overview -  Periodic Device report rules (Report ID 200)
 Owner:- Mitanshu Gupta
 Description:- In this test case we are creating a record in Periodic device report rules and complete the workflow and then checking the fields of Periodic device report rules in the Tabular reports.
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

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Requirement Intelligence'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Requirement Intelligence'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Common Elements/Periodic reporting requirement for medical devices record'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Periodic reporting requirement for medical devices record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 5')

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

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the  Medical device periodic reporting requirements form page shall be displayed')

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.check(findTestObject('Test Cases/Reports/Periodic device report rules/periodic report required'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Periodic device report rules/Devices under investigation'), 
    GlobalVariable.Timeout)

WebUI.check(findTestObject('Test Cases/Reports/Periodic device report rules/Devices under investigation'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Periodic device report rules/Devices under investigation'), 
    GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Reports/Periodic device report rules/Format(Clinical)'), Format, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay)

WebUI.check(findTestObject('Test Cases/Reports/Periodic device report rules/Frequency(clinical)'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Save form'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the Periodic device report rules form shall be displayed')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Periodic device report rules/Return Form'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Periodic device report rules/Return Form'))

WebUI.comment('Step 7,8 and 9')

CustomKeywords.'reports.Record'()

WebUI.comment('This is a verify step for checking the Tabular reports shall be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/Periodic device report rules'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Periodic device report rules'))

WebUI.comment('Step 10,11,12,13,14 and 15')

CustomKeywords.'reports.Report_Download'()

WebUI.comment('Step 16')

CustomKeywords.'HALO.Logout'()

WebUI.closeBrowser()

