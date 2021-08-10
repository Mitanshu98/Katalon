 /*
 Title:- Login using valid username and password
 Owner:- Mitanshu Gupta
 Description:- In this Test case the user is Logging in Halo through the valid username and password.
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

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

WebUI.comment('Step 2 ')

//*******************************************STEP 2:*******************************************************
//Login and Verify user subscriptions and the Organization of the user
WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), Username)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Password)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step where user can\'t login through wrong password')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 3')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), GlobalVariable.HaloPass)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step where the user can login in the Halo environment')

WebUI.takeScreenshot()

WebUI.comment('Step 4')

WebUI.closeBrowser()

