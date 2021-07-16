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

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/User administration/User administration'))

WebUI.waitForElementClickable(findTestObject('HALO Front-End/User administration/Users'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/User administration/Users'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Test Cases/Assign user to group user/Create new user'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Create new user'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/User Login'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/User Login'), 'nhvnmb')

WebUI.delay(GlobalVariable.Delay)

WebUI.setText(findTestObject('Test Cases/Notification/User_Name'), 'Mitanshu test')

WebUI.selectOptionByLabel(findTestObject('Test Cases/Notification/User_Type'), 'Light user', false)

WebUI.delay(0)

WebUI.click(findTestObject('Test Cases/Notification/Contact Details'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Notification/Input_email'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Notification/Input_email'), 'mitanshu.gupta@insife.com')

WebUI.delay(0)

WebUI.click(findTestObject('Test Cases/Notification/Notification and workflow'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Notification/Email_ Notification'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Notification/Email_ Notification'))

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Setup roles'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Roles/Add role'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Add role'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Roles/Search'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Search'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search Field'), 'Generic Organizational entity processing')

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search field-2'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Roles/searchfiled'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/searchfiled'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementClickable(findTestObject('Test Cases/Assign user to group user/Roles/Setup subscription'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Setup subscription'))

WebUI.comment('This is a verify step for checking the subscription of the created user.')
