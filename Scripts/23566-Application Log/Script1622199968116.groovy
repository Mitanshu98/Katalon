 /*
Title:- Application Log
Owner:- Mitanshu Gupta
Description:- In this Test case the user is checking the the application log of the user with diffrent ways of logging.
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

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Application management/Application management'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/Automation log(BOT)'), 
    GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/Automation log(BOT)'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 5 : This is a verify step that is verifying the Columns are displayed with the errors processed during automation workflow task.')

WebUI.takeScreenshot()

WebUI.comment('Step 6')

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/General application log'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/General application log'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 7:olumns shall be displayed with relevant data.')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('HALO Front-End/Application management/Application Log/general application'), GlobalVariable.Timeout)

WebUI.takeScreenshot()

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 8: This is a verify step where columns shall be displayed with relevant data. ')

WebUI.takeScreenshot()

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.comment('Step 9')

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/Scheduled Jobs'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/Scheduled Jobs'))

WebUI.comment('Step 10: This is a verify step where Status of backend job shall be displayed in the columns.')

WebUI.delay(GlobalVariable.Delay)

WebUI.takeScreenshot()

WebUI.comment('Step 11')

CustomKeywords.'HALO.Logout'()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

'Entering the wrong password according to The Test case\r\n\r\n'
WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Invalid_pass)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 12')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), GlobalVariable.HaloPass)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 13')

CustomKeywords.'HALO.Logout'()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Azure login'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 14')

WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/System Access Log'), GlobalVariable.Timeout)

WebUI.comment('Step 15')

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/System Access Log'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeScreenshot()

WebUI.comment('Step 16')

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/Audit Log'), GlobalVariable.Timeout)

WebUI.comment('Step 17')

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/Audit Log'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeScreenshot()

WebUI.comment('Step 18')

WebUI.closeBrowser()

