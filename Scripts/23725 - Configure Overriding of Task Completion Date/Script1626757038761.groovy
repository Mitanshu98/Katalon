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

WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Process workflows'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Process workflows'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure Overriding of task Completion Date/Process Entities External'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Process Entities External'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Assign Electronic signature/Edit Tasks'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Assign Electronic signature/Edit Tasks'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure Overriding of task Completion Date/Old task'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Old task'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure Overriding of task Completion Date/Task Title'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Configure Overriding of task Completion Date/Task Title'), 'Lock Record')

//WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Create Final'))
WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('Step 6 and 7')

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Advanced'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure Overriding of task Completion Date/Force Routing notes on task Completion'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Force Routing notes on task Completion'))

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Allow user data override'))

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Lock releated Process record'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the user shall be able to configure override of task completion date.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Save task'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure Overriding of task Completion Date/Create Task Closed'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Create Task Closed'))

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 9')

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Old record'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/Old record'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'), GlobalVariable.Timeout)

WebUI.comment('Step 10')

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Textarea'), GlobalVariable.Timeout)

WebUI.comment('Step 11')

WebUI.setText(findTestObject('Test Cases/Add, Delete and Attachment/Textarea'), Rou_Comments)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Comp and forward'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the  set task completion date manually field shall be displayed.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure Overriding of task Completion Date/Set task Completion Date'), 
    GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Configure Overriding of task Completion Date/Set task Completion Date'), Comp_date)

WebUI.click(findTestObject('Test Cases/Configure Overriding of task Completion Date/Comp And Workflow'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.click(findTestObject('Test Cases/Regression/Workflow history'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the  set task completion date manually field shall be displayed.This is a verify step for checking the users shall be able to override the task completion date when completing a task.')

WebUI.takeScreenshot()

WebUI.comment('Step 12')

WebUI.closeBrowser()

