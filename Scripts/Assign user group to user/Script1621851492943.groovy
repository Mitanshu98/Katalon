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

WebUI.openBrowser('www.google.com')

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.navigateToUrl('https://halodemo.insife.cloud:8080/ords/f?p=100:LOGIN_DESKTOP:250404183592:::::')

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.maximizeWindow()

//Enter email id in textbox for microsoft login
WebUI.setText(findTestObject('Microsoft and HALO login/Microsoft login/Enter_email'), GlobalVariable.Email)

//Click on next button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Next button'))

//Enter password encrypted
WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/Microsoft login/Password'), 'ZSBpLB3nxxkXHvLg/VAeWg==')

//Click signin button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/SignIn'))

//wait for authentication
WebUI.waitForPageLoad(GlobalVariable.Timeout)

//Check checkbox for stay signed in
WebUI.check(findTestObject('Microsoft and HALO login/Microsoft login/Checkbox stay signed in'))

//Click Yes button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Stay signed in YES'))

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

//*******************************************STEP 2:*******************************************************
//Login and Verify user subscriptions and the Organization of the user
WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), 'r0Zc9uoGivFWnlDK9UxeLSw1+U/R0MIL')

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My settings'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My roles'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/User administration/User administration'))

WebUI.waitForElementClickable(findTestObject('HALO Front-End/User administration/Users'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/User administration/Users'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Test Cases/Assign user to group user/Create new user'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Create new user'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/User Login'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/User Login'), 'Automate')

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Password'), 'MsjdgMj@#22332jhd-=bsn')

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search Field'), 'Root organization')

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search field-2'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Root'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Root'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Create'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Test Cases/Assign user to group user/Close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

//WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Pencil'), GlobalVariable.Timeout)
//WebUI.click(findTestObject('Test Cases/Assign user to group user/Pencil'))
//WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)
//WebUI.delay(GlobalVariable.Delay)
//WebUI.waitForPageLoad(GlobalVariable.Timeout)
//WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Roles/Setup roles'), GlobalVariable.Timeout)
//WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Setup roles'))
//WebUI.waitForPageLoad(GlobalVariable.Timeout)
//WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Roles/Add role'), GlobalVariable.Timeout)
//WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Add role'))
//WebUI.waitForPageLoad(GlobalVariable.Timeout)
//WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Roles/Search'), GlobalVariable.Timeout)
//WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/Search'))
//WebUI.delay(GlobalVariable.Delay)
//WebUI.switchToDefaultContent()
//WebUI.setText(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search Field'), 'Generic Organizational entity processing')
//WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search field-2'))
//WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Roles/searchfiled'), GlobalVariable.Timeout)
//WebUI.click(findTestObject('Test Cases/Assign user to group user/Roles/searchfiled'))
//WebUI.delay(GlobalVariable.Delay)
//WebUI.takeFullPageScreenshot()
//WebUI.switchToDefaultContent()
//WebUI.click(findTestObject('Test Cases/Assign user to group user/Close'))
WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), 'Automate')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), 'MsjdgMj@#22332jhd-=bsn')

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Enter current password'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter current password'), 'MsjdgMj@#22332jhd-=bsn')

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Enter new password'), 'MsjdgMj@#22332jhd-=bsn')

WebUI.setText(findTestObject('Test Cases/Assign user to group user/Confirm'), 'MsjdgMj@#22332jhd-=bsn')

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Apply Changes'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), 'Automate')

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), 'r0Zc9uoGivFWnlDK9UxeLSw1+U/R0MIL')

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\Assign user group to user\\New user Login.jpg')

WebUI.closeBrowser()

