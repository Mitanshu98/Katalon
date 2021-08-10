 /*
 Title:- Schedule of records workflows with two diffrent pages.
 Owner:- Mitanshu Gupta
 Description:- Here in this test case we are Creating a record through Scheduler and creating record through Data reconcillation.
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

today = new Date()

Start_Date = today.format('yyyy-MM-dd')

WebUI.comment('Step 4')

WebUI.setText(findTestObject('Test Cases/Schedule new process record/Schedule Name'), Title)

WebUI.setText(findTestObject('Test Cases/Schedule new process record/Schedule start'), Start_Date)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Scheduling of recordsworkflows with two different pages/Repeat-No'))

WebUI.click(findTestObject('Test Cases/Schedule new process record/Process Workflow'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Schedule new records'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Schedule new records'))

WebUI.selectOptionByLabel(findTestObject('Test Cases/Schedule new process record/Schedule Core Process'), Schedule_Process, 
    false)

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Schedule new process record/Workflow to trigger'), Workflow, false)

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.selectOptionByLabel(findTestObject('Test Cases/Schedule new process record/Organizational Entity'), Organization, 
    false)

WebUI.delay(GlobalVariable.Short_Delay)

WebUI.doubleClick(findTestObject('Test Cases/Scheduling of recordsworkflows with two different pages/Country-Denmark'))

WebUI.click(findTestObject('Test Cases/Schedule new process record/Create'))

WebUI.delay(GlobalVariable.Long_Delay)

WebUI.comment('Step 5')

Schedule_Id = WebUI.getText(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Schedule Configuration Id'))

WebUI.click(findTestObject('Test Cases/Schedule new process record/Activate_Update_schedule'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Save'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Save'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Cancel'))

WebUI.switchToDefaultContent()

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Show',[('show') : Schedule_Id]), GlobalVariable.Timeout)

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

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/New_Record', [('Task') : Title]), GlobalVariable.Timeout)

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/Schedule new process record/New_Record', [('Task') : Title]))

WebUI.comment('This is a verify step for View/Edit process record page shall be opened.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 9')

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), GlobalVariable.Timeout)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), 'Partner', false)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Data collection programs'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Data collection programs'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure properties of schedued process/Reconciliation'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Reconciliation'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create New Wizard'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Access child form from other workflows/Record Name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Access child form from other workflows/Record Name'), Data_Title)

WebUI.click(findTestObject('Test Cases/Access child form from other workflows/Create'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verify step for checking the record is created and Under task activities setup reconciliation schedule shall be displayed.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure properties of schedued process/Setup Reconciliation Schedule'), 
    GlobalVariable.Timeout)

WebUI.comment('Step 10')

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Setup Reconciliation Schedule'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Configure properties of schedued process/Schedule Name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Configure properties of schedued process/Schedule Name'), Data_schedule_Title)

WebUI.setText(findTestObject('Test Cases/Configure properties of schedued process/Schedule Start'), Start_Date)

WebUI.setText(findTestObject('Test Cases/Configure properties of schedued process/Schedule End'), Start_Date)

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Repeat'))

WebUI.click(findTestObject('Test Cases/Scheduling of recordsworkflows with two different pages/Monthly'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the Task Scheduler page is filled up.This is a verifying step for checking the Task Scheduler page is filled up.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Create'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the record shall be scheduled with basic scheduler option.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Test Cases/Configure properties of schedued process/Delete'))

WebUI.comment('Step 11')

WebUI.closeBrowser()

