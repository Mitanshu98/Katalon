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

WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Application management/Process workflows'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Process workflows'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Login user to login with one time link/Process Entities (Internal)'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Login user to login with one time link/Process Entities (Internal)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Login user to login with one time link/Edit Tasks'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Login user to login with one time link/Edit Tasks'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Test Cases/Login user to login with one time link/Create Update Entity'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Login user to login with one time link/Create Update Entity'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Login user to login with one time link/Create and Completion Notification'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Login user to login with one time link/Create and Completion Notification'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Login user to login with one time link/Type'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Login user to login with one time link/Type'), 'On Create', false, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Login user to login with one time link/Group'), 'Generic Organizational entity processing', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Test Cases/Login user to login with one time link/Message'), 'Link for the User {STANDARDLINK}', 
    FailureHandling.CONTINUE_ON_FAILURE)

