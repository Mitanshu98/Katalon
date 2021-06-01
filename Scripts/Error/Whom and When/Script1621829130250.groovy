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
WebUI.openBrowser('www.google.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://halodemo.insife.cloud:8080/ords/f?p=100:LOGIN_DESKTOP:250404183592:::::', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

//Enter email id in textbox for microsoft login
WebUI.setText(findTestObject('Microsoft and HALO login/Microsoft login/Enter_email'), GlobalVariable.Email, FailureHandling.CONTINUE_ON_FAILURE)

//Click on next button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Next button'), FailureHandling.CONTINUE_ON_FAILURE)

//Enter password encrypted
WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/Microsoft login/Password'), 'ZSBpLB3nxxkXHvLg/VAeWg==', 
    FailureHandling.CONTINUE_ON_FAILURE)

//Click signin button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/SignIn'), FailureHandling.CONTINUE_ON_FAILURE)

//wait for authentication
WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//Check checkbox for stay signed in
WebUI.check(findTestObject('Microsoft and HALO login/Microsoft login/Checkbox stay signed in'), FailureHandling.CONTINUE_ON_FAILURE)

//Click Yes button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Stay signed in YES'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

//*******************************************STEP 2:*******************************************************
//Login and Verify user subscriptions and the Organization of the user
WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), 'r0Zc9uoGivFWnlDK9UxeLSw1+U/R0MIL', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/My settings/My settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/My settings/My roles'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Requirement Intelligence'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Processes/Requirement Intelligence'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Common Elements/Whom and When'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Whom and When'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Whom and When/Old recrod'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Whom and When/Old recrod'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), 'Test case through Automation', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), 'Post-marketing - Device', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/Periodic form'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Whom and When/Country/Country'), GlobalVariable.Timeout)
//WebUI.setText(findTestObject('Test Cases/Reports/Whom and When/Country/Country'), 'Denmark (DK)', FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Whom and When/Country/Search field'), GlobalVariable.Timeout)
//WebUI.click(findTestObject('Test Cases/Reports/Whom and When/Country/Search field'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Whom and When/Country/Search'), GlobalVariable.Timeout)
//WebUI.click(findTestObject('Test Cases/Reports/Whom and When/Country/Search'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.delay(GlobalVariable.Delay)
WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Is submission of expedieted report'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Domestic'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Foreign'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/Whom and When/Submissin report'), 'CIOMS', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Casuality/realated-realated'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Casuality/Related-unrelated'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Casuality/Unknown-unrelated'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Casuality/Unknown-realated'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Casuality/Unrealated-realated'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Casuality/unrelated-unrelated'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Listedness'), 'Local datasheet', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Listed'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Unlisted'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Initial'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Follow-up'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Test Cases/Reports/Whom and When/Listednesss/Medically confirmed'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Save form'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/Return Form'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Return Form'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToDefaultContent(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Dashboards and reports'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Requirements Dropdown'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Requirements Dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/Whom and When'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Whom and When'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Test Cases/Reports/Tabular Reports/Iframe(2)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Download'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/CSV'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/CSV'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Cancel Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToDefaultContent(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'), GlobalVariable.Timeout, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.Delay, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

