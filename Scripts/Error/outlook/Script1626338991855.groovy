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

WebUI.click(findTestObject('Object Repository/HALO Front-End/Application management/Application management'))

WebUI.waitForElementVisible(findTestObject('Object Repository/HALO Front-End/Application management/Process workflows'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Object Repository/HALO Front-End/Application management/Process workflows'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Test Cases/Login user to login with one time link/Process Entities (Internal)'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Object Repository/Test Cases/Login user to login with one time link/Process Entities (Internal)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('Object Repository/HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Object Repository/Test Cases/Login user to login with one time link/Edit Tasks'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Object Repository/Test Cases/Login user to login with one time link/Edit Tasks'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Test Cases/Login user to login with one time link/Create Update Entity'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Object Repository/Test Cases/Login user to login with one time link/Create Update Entity'))

WebUI.click(findTestObject('Object Repository/Page_Workflows/span_Creation- and Completion notifications'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Object Repository/Page_Workflows/td_Routeback_R86745126998172990_ig_grid_vc_cur'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Workflows/select_Backend-jobOn CompleteOn Create'), '1', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Workflows/td_Aggregate Report ApprovalAggregate Repor_6ab4a0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Workflows/select_Aggregate Report ApprovalAggregate R_afec85'), 
    '1341', true)

WebUI.doubleClick(findTestObject('Object Repository/Page_Workflows/body_Task informationAdvancedActionsKPIsNot_13fa12'))

WebUI.setText(findTestObject('Object Repository/Page_Workflows/textarea_concat(id(, , C86872805475767555, _813b41'), 'Hi from Automation')

WebUI.click(findTestObject('Object Repository/Page_Workflows/div_'))

