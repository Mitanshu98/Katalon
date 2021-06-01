/*
 Title:- Menu for accessing main page
 Owner:- Mitanshu Gupta
 Description:- In this Test case the user is verifying the Process page shall be there.
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

WebUI.comment('Step 1 and 2')

CustomKeywords.'HALO.HaloLogin'()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.comment('Step 3 : All the process shall be displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.comment('Step 4: Process page shall be opened.')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeScreenshot()

WebUI.click(findTestObject('HALO Front-End/Common Elements/HALOPV'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 5: Home page shall be displayed.')

WebUI.takeScreenshot()

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 6')

CustomKeywords.'HALO.Logout'()

WebUI.closeBrowser()

