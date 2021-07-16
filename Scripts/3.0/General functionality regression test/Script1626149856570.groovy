 /*
 Title:- INSIFE-HALOPV 3.0-CORE-Gen_fun_reg_test-REG-OQ-423-43
 Owner:- Mitanshu Gupta
 Description:- 3.0 : This test case will test browser compatibility with following functions.
		1.	Verify that it is possible to log into the application - both via single-sign-on and via normal login (username and password)
		2.	Verify that it is possible to create a new record
		3.	Verify that it is possible to open an existing record
		4.	Verify that it is possible to Complete the workflow on a record
		5.	Verify that it is possible to initiate the workflow on a completed record
		6.	Verify that it is possible to clone a record
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

CustomKeywords.'HALO.HaloMicrosoftLogin'()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Azure login'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Azure login'))

WebUI.comment('This is a verifying step for checking Application home page is displayed.')

WebUI.takeScreenshot()

WebUI.comment('Step 2')

CustomKeywords.'HALO.Logout'()

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), GlobalVariable.HaloPass)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Application home page is displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/ICSRs'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('HALO Front-End/Processes/ICSRs'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/ICSR processing'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Regression/ICSR processing'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking View/edit record form appears')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/Close ICSR'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Regression/Close ICSR'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/Exiting Record 2', [('ID') : Record]), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('Test Cases/Regression/Exiting Record 2', [('ID') : Record]))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking View/edit record form appears')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Record has completed the workflow')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Initiate Workflow'), GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Initiate Workflow'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Record is now in Register ICSR information workflow state.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Initiating Workflow/Clone Record'), GlobalVariable.Timeout)

WebUI.comment('Step 9')

WebUI.click(findTestObject('Test Cases/Initiating Workflow/Clone Record'))

WebUI.comment('This is a verify step for checking the clone record shall be created.')

WebUI.takeScreenshot()

WebUI.comment('Step 10')

WebUI.closeBrowser()

