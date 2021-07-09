/*
 Title:- Passwords must synchronize automatically between system and apex
 Owner:- Mitanshu Gupta
 Description:- Here in this test case we are updating the Halo password and checking that password is sync or not with Apex Environment.
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

WebUI.comment('Step 1 and 2')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/My settings/Settings'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/Edit My Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/Edit My Information'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(14)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Password'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Password'), Password)

WebUI.click(findTestObject('Test Cases/Password Rules/Update on Save'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking user can update the Password.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Password Rules/Save'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Password Rules/Close'))

WebUI.switchToDefaultContent()

CustomKeywords.'HALO.Logout'()

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Password)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Enter current password'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter current password'), Password)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter new password'), Password)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Confirm'), Password)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the prompt to change the password shall be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Test Cases/Assign user to group user/Apply Changes'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Password)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the user is login in the HALO account.')

WebUI.takeScreenshot()

WebUI.comment('Step 6')

WebUI.navigateToUrl(ApexUrl)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Password Rules/Workspace'), GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.setText(findTestObject('Test Cases/Password Rules/Workspace'), workspace)

WebUI.setText(findTestObject('Test Cases/Password Rules/Username'), GlobalVariable.Email)

WebUI.setText(findTestObject('Test Cases/Password Rules/Password'), Password)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Password Rules/Sign In'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the User is Login in Apex Environment.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 8')

WebUI.closeBrowser()

