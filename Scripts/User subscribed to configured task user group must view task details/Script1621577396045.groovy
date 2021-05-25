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

//***********************************************STEP 1:**************************************************
//Open the browser and enter application url
WebUI.openBrowser('https://halocodebase.insife.cloud:8080/ords/f?p=100')

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.maximizeWindow()

//Enter email id in textbox for microsoft login
WebUI.setText(findTestObject('Microsoft and HALO login/Microsoft login/Enter_email'), GlobalVariable.Email)

//Click on next button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Next button'))

//Enter password encrypted
WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/Microsoft login/Password'), GlobalVariable.UserPass)

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
WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User1)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), User1)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My settings'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My roles'))

WebUI.delay(GlobalVariable.Delay)

'First test user role screenshot\t'
WebUI.takeFullPageScreenshot('Screenshot\\User subscribed\\USERROLE1.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User2)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), User2)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My settings'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My roles'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\User subscribed\\USERROLE2.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User3)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), User3)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My settings'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My roles'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\User subscribed\\USERROLE3.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User1)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), User1)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Product Management'))

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Product management'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/User subscribed to configured/Product management'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Products old record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/User subscribed to configured/Products old record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

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

WebUI.takeFullPageScreenshot('Screenshot\\User subscribed\\RECORD1.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User3)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), User3)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\User subscribed\\RECORD2.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User2)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), User2)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Product Management'))

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Product management'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/User subscribed to configured/Product management'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.takeFullPageScreenshot('Screenshot\\User subscribed\\RECORD3.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.closeBrowser()

