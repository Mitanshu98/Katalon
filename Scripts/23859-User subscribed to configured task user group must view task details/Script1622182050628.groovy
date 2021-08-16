 /*
Title:- User subscribed to configured task user group must view task details
Owner:- Mitanshu Gupta
Description:- Here in this test case we have 3 diffrent users with diffrent roles. We are creating a record in product management through 1st user and see that record from other user.
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

//Script starts from here:-
CustomKeywords.'HALO.HaloMicrosoftLogin'()

WebUI.comment('Step 1,2 and 3')

CustomKeywords.'HALO.HaloUserLogin'(User1, User1)

CustomKeywords.'HALO.Logout'()

WebUI.comment('Step 4 and 5')

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

CustomKeywords.'HALO.HaloUserLogin'(User2, User2)

CustomKeywords.'HALO.Logout'()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 6 and 7')

CustomKeywords.'HALO.HaloUserLogin'(User3, User3)

CustomKeywords.'HALO.Logout'()

WebUI.comment('Step 8')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User1)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), User1)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 9')

WebUI.click(findTestObject('HALO Front-End/Processes/Product Management'))

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Product management'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/User subscribed to configured/Product management'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 10')

WebUI.waitForElementVisible(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.comment('Step 11')

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Description'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/User subscribed to configured/Description'), Description)

WebUI.setText(findTestObject('Test Cases/User subscribed to configured/Notes'), Notes)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Save'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a Verification step to check the record is created by user 1')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.comment('Step 12')

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

CustomKeywords.'HALO.Logout'()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 13 and 14')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User3)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), User3)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a Verification step to check the record created by Test user 1 can\'t be accesed by user 2.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 15')

CustomKeywords.'HALO.Logout'()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 16')

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User2)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), User2)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 17')

WebUI.click(findTestObject('HALO Front-End/Processes/Product Management'))

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Product management'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/User subscribed to configured/Product management'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a Verification step to check the record created by Test user 1 can be accesed by user 3.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 18')

CustomKeywords.'HALO.Logout'()

WebUI.closeBrowser()

