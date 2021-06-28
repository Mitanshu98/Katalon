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

CustomKeywords.'HALO.HaloLogin'()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementPresent(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form via Task option/old record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/old record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementPresent(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Description'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/User subscribed to configured/Description'), Description)

WebUI.setText(findTestObject('Test Cases/User subscribed to configured/Notes'), Note)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementPresent(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Organizational Entity/Search button(Entity)'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Organizational Entity/Search Field'), 'Root organization')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Organizational Entity/Search button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Root'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Root'))

/*
WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Organizational Entity/Search button(Country)'))

WebUI.switchToDefaultContent()

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search Field'), 'Denmark (DK)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search field-2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Organizational Entity/country'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Organizational Entity/country'), FailureHandling.CONTINUE_ON_FAILURE)
*/
WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Create view and edit process/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\CVEP\\NewRecord.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.waitForElementClickable(findTestObject('Test Cases/Create view and edit process/Refresh record button'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Create view and edit process/Refresh record button'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementClickable(findTestObject('Test Cases/Create view and edit process/record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Create view and edit process/record', [('record') : NewRecord]))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

/*
WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)
*/
WebUI.waitForElementClickable(findTestObject('Test Cases/Access child form via Task option/Create SDEA Agreement'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Create SDEA Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Create view and edit process/Workflow'), workflow, false)

WebUI.setText(findTestObject('Test Cases/Create view and edit process/SDEA_title'), SEDA_title)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Create view and edit process/SDEA_Type'), Sdea_type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Create view and edit process/Create and return'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form via Task option/2nd return'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/2nd return'))

WebUI.switchToDefaultContent()

CustomKeywords.'HALO.Logout'()

WebUI.closeBrowser()

