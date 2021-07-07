 /*
 Title:- Drill down page includes process records/workflow tasks for user with at least read only privileges
 Owner:- Mitanshu Gupta
 Description:- In this Test case we are accessing Dashboard- Drill down page with Read only Access.
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

WebUI.comment('Step 1,2 and 3')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 4 and 5')

WebUI.click(findTestObject('Test Cases/Drill down Page includes process/Generic organizational Entity Processing'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user groups to users with read only attribute/Read only'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user groups to users with read only attribute/Read only'))

WebUI.comment('This is a verify step for checking Read only checkbox shall be checked.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Drill down Page includes process/Update Subscription'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Dashboards and reports/Dashboards and reports'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Dashboards and reports'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Dashboards and reports/Dashboards'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Dashboards'))

WebUI.comment('This is a verify step for checking Dashboard page shall be displayed')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Dashboards and reports/Process Dashboard'), GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Process Dashboard'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Long_Delay)

WebUI.comment('This is a verifying step for checking Dashboard drill-down page shall be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Dashboards and reports/Pie-chart'), GlobalVariable.Timeout)

WebUI.comment('Step 8 and 9')

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Pie-chart'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the Task from workflow andUnique record ID shall be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 10')

CustomKeywords.'HALO.Updatereadonly'()

WebUI.closeBrowser()

