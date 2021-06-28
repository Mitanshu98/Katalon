 /*
Title:- Lock User Account
Owner:- Mitanshu Gupta
Description:- Here in this test case we are lock the Halo user for not accessing the HALO environment.
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

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/User administration/User administration'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/User administration/Users'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/User administration/Users'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/User administration/Pencil', [('user') : Test]))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.comment('Step 4')

WebUI.waitForElementVisible(findTestObject('HALO Front-End/User administration/Lock User(Yes)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/User administration/Lock User(Yes)'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the user is locked.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Entities and agreements/Save'))

WebUI.click(findTestObject('HALO Front-End/User administration/Close'))

CustomKeywords.'HALO.Logout'()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Userpassword)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the user can\'t login into the HALO Environment.')

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

