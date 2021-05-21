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

WebUI.waitForPageLoad(Timeout)

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(Timeout)

WebUI.maximizeWindow()

//Store email id in a string variable
String emailid = 'mitanshu.gupta@insife.com'

//Enter email id in textbox for microsoft login
WebUI.setText(findTestObject('Microsoft and HALO login/Microsoft login/Enter_email'), emailid)

//Click on next button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Next button'))

//Enter password encrypted
WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/Microsoft login/Password'), 'ZSBpLB3nxxkXHvLg/VAeWg==')

//Click signin button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/SignIn'))

//wait for authentication
WebUI.waitForPageLoad(Timeout)

//Check checkbox for stay signed in
WebUI.check(findTestObject('Microsoft and HALO login/Microsoft login/Checkbox stay signed in'))

//Click Yes button
WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Stay signed in YES'))

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), Timeout)

//*******************************************STEP 2:*******************************************************
//Login and Verify user subscriptions and the Organization of the user
WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), emailid)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), 'r0Zc9uoGivFWnlDK9UxeLSw1+U/R0MIL')

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My settings'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My roles'))

WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Process workflows'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Process workflows'))

WebUI.waitForPageLoad(Timeout)

WebUI.setText(findTestObject('Test Cases/Assign Electronic signature/Search Box'), 'Entities')

WebUI.click(findTestObject('Test Cases/Assign Electronic signature/Search Button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'), 
    Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'))

WebUI.waitForPageLoad(Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 1)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Advanced Settings'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Advanced Settings'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Product and compound Yes'), Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Product and compound Yes'))

WebUI.click(findTestObject('Test Cases/Access to process records/Include territory Yes'))

WebUI.click(findTestObject('Test Cases/Access to process records/Include study Yes'))

WebUI.click(findTestObject('Test Cases/Access to process records/Include organizational study Yes'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Save'))

WebUI.delay(shortdelay)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Close'))

WebUI.switchToDefaultContent()

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.delay(shortdelay)

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Process-Entities agreement management(internal)'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Old record'))

WebUI.waitForPageLoad(Timeout)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), 1)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Close Record Scope'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Close Record Scope'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Record Close'))

WebUI.switchToDefaultContent()

// Step 1.9 
WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Process workflows'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Process workflows'))

WebUI.waitForPageLoad(Timeout)

WebUI.setText(findTestObject('Test Cases/Assign Electronic signature/Search Box'), 'Entities')

WebUI.click(findTestObject('Test Cases/Assign Electronic signature/Search Button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'), 
    Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'))

WebUI.waitForPageLoad(Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 1)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Advanced Settings'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Advanced Settings'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Product and compound No'), Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Product and compound No'))

WebUI.click(findTestObject('Test Cases/Access to process records/Include Territory No'))

WebUI.click(findTestObject('Test Cases/Access to process records/Include Study No'))

WebUI.click(findTestObject('Test Cases/Access to process records/Include organizationalstudy No'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Save'))

WebUI.delay(shortdelay)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Close'))

WebUI.switchToDefaultContent()

WebUI.waitForPageLoad(Timeout)

WebUI.delay(shortdelay)

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Process-Entities agreement management(internal)'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Old record'))

WebUI.waitForPageLoad(Timeout)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), 1)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Close Record Scope'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Close Record Scope'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Record Close'))

WebUI.switchToDefaultContent()

//Step  1.15
WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Process workflows'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Process workflows'))

WebUI.waitForPageLoad(Timeout)

WebUI.setText(findTestObject('Test Cases/Assign Electronic signature/Search Box'), 'Entities')

WebUI.click(findTestObject('Test Cases/Assign Electronic signature/Search Button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'), 
    Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'))

WebUI.waitForPageLoad(Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 1)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Advanced Settings'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Advanced Settings'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Product and compound Yes'), Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Product and compound Yes'))

WebUI.click(findTestObject('Test Cases/Access to process records/Include territory Yes'))

WebUI.click(findTestObject('Test Cases/Access to process records/Include study Yes'))

WebUI.click(findTestObject('Test Cases/Access to process records/Include organizational study Yes'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Save'))

WebUI.delay(shortdelay)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Close'))

WebUI.switchToDefaultContent()

WebUI.waitForPageLoad(Timeout)

WebUI.delay(shortdelay)

WebUI.click(findTestObject('HALO Front-End/Processes/Product Management'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Clinical studies/Product Management/Product management'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Clinical studies/Product Management/old record product'))

WebUI.waitForPageLoad(Timeout)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), 1)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Search button'))

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Search Field'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Access to process records/Organisation Entity/Search Field'), 'Another organizatoin')

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Organisation entity'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), 2)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Close Record Scope'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Close Record Scope'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Save Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Save Record'))

WebUI.click(findTestObject('Test Cases/Access to process records/Record Close'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('HALO Front-End/Processes/Clinical projects studies'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Clinical studies/Clinical Studies'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Clinical studies/Clinical Studies'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Clinical studies/Clinical old record'))

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), 'Automation Testing')

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Search button'))

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Search Field'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Access to process records/Organisation Entity/Search Field'), 'Another organizatoin')

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Organisation entity'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), 2)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Close Record Scope'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Close Record Scope'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Save Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Save Record'))

WebUI.click(findTestObject('Test Cases/Access to process records/Record Close'))

WebUI.switchToDefaultContent()

// Step -1.24
WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Process-Entities agreement management(internal)'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Old record'))

WebUI.waitForPageLoad(Timeout)

WebUI.switchToFrame(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/2ndiframe'), 1)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Record scope'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Organisation Entity/Product and compound'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Product and compound'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Access to process records/Organisation Entity/Study'))

WebUI.delay(GlobalVariable.Delay)

WebUI.closeBrowser()

