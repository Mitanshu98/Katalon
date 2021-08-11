 /*
 Title:- Access to process records
 Owner:- Mitanshu Gupta
 Description:- 
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

WebUI.comment('Step 3,4, and 5')

CustomKeywords.'Access_to_process_records.Yes'()

WebUI.comment('Step 6')

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 7')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Process-Entities agreement management(internal)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/Access to process records/Old Record E2'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step where Fields shall be displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Close Record Scope'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Close Record Scope'))

//New step added
WebUI.waitForElementPresent(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

//
WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

WebUI.comment('Step 9,10,11 and 12')

CustomKeywords.'Access_to_process_records.No'()

WebUI.comment('Step 13')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Process-Entities agreement management(internal)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 14')

WebUI.click(findTestObject('Test Cases/Access to process records/Old Record E1'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step where fields shall not be displayed')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Close Record Scope'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Close Record Scope'))

//New step added
WebUI.waitForElementPresent(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

//
WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

WebUI.comment('Step 15,16 and 17')

CustomKeywords.'Access_to_process_records.Yes'()

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 18')

WebUI.click(findTestObject('HALO Front-End/Processes/Product Management'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Clinical studies/Product Management/Product management'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 19')

WebUI.click(findTestObject('Test Cases/Access to process records/Clinical studies/Product Management/old record product'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Search button'))

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Search Field'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Access to process records/Organisation Entity/Search Field'), 'Another organization')

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Organisation entity'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), GlobalVariable.Timeout)

WebUI.comment('This is verify step where new record is created')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Close Record Scope'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Close Record Scope'))

//New step added
WebUI.waitForElementPresent(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

//
WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Save Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Save Record'))

WebUI.comment('Step 20')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

WebUI.comment('Step 21')

WebUI.click(findTestObject('HALO Front-End/Processes/Clinical projects studies'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Clinical studies/Clinical Studies'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Clinical studies/Clinical Studies'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 22')

WebUI.click(findTestObject('Test Cases/Access to process records/Clinical studies/Clinical old record'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Clinical_title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), clinical_type, false, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementClickable(findTestObject('Test Cases/Access to process records/Clinical studies/menu'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Clinical studies/menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Search button'))

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Search Field'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Access to process records/Organisation Entity/Search Field'), 'Another organizatoin')

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Organisation entity'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), GlobalVariable.Timeout)

WebUI.comment('This is a verify step where record 3 will be created')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Close Record Scope'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Close Record Scope'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Save Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Save Record'))

WebUI.comment('Step 23')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

WebUI.comment('Step 24')

// Step -1.24
WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 25')

WebUI.click(findTestObject('Test Cases/Entities and agreements/Process-Entities agreement management(internal)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 26')

WebUI.click(findTestObject('Test Cases/Access to process records/Old Record E3'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.comment('This is a verify step where the fields are displayed')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Product and compound'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Product and compound'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 27 : This is a verify step where <Record3>  shall not be displayed')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Study'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 28: Step 27 : This is a verify step where Record2  shall be displayed')

WebUI.takeScreenshot()

WebUI.comment('Step 29,30 and 31')

WebUI.closeBrowser()

