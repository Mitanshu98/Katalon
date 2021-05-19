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

WebUI.openBrowser('www.google.com')

WebUI.waitForPageLoad(Timeout)

WebUI.navigateToUrl('https://halodemo.insife.cloud:8080/ords/f?p=100:1:6144625904447:::::')

WebUI.waitForPageLoad(Timeout)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), Timeout)

//*******************************************STEP 2:*******************************************************
//Login and Verify user subscriptions and the Organization of the user
WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), Email)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), 'r0Zc9uoGivFWnlDK9UxeLSw1+U/R0MIL')

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(Timeout)

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS1.jpg')

WebUI.click(findTestObject('HALO Front-End/My settings/My settings'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), Timeout)

WebUI.click(findTestObject('HALO Front-End/My settings/My roles'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS2.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Agreegate reporting'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS2.1.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Clinical projects studies'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS3.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Data collection programs'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS4.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS6.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Environment Overview'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS7.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/ICSR processing'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS8.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Product Management'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS9.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/PSMF Management'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS10.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Requirement Intelligence'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS11.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Signal management'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS12.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Submissions'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS13.jpg')

WebUI.click(findTestObject('HALO Front-End/Processes/Time Management'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Insife\\Product development - Katalon\\Upload and Download\\SS14.jpg')

WebUI.closeBrowser()

