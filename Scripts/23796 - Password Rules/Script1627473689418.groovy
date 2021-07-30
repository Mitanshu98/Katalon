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

WebUI.comment('This is a verifying step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/User administration/User administration'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/User administration/User administration'))

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/User administration/Users'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/Search_User'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/create and modify light users/Search_User'), User)

WebUI.click(findTestObject('Test Cases/create and modify light users/Search_Button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Pencil'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Assign user to group user/Pencil'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verifying step for checking the User information page shall be displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Password'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Password'), Password)

WebUI.click(findTestObject('Test Cases/Password Rules/Update on Save'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking user can update the Password.')

WebUI.click(findTestObject('Test Cases/Password Rules/Save'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Password Rules/Close'))

WebUI.switchToDefaultContent()

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the User list page shall be displayed.')

WebUI.takeScreenshot()

WebUI.comment('Step 6')

CustomKeywords.'HALO.Logout'()

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Password)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Enter current password'), GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter current password'), Password)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter new password'), Password_1)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Confirm'), Password_1)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Apply Changes'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Error pop up message shall be displayed with message "password contains a prohibited simple word"')

WebUI.takeScreenshot()

WebUI.comment('Step 9')

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter current password'), Password)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter new password'), Password_2)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Confirm'), Password_2)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Apply Changes'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Error pop up message shall be displayed with message "password must contain at least one punctuation character (!"#$%&()``*+,-/:;<=>?_)"')

WebUI.takeScreenshot()

WebUI.comment('Step 10')

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter current password'), Password)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter new password'), Password_3)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Confirm'), Password_3)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Apply Changes'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 11')

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking HALO login page shall be dipalyed.')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Password_3)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking HALO home page shall be opened.')

WebUI.takeScreenshot()

WebUI.comment('Step 12')

WebUI.closeBrowser()

