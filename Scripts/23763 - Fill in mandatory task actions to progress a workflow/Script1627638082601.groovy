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

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Data collection programs'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Data collection programs'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Data collection program'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verify step for checking the record page shall be opened.')

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Record Name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Access child form from other workflows/Record Name'), Title)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Access child form from other workflows/Record Type'), Type, false)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Description'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.setText(findTestObject('Test Cases/User subscribed to configured/Description'), Description)

WebUI.setText(findTestObject('Test Cases/User subscribed to configured/Notes'), Notes)

WebUI.delay(2)

WebUI.comment('This is a verifying step for checking the record shall be created.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.click(findTestObject('Test Cases/Initiating Workflow/Record Revision'))

WebUI.delay(2)

Record_Id = WebUI.getText(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Master_Id'))

WebUI.click(findTestObject('Test Cases/User can see attachment from revision/Revision close'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Data collection Program form'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Data collection Program form'))

WebUI.delay(2)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Data collection form(close)'))

WebUI.acceptAlert()

WebUI.comment('This is a verify step for checking the record shall be created.')

WebUI.delay(2)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

WebUI.comment('Step 7')

WebUI.refresh()

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Record Search'), Record_Id)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Record search button'))

WebUI.delay(2)

WebUI.comment('Step 8 : This is a verifying step for checking the record page shall be displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Fill In Mandatory/Record', [('record') : Record_Id]), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Record', [('record') : Record_Id]))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.delay(2)

WebUI.comment('Step 9,10,11,12 : This is a verifying step for checking the Warning shall be displayed in red for task action and Complete task button shall not be displayed until all mandatry fields are filled.')

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Data collection Program form'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Data collection Program form'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Test Cases/Fill In Mandatory/Program Objective'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Program Objective'), Objective)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/Start Date'), Start_date)

WebUI.setText(findTestObject('Test Cases/Fill In Mandatory/End Date (Expected)'), End_date)

WebUI.delay(2)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Save Data collection program'))

WebUI.delay(2)

WebUI.click(findTestObject('Test Cases/Fill In Mandatory/Data collection form(close)'))

WebUI.delay(2)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.delay(2)

WebUI.comment('Step 13 : This is a verifying step for checking the all the mandatory fields are filled up and complete task button is there now.')

WebUI.takeScreenshot()

WebUI.comment('Step 14')

WebUI.closeBrowser()

