 /*
 Title:- Schedule initiation of workflows on existing process records
 Owner:- Mitanshu Gupta
 Description:-  In this test case we are creating a record in Entities(External) and complete its workflow and create a schedule for that record.
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

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verify step for checking the record page shall be opened.')

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Reports/PSUR Periodic reporting rules/New Record'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the record shall be created and saved.')

WebUI.takeScreenshot()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.click(findTestObject('Test Cases/Initiating Workflow/Record Revision'))

WebUI.delay(2)

Record_Id = WebUI.getText(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Master_Id'))

System.out.println('Record_Id' + Record_Id)

WebUI.click(findTestObject('Test Cases/User can see attachment from revision/Revision close'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Textarea'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Add, Delete and Attachment/Textarea'), Comments)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Comp and forward'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Scheduler'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('HALO Front-End/Processes/Scheduler'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Create new Schedule'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Create new Schedule'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Schedule Name'), GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.setText(findTestObject('Test Cases/Schedule new process record/Schedule Name'), Schedule_title)

WebUI.setText(findTestObject('Test Cases/Schedule new process record/Schedule start'), Schedule_Date)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Process Workflow'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Schedule New Records_NO'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Schedule New Records_NO'))

WebUI.setText(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Specific Record'), Record_Id)

WebUI.comment('This is a verifying step for checking the Schedule is populated with Record Id')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 8')

WebUI.click(findTestObject('Test Cases/Schedule new process record/Create'))

WebUI.delay(10)

WebUI.comment('This is a verifying step fr checking schedule shall be created successfully')

WebUI.takeFullPageScreenshot()

Schedule_Id = WebUI.getText(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Schedule Configuration Id'))

WebUI.click(findTestObject('Test Cases/Schedule new process record/Activate_Update_schedule'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Save'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Save'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/Cancel'))

WebUI.switchToDefaultContent()

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Show'), GlobalVariable.Timeout)

WebUI.comment('Step 9')

WebUI.click(findTestObject('Test Cases/Schedule new process record/Show', [('show') : Schedule_Id]))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verify step for checking One record matching the schedule shall be shown:Workflow: Entities management (External)')

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/Run Scheduler'), GlobalVariable.Timeout)

WebUI.comment('Step 10')

WebUI.click(findTestObject('Test Cases/Schedule new process record/Run Scheduler'))

WebUI.delay(10)

WebUI.comment('This is a verify step for checking the instance shall be created successfully (Task and Process record columns are populated with a Record ID of the task and process record) and the Processed column shall be populated with a timestamp')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/OK'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/OK'))

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Record'), 
    GlobalVariable.Timeout)

WebUI.comment('Step 11')

WebUI.click(findTestObject('Test Cases/Schedule of Initiation of workflows on existing record/Record', [('Task') : Record_Id]))

WebUI.comment('This is a verify step for View/Edit process record page shall be opened.')

WebUI.takeScreenshot()

WebUI.comment('Step 12')

WebUI.closeBrowser()

