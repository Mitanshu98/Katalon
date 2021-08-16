 /*
 Title:- HALOPV 3.0 Browser compatibility - Upload and download
 Owner:- Mitanshu Gupta
 Description:- This test case verifies the browser compatibility with the following functions:
	1.	Verify that it is possible to upload a file from the local PC to a record in HALOPV ([attachment icon] > Upload)
	2.	Verify that it is possible to download a file using the Download link.
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

WebUI.comment('Step 1')

CustomKeywords.'HALO.HaloLogin'()

WebUI.comment('This is a verify step for checking the roles of the user.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/ICSRs'), GlobalVariable.Timeout)

WebUI.comment('Step 2')

WebUI.click(findTestObject('HALO Front-End/Processes/ICSRs'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Regression/ICSR processing'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/PSUR Periodic reporting rules/New Record'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForElementClickable(findTestObject('Object Repository/Test Cases/Add, Delete and Attachment/Attachment button'), 
    GlobalVariable.Timeout)

WebUI.comment('Step 3')

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Attachment button'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('This is a verifying step for checking the attachment window doesn\'t contain any attachment.')

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Upload file'), GlobalVariable.Timeout)

WebUI.uploadFileWithDragAndDrop(findTestObject('Test Cases/Add, Delete and Attachment/Upload file'), Location)

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Upload Button'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verify step for checking the file is uploaded.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Upload Return'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/Add, Delete and Attachment/Attachment button'), GlobalVariable.Timeout)

WebUI.comment('Step 4')

WebUI.click(findTestObject('Test Cases/Add, Delete and Attachment/Attachment button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/Uploaded Object'), GlobalVariable.Timeout)

if (WebUI.waitForElementClickable(findTestObject('Test Cases/Regression/Uploaded Object'), GlobalVariable.Timeout)) {
    WebUI.click(findTestObject('Test Cases/Regression/Uploaded Object'))

    WebUI.comment('This is a verifying step for checking the file is downloaded on Local machine,')
} else {
    WebUI.comment('The attachment file can not be downloaded, Step Fails.')
}

WebUI.takeScreenshot()

WebUI.comment('Step 5')

WebUI.closeBrowser()

