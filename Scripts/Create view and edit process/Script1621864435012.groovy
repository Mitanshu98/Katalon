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

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form via Task option/old record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/old record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementPresent(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/Record info aka Basic information'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), 'Patient medical history')

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), 'Partner', false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Description'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/User subscribed to configured/Description'), 'Patient has a medical history of headache')

WebUI.setText(findTestObject('Test Cases/User subscribed to configured/Notes'), 'History of headache')

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementPresent(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Organizational Entity/Search button(Entity)'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Organizational Entity/Search Field'), 'Root organization')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Organizational Entity/Search button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Root'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Root'))

WebUI.delay(GlobalVariable.Delay)

//WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)
//WebUI.click(findTestObject('HALO Front-End/Common Elements/Organizational Entity/Search button(Country)'))
//WebUI.switchToDefaultContent()
//WebUI.delay(GlobalVariable.Delay)
//WebUI.setText(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search Field'), 'Denmark (DK)')
//WebUI.click(findTestObject('Test Cases/Assign user to group user/Orgentitiy/Search field-2'))
//WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Organizational Entity/country'), GlobalVariable.Timeout)
//WebUI.click(findTestObject('HALO Front-End/Common Elements/Organizational Entity/country'))
WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Organizational Entity/Save and Close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.takeFullPageScreenshot('Screenshot\\CVEP\\NewRecord.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.waitForElementClickable(findTestObject('Test Cases/Create view and edit process/Refresh record button'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Create view and edit process/Refresh record button'))

WebUI.delay(GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Test Cases/Create view and edit process/record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Create view and edit process/record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 2)

WebUI.waitForElementClickable(findTestObject('Test Cases/Access child form via Task option/Create SDEA Agreement'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Create SDEA Agreement'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Return'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form via Task option/2nd return'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form via Task option/2nd return'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.closeBrowser()

