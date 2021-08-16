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

WebUI.comment('Step 5 and 6')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/ICSRs'), GlobalVariable.Timeout)

WebUI.comment('Step 7 and 8')

WebUI.click(findTestObject('HALO Front-End/Processes/ICSRs'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/ICSR processing'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Regression/ICSR processing'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Record Search'), ARGUS_ID)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Record search button'))

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/DSUR Line Listing/Argus Record', [('ID') : ARGUS_ID]), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/DSUR Line Listing/Argus Record', [('ID') : ARGUS_ID]))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.click(findTestObject('Test Cases/Initiating Workflow/Record Revision'))

WebUI.delay(GlobalVariable.Short_Delay)

Record_ID = WebUI.getText(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Master_Id'))

WebUI.click(findTestObject('Test Cases/User can see attachment from revision/Revision close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Textarea'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Add, Delete and Attachment/Textarea'), Comments)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Comp and forward'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

CustomKeywords.'HALO.Logout'()

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Pass)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/ICSRs'), GlobalVariable.Timeout)

WebUI.comment('Step 2')

WebUI.click(findTestObject('HALO Front-End/Processes/ICSRs'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/ICSR processing'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Regression/ICSR processing'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Record Search'), Record_ID)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Record search button'))

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/DSUR Line Listing/ICSR_RECORD', [('id') : Record_ID]), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/DSUR Line Listing/ICSR_RECORD', [('id') : Record_ID]))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/DSUR Line Listing/QC Check'))

WebUI.waitForElementVisible(findTestObject('Test Cases/DSUR Line Listing/QC Complete'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/DSUR Line Listing/QC Complete'))

WebUI.setText(findTestObject('Test Cases/DSUR Line Listing/QC Comment'), Comments)

WebUI.click(findTestObject('Test Cases/DSUR Line Listing/QC Approve'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

CustomKeywords.'HALO.Logout'()

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), GlobalVariable.HaloPass)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/ICSRs'), GlobalVariable.Timeout)

WebUI.comment('Step 2')

WebUI.click(findTestObject('HALO Front-End/Processes/ICSRs'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/ICSR processing'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Regression/ICSR processing'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Record Search'), Record_ID)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Record search button'))

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/DSUR Line Listing/ICSR_RECORD', [('id') : Record_ID]), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/DSUR Line Listing/ICSR_RECORD', [('id') : Record_ID]))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Test Cases/Common Elements_Reports/1st Completed Task'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Common Elements_Reports/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementClickable(findTestObject('Test Cases/Common Elements_Reports/1st Completed Task'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Common Elements_Reports/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the workflow is completed')

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Dashboards and reports'))

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'), GlobalVariable.Timeout)

WebUI.comment('Step 9 and 10')

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Test Cases/DSUR Line Listing/Tabular Reports'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/DSUR Line Listing/Tabular Reports'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the Tabular Reports page shall be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/DSUR Line Listing/All Records'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/DSUR Line Listing/All Records'))

WebUI.switchToFrame(findTestObject('Test Cases/Tabular Reports/Iframe(2)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/DSUR Line Listing/All Record search'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/DSUR Line Listing/All Record search'), Record_ID)

WebUI.click(findTestObject('Test Cases/DSUR Line Listing/All record button'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking all the columns in the Tabular reports with releated data.')

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Test Cases/DSUR Line Listing/Scroll Element'), GlobalVariable.Timeout)

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 11,12 and 13')

WebUI.click(findTestObject('Test Cases/Tabular Reports/Action'))

WebUI.waitForElementClickable(findTestObject('Test Cases/Tabular Reports/Download'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Tabular Reports/Download'))

WebUI.comment('Step 14 and 15')

WebUI.closeBrowser()

