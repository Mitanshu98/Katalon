 /*
 Title:- Schedule new process Record
 Owner:- Mitanshu Gupta
 Description:- Here in this test case we are Creating a record through Scheduler.
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
import groovy.time.TimeCategory as TimeCategory

WebUI.comment('Step 1 and 2')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Scheduler'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Scheduler'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Create new Schedule'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Create new Schedule'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Schedule Name'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.setText(findTestObject('Test Cases/Schedule new process record/Schedule Name'), Title)

//Here we are taking the current Date
today = new Date()

Start_Date = today.format('yyyy-MM-dd')

WebUI.setText(findTestObject('Test Cases/Schedule new process record/Schedule start'), Start_Date)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Process Workflow'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Schedule new records'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Schedule new records'))

WebUI.selectOptionByLabel(findTestObject('Test Cases/Schedule new process record/Schedule Core Process'), 'Entities and Agreements Module', 
    false)

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Schedule new process record/Workflow to trigger'), 'Entities Management (External)', 
    false)

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Schedule new process record/Organizational Entity'), 'Root organization', 
    false)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Create'))

WebUI.delay(10)

WebUI.comment('Step 5')

Schedule_Id = WebUI.getText(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Schedule Configuration Id'))

WebUI.click(findTestObject('Test Cases/Schedule new process record/Activate_Update_schedule'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Cancel'))

WebUI.switchToDefaultContent()

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Show', [('show') : Schedule_Id]), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('Test Cases/Schedule new process record/Show', [('show') : Schedule_Id]))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verify step for checking One record matching the schedule shall be shown:Workflow: Entities management (External)')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Run Scheduler'), GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.click(findTestObject('Test Cases/Schedule new process record/Run Scheduler'))

WebUI.delay(10)

WebUI.comment('This is a verify step for checking the instance shall be created successfully (Task and Process record columns are populated with a new ID of the task and process record) and the Processed column shall be populated with a timestamp')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/OK'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/OK'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/New_Record'), GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/Schedule new process record/New_Record', [('Task') : Title]))

WebUI.comment('This is a verify step for View/Edit process record page shall be opened.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 9')

WebUI.closeBrowser()

