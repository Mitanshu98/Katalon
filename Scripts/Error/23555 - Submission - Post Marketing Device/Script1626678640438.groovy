 /*
 Title:- Whom and When (Case Handling - Post Marketing device)
 Owner:- Mitanshu Gupta
 Description:- In this test case we are creating a record in ICSR Reprting requiremnts with Submission - Post marketing Devie.
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

//***********************************************STEP 1:**************************************************
//Open the browser and enter application url
WebUI.comment('Step 1 and 2')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verifying step for checking the roles of the user')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Requirement Intelligence'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Requirement Intelligence'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Common Elements/Whom and When'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Whom and When'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementPresent(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking ICSR requirements details form shall be displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Whom and When/Country/Country'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Whom and When/Country/Country'))

WebUI.switchToDefaultContent()

WebUI.delay(GlobalVariable.Delay)

WebUI.setText(findTestObject('Test Cases/Reports/Whom and When/Country/Search field 0'), 'Denmark (DK)')

WebUI.click(findTestObject('Test Cases/Reports/Whom and When/Country/Search field'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Whom and When/Country/Search'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Whom and When/Country/Search'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Is submission of expedieted report'))

WebUI.delay(2)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Domestic'))

WebUI.delay(2)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Foreign'))

WebUI.delay(2)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Reporting Criteria/Public health threat'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Reporting Criteria/Serious detoration'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Reporting Criteria/Non - Serious'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Listedness'), 'Local datasheet', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Listed'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Unlisted'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Initial'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Follow-up'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/Whom and When/Reporting Criteria/Submissin report'), 'CIOMS', 
    false)

WebUI.comment('This is a verifying step for checking ICSR Requirements details form will be saved.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Test Cases/Reports/Whom and When/Implementation Details'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Whom and When/Submission'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Submission'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.comment('This is a verifying step for checking ICSR Requirements details form will be saved.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Save form'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot()

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Whom and When/Return ICSR requirement'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Whom and When/Return ICSR requirement'))

WebUI.comment('Step 7')

CustomKeywords.'whom_and_when.Whom.Complete_workflow'()

WebUI.comment('Step 8,9,10,11 And 12')

CustomKeywords.'whom_and_when.Whom.Table'()

WebUI.comment('This is a verifying step for checking Tabular reports page shal be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Whom and When/Report/Submission - Post marketing device'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Whom and When/Report/Submission - Post marketing device'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('Test Cases/Reports/Tabular Reports/Iframe(2)'), GlobalVariable.Timeout)

WebUI.comment('This is a verifying step for checking data elements discribe in action column shall be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Test Cases/Reports/Whom and When/scroll/Sub_post_1'), GlobalVariable.Timeout)

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Test Cases/Reports/Whom and When/scroll/Sub_post_2'), GlobalVariable.Timeout)

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 13,14,15,16 and 17')

CustomKeywords.'whom_and_when.Whom.download'()

WebUI.comment('Step 18')

WebUI.closeBrowser()

