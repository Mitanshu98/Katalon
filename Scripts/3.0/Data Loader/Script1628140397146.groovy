/*
 Title:- Data Loader
 Owner:- Mitanshu Gupta
 Description:- Loading the data in Halo and verifying the data in Findings column and update the category & subcategory of the excel file.
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

WebUI.comment('Step 1,2 and 3')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a step for verifying the rles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 4')

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Data Loader'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Data Loader'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Select Mapping template'), GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Data Loader/Select Mapping template'), 'CAPA Findings', false)

WebUI.uploadFileWithDragAndDrop(findTestObject('Test Cases/Data Loader/Upload File'), Excel_Data)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the file shall be selected.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Upload File Button'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Data Loader/Upload File Button'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

if (WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Click To Refresh'), GlobalVariable.Timeout)) {
    WebUI.click(findTestObject('Test Cases/Data Loader/Click To Refresh'))
}

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Load Data into Halo'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('Test Cases/Data Loader/Load Data into Halo'))

WebUI.switchToDefaultContent()

WebUI.waitForElementPresent(findTestObject('Test Cases/Data Loader/OK'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Data Loader/OK'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

if (WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Click To Refresh'), GlobalVariable.Timeout)) {
    WebUI.click(findTestObject('Test Cases/Data Loader/Click To Refresh'))
}

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure Overriding of task Completion Date/Create Task Closed'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Create Task Closed'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 7')

WebUI.click(findTestObject('HALO Front-End/Processes/Quality Management'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Findings CAPA'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Findings CAPA'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the records shall be dislayed')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/CAPA_Record'), GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/Data Loader/CAPA_Record'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Findings Details Form'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Data Loader/Findings Details Form'))

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.click(findTestObject('Test Cases/Data Loader/CAPA Releated Details'))

WebUI.comment('Step 9')

WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/CAPA Summary'), GlobalVariable.Timeout)

Halo_Summary = WebUI.getText(findTestObject('Test Cases/Data Loader/CAPA Summary'))

Excel_Summary = findTestData('Test').getValue(11, 1)

WebUI.comment('This is a verifying step for checking the data from Excel file is same as in the Halo record. Halo_Summary is data from HALO record and Excel_Summary is data from Excel file')

WebUI.comment(Halo_Summary)

WebUI.comment(Excel_Summary)

WebUI.comment('Step 10 : The below step will make changes in the category and subcategory column of Excel sheet.')

CustomKeywords.'excel.Export.demoKey'(Excel_Error_Data)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Create Task Closed'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Data Loader'), GlobalVariable.Timeout)

WebUI.comment('Step 11')

WebUI.click(findTestObject('HALO Front-End/Processes/Data Loader'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Select Mapping template'), GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Data Loader/Select Mapping template'), 'CAPA Findings', false)

WebUI.uploadFileWithDragAndDrop(findTestObject('Test Cases/Data Loader/Upload File'), Excel_Error_Data)

WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Upload File Button'), GlobalVariable.Timeout)

WebUI.comment('Step 12')

WebUI.click(findTestObject('Test Cases/Data Loader/Upload File Button'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

if (WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Click To Refresh'), GlobalVariable.Timeout)) {
    WebUI.click(findTestObject('Test Cases/Data Loader/Click To Refresh'))
}

WebUI.comment('This is a verifying step for checking Load/ Reconcile data page will be open')

WebUI.takeScreenshot()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Data Loader/Load Data into Halo'), GlobalVariable.Timeout)

WebUI.comment('Step 13')

WebUI.click(findTestObject('Test Cases/Data Loader/Load Data into Halo'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Records shall not be loaded and error')

WebUI.takeScreenshot()

WebUI.comment('Step 14')

WebUI.closeBrowser()

