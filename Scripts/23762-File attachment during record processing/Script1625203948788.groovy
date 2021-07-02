 /*
 Title:- Add/delete attachment
 Owner:- Mitanshu Gupta
 Description:- Add Delete Attachment.
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

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

/*
WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Test Cases/File attachment during record Processing/Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/File attachment during record Processing/Record', [('recordname') : Record]))

WebUI.comment('This is a verify step for checking the record page shall be there.')

WebUI.takeFullPageScreenshot()

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)
*/
WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.comment('This is a verify step the record shall be opened.')

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/Test Cases/Add, Delete and Attachment/Attachment button'), 
    GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Attachment button'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Upload file'), GlobalVariable.Timeout)

WebUI.uploadFileWithDragAndDrop(findTestObject('Test Cases/Add, Delete and Attachment/Upload file'), Location)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Upload Button'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the file is uploaded.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Upload Return'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.closeBrowser()

