 /*
Title:- User can see attachments from all record revisions.
Owner:- Mitanshu Gupta
Description:- Here in this test case we are creating a record and attach a file and complete the workflow and initiate it and again complete it and sees the diffrent Record revisions.
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
WebUI.comment('Step 1 and 2')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Product Management'), GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('HALO Front-End/Processes/Product Management'))

WebUI.waitForElementVisible(findTestObject('Test Cases/User subscribed to configured/Product management'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/User subscribed to configured/Product management'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Basic Information'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('HALO Front-End/Common Elements/Basic Information box/Entity name'), Title, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('HALO Front-End/Common Elements/Basic Information box/Type'), Type, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Basic Information box/Save and close'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the record is created.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Attachment button'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Attachment button'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Upload file'), GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.uploadFileWithDragAndDrop(findTestObject('Test Cases/Add, Delete and Attachment/Upload file'), Location)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Upload Button'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the file is uploaded.')

WebUI.takeFullPageScreenshot('Step 7 and 8')

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Upload Return'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Common Elements_Reports/1st Completed Task'), GlobalVariable.Timeout)

WebUI.comment('Step 9')

WebUI.click(findTestObject('Test Cases/Common Elements_Reports/1st Completed Task'))

/*
WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Complete task (comments)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Textarea'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/Add, Delete and Attachment/Textarea'), Comments)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Comp and forward'))
*/
WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the workflow shall be completed.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.comment('Step 10')

WebUI.click(findTestObject('Test Cases/Initiating Workflow/Record Revision'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the Revision 1 is created.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/User can see attachment from revision/Revision close'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Initiate Workflow'), GlobalVariable.Timeout)

WebUI.comment('Step 11')

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Initiate Workflow'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the workflow shall be initiated.')

WebUI.takeScreenshot()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Common Elements_Reports/1st Completed Task'), GlobalVariable.Timeout)

WebUI.comment('Step 12')

WebUI.click(findTestObject('Test Cases/Common Elements_Reports/1st Completed Task'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Long_Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'), 
    GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Entities and agreements/Entities and agreement form/More menu'))

WebUI.comment('Step 13')

WebUI.click(findTestObject('Test Cases/Initiating Workflow/Record Revision'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the Revision 2 is created.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/User can see attachment from revision/Revision 1'), GlobalVariable.Timeout)

WebUI.comment('Step 14')

WebUI.click(findTestObject('Test Cases/User can see attachment from revision/Revision 1'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Attachment button'), GlobalVariable.Timeout)

WebUI.comment('Step 15 and 16')

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Attachment button'))

WebUI.comment('This is a Verify step where user is able to see the attachment of pervious revision under Attachment in all record.')

WebUI.takeFullPageScreenshot()

WebUI.comment('Step 17 and 18')

WebUI.closeBrowser()

