 /*
 Title:- User Admin group must able to assign groups to other users
 Owner:- Mitanshu Gupta
 Description:- In this Test case we are verifying that the without user admin role Testuser can not assign role to the other user.
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

CustomKeywords.'HALO.HaloMicrosoftLogin'()

CustomKeywords.'HALO.HaloUserLogin'(User_Name, Password)

WebUI.comment('Step 3 : This is a verify step for checking that User administration  option shall not be present to navigate to the users list as the user admin role is not there for the user')

WebUI.takeScreenshot()

CustomKeywords.'HALO.Logout'()

WebUI.comment('Step 4')

WebUI.comment('This is a verifying step for checking the roles of the admin user')

CustomKeywords.'HALO.HaloUserLogin'(GlobalVariable.Email, Password)

WebUI.comment('Step 5')

WebUI.click(findTestObject('HALO Front-End/User administration/User administration'))

WebUI.click(findTestObject('HALO Front-End/User administration/Users'))

WebUI.waitForElementVisible(findTestObject('Test Cases/User can see attachment from revision/Test User'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/User can see attachment from revision/Test User', [('user') : User_id]))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Setup roles'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Roles/Add role'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Add role'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Roles/Search'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Search'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search Field'), 'User admin')

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search field-2'))

WebUI.waitForElementVisible(findTestObject('Test Cases/User can see attachment from revision/user admin'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/User can see attachment from revision/user admin'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementClickable(findTestObject('Test Cases/Assign user to group user/Roles/Setup subscription'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Setup subscription'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking User admin role shall be subscribed to the user.')

WebUI.takeScreenshot()

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 6')

CustomKeywords.'HALO.Logout'()

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User_Name)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Password)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.click(findTestObject('HALO Front-End/User administration/User administration'))

WebUI.waitForElementClickable(findTestObject('HALO Front-End/User administration/Users'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/User administration/Users'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Test Cases/Assign user to group user/Create new user'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Create new user'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/User Login'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/User Login'), new_user)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Password'), Password)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search Field'), 'Root organization')

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search field-2'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Root'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Root'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Create'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the new user shall be created.')

WebUI.takeScreenshot()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Setup roles'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking User Admin group must be able to assign groups to other users.')

WebUI.takeScreenshot()

WebUI.comment('Step 9')

WebUI.closeBrowser()

