 /*
 Title:- Limit access of upload document
 Owner:- Mitanshu Gupta
 Description:- Updated the Document Template, Create new record in Product family management and in Entities and agreement(External) and Print the report in format.
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

WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Limit access of uploaded documents/Document Template'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Document Template'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Limit access of uploaded documents/Document template(Pencil)'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Document template(Pencil)'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Limit access of uploaded documents/Process mapping'), GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Limit access of uploaded documents/Process mapping'), 'Entities and agreements', 
    false)

WebUI.delay(GlobalVariable.Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Limit access of uploaded documents/Workflow Mapping'), 'Entities management (External)', 
    false)

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Save'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step where the Document template shall be updated.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Cancel'))

WebUI.switchToDefaultContent()

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Product Management'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('HALO Front-End/Processes/Product Management'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Limit access of uploaded documents/Product Family management'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Product Family management'))

WebUI.waitForElementVisible(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.click(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Common Elements_Reports/Record info aka Basic information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Common Elements_Reports/Record info aka Basic information'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Common Elements_Reports/Title'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Common Elements_Reports/Title'), Title)

WebUI.delay(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Timeout)

WebUI.comment('This is a verifying step where the new record shall be created.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Limit access of uploaded documents/Print'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Print'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Template'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step where the Document template shall not be present.')

WebUI.takeScreenshot()

WebUI.comment('Step 9')

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Return'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'), 
    GlobalVariable.Timeout)

WebUI.comment('Step 10')

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Common Elements_Reports/Record info aka Basic information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Common Elements_Reports/Record info aka Basic information'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Common Elements_Reports/Title'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Common Elements_Reports/Title'), Title_e)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type_e, false)

WebUI.delay(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Limit access of uploaded documents/Print'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Print'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 11')

WebUI.selectOptionByLabel(findTestObject('Test Cases/Limit access of uploaded documents/Template'), 'ICSR', false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Limit access of uploaded documents/Print button'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step where the document shall be printed with the data in it.')

WebUI.takeScreenshot()

WebUI.comment('Step 12')

WebUI.closeBrowser()

