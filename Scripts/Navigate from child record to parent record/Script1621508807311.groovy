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

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementPresent(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Navigate from child record to parent record/Old Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Old Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.waitForElementPresent(findTestObject('Test Cases/Navigate from child record to parent record/Associated child'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Associated child'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Navigate from child record to parent record/Add child record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Add child record'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Core process'), 
    GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Core process'), 'Entities and agreements', 
    false)

WebUI.delay(GlobalVariable.Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Workflow'), 'Entities management (External)', 
    false)

WebUI.setText(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Title'), 'Automation Testing')

WebUI.selectOptionByLabel(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Type'), 'Committee', 
    false)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Organizational Entity'), 
    'Root organization', false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Child record/Create and open'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Associated child'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Navigate from child record to parent record/Go to parent record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Navigate from child record to parent record/Go to parent record'))

