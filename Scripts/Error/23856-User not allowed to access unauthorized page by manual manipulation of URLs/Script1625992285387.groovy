/*
 Title:- User not allowed to access unauthorized page by manual manipulation of URLs.
 Owner:- Mitanshu Gupta
 Description:- In this test case User to check the halo environment with different URLs.
 Environment:- HALO 3.0(https://halocodebase.insife.cloud:8080/ords/f?p=100)
 */





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

url = WebUI.getUrl()

WebUI.comment('The current URL :' + url)

newurl = ((url.substring(0, 61) + '133') + url.substring(63))

WebUI.comment('Step 3')

WebUI.navigateToUrl(newurl)

WebUI.comment('The new Url after update of 133 :' + newurl)

WebUI.comment('This is a verifying step for checking On modifying the page number from 20 to 133, an access warning is shown, and the page content do not load.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('Test Cases/Schedule new process record/OK'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/Schedule new process record/OK'))

newurl1 = ((newurl.substring(0, 61) + '122') + url.substring(63))

WebUI.navigateToUrl(newurl1)

WebUI.comment('The new Url after update of 122' + newurl1)

WebUI.comment('This is a verifying step for checking On modifying the page number from 133 to 122, an access warning is shown, and the page content do not load.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Error-Ok'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Error-Ok'))

newurl2 = ((newurl1.substring(0, 71) + 'P133_CHECKACCESS') + newurl1.substring(94))

WebUI.navigateToUrl(newurl2)

WebUI.comment('The new Url after update of P133_CHECKACCESS :' + newurl2)

WebUI.comment('This is a verifying step for checking A session state protection violation error is shown (because the manually added access parameter do not have a valid checksum)')

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

