 /*
 Title:- Completed Task
 Owner:- Mitanshu Gupta
 Description:- In this Test case the user is checking the Completed Task in the My task window.
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

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/My tasks'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/My tasks'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementClickable(findTestObject('Test Cases/Completed tasks/Show'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Completed tasks/Show'))

WebUI.scrollToElement(findTestObject('Test Cases/Completed tasks/Completed Tasks'), GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the completed task of the user')

WebUI.takeScreenshot()

WebUI.comment('Step 5')

CustomKeywords.'HALO.Logout'()

WebUI.closeBrowser()

