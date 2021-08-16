 /*
Title:- Non-expedited reporting requirements overview  DSUR Periodic Reporting rules (Report ID 200)
Owner:- Mitanshu Gupta
Description:- In this test case we are creating a record in DSUR Periodic reporting rules and complete the workflow and then checking the fields of DSUR Periodic reporting rules in the Tabular reports.
Environment:- HALO 3.0(https://halocodebase.insife.cloud:8080/ords/f?p=100)
*/ import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

//Script starts from here:-
//This is a custom keywords which stores the script till the login to halo environment.
WebUI.comment('Step 1 and 2')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Requirement Intelligence'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Requirement Intelligence'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Common Elements_Reports/DSUR'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Common Elements_Reports/DSUR'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.comment('Step 5')

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementPresent(findTestObject('Test Cases/Common Elements_Reports/Record info aka Basic information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Common Elements_Reports/Record info aka Basic information'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the DSUR Periodic requirements forms page shall be displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Test Cases/PSUR Periodic reporting rules/Periodic form'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('Test Cases/PSUR Periodic reporting rules/Periodic form'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/DSUR/Country'), GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/DSUR/Country'), Country, false)

WebUI.check(findTestObject('Test Cases/DSUR/Are DSUR Required'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/DSUR/Is there a local guidance'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/DSUR/Is there a local guidance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/DSUR/Guidance to be followed'), Guidance, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/DSUR/Reporting Language'), Language, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/DSUR/Timeline btw DLP'), DLP_Submission, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/DSUR/When they are required'), When_required, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Common Elements_Reports/Save form'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot()

WebUI.waitForElementClickable(findTestObject('Test Cases/Periodic device report rules/Return Form'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Periodic device report rules/Return Form'))

WebUI.comment('Step 7,8 and 9')

CustomKeywords.'reports.Record'()

WebUI.comment('This is a verify step for checking the Tabular reports shall be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Tabular Reports/DSUR'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Tabular Reports/DSUR'))

WebUI.comment('Step 10,11,12,13,14 and 15')

CustomKeywords.'reports.DSUR_Download'()

WebUI.comment('Step 16')

WebUI.closeBrowser()

