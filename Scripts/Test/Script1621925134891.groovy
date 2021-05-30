//Title:- Non-expedited reporting requirements overview  DSUR Periodic Reporting rules (Report ID 200)
//Owner:- Mitanshu Gupta
//Description:-
//Environment:- HALO 3.0(https://halocodebase.insife.cloud:8080/ords/f?p=100)

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


//Script starts from here:-
//This is a custom keywords which stores the script till the login to halo environment.
CustomKeywords.'HALO.HaloLogin'()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Requirement Intelligence'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Requirement Intelligence'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Common Elements/DSUR'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/DSUR'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/DSUR/old record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/DSUR/old record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

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

WebUI.takeFullPageScreenshot('Screenshot\\Reports\\DSUR\\New_Record.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\Reports\\DSUR\\New_Record.jpg')

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/DSUR/Country'), GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/DSUR/Country'), Country, false)

WebUI.check(findTestObject('Test Cases/Reports/DSUR/Are DSUR Required'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/DSUR/Is there a local guidance'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/DSUR/Is there a local guidance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/DSUR/Guidance to be followed'), Guidance, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/DSUR/Reporting Language'), Language, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/DSUR/Timeline btw DLP'), DLP_Submission, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/DSUR/When they are required'), When_required, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Save form'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\Reports\\DSUR\\DSUR_Form.jpg')

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Periodic device report rules/Return Form'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Periodic device report rules/Return Form'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

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

WebUI.takeFullPageScreenshot('Screenshot\\Reports\\DSUR\\Workflow_Completed.jpg')

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Dashboards and reports'))

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Requirements Dropdown'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Requirements Dropdown'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\Reports\\DSUR\\Tabular_Reports.jpg')

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/DSUR'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/DSUR'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\Reports\\DSUR\\Halo_Reports.jpg')

WebUI.switchToFrame(findTestObject('Test Cases/Reports/Tabular Reports/Iframe(2)'), 2)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Action'))

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Download'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/CSV'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/CSV'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download button'))

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Cancel Button'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToDefaultContent()

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.closeBrowser()

