 /*
 Title:- Password entered to be encrypted
 Owner:- Mitanshu Gupta
 Description:-  In this Test case we are checking the entered password must be encrypted..
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

WebUI.delay(GlobalVariable.Delay)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.comment('Step 2  :  This is a verifying step for checking Username entered shall be in human readable format.')

WebUI.takeFullPageScreenshot()

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), GlobalVariable.HaloPass)

WebUI.comment('Step 3 : This is a verifying step for checking Password entered shall be displayed as black dots.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 4')

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('HALO Front-End/My settings/Settings'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/Edit My Information'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('HALO Front-End/My settings/Edit My Information'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(14)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Password'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Password'), 'Randompassword')

WebUI.comment('This is a verifying step for checking the Password entered shall be displayed as black dots.')

WebUI.takeScreenshot()

WebUI.comment('Step 7 and 8 : N/A – S3 credentials descroped as part of HALO 2.2')

WebUI.comment('Step 9')

WebUI.closeBrowser()

