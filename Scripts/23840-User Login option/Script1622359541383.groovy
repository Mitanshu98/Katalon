/*
 Title:- User login option
 Owner:- Mitanshu Gupta
 Description:- In this Test case the user is checking the diffrent ways of logging into the Halo envirnment.s
 Environment:- HALO 3.0(https://halocodebase.insife.cloud:8080/ords/f?p=100)
 */
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

WebUI.comment('Step 1')

CustomKeywords.'HALO.HaloMicrosoftLogin'()

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

WebUI.comment('Step 2')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), GlobalVariable.HaloPass)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeScreenshot()

WebUI.comment('Step 3')

CustomKeywords.'HALO.Logout'()

WebUI.waitForPageLoad(GlobalVariable.Delay)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Azure login'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 4 : This is a verify step where HALO home page shall be opened thrugh Azure login.')

WebUI.takeScreenshot()

WebUI.comment('Step 5')

CustomKeywords.'HALO.Logout'()

WebUI.closeBrowser()

