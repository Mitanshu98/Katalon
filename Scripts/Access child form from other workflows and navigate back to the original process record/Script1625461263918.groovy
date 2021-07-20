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

WebUI.comment('')

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Data collection programs'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Data collection programs'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Data collection program'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Data collection program'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Record Name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Access child form from other workflows/Record Name'), Title)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Access child form from other workflows/Record Type'), Type, false)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Data collection Program form'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Data collection Program form'))

WebUI.switchToDefaultContent()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Yes'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Yes'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/External Parties/External Parties'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/External Parties'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/External Parties/Partner-Button'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Partner-Button'))

WebUI.switchToDefaultContent()

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

/*
WebUI.setText(findTestObject('Test Cases/Access child form from other workflows/External Parties/Search-Field'), 'Denmark (DK)', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Search-button'), FailureHandling.CONTINUE_ON_FAILURE)
*/
WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/External Parties/Partner'), 
    GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Partner'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Access child form from other workflows/External Parties/SDEA(Active only)'), 
    'Peters Agreement', false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Add to Program'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/External Parties/External Parties'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/External Parties'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/Open-Partner'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/External Parties/1st-Return'))

WebUI.closeBrowser()

