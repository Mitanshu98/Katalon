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

WebUI.navigateToUrl('https://halodemo.insife.cloud:8080/ords/f?p=100:LOGIN_DESKTOP:250404183592:::::')

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

WebUI.delay(Delay)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.waitForPageLoad(Timeout)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/Automation log(BOT)'), 
    Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/Automation log(BOT)'))

WebUI.delay(Delay)

WebUI.takeScreenshot('C:\\Users\\mitan\\Downloads\\Application Log\\SS3.jpg')

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/General application log'), 
    Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/General application log'))

WebUI.scrollToElement(findTestObject('HALO Front-End/Application management/Application Log/scroll bar'), 4)

WebUI.delay(Delay)

WebUI.takeScreenshot('C:\\Users\\mitan\\Downloads\\Application Log\\SS5.jpg')

WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.waitForPageLoad(Timeout)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/Scheduled Jobs'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/Scheduled Jobs'))

WebUI.delay(Delay)

WebUI.takeFullPageScreenshot('C:\\Users\\mitan\\Downloads\\Application Log\\SS6.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.waitForPageLoad(Timeout)

WebUI.delay(Delay)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), emailid)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), 'MjLDm8wQW3+1NfnAq7OnypqkBJc9J8Ie')

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.delay(Delay)

WebUI.waitForPageLoad(Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), emailid)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), 'r0Zc9uoGivFWnlDK9UxeLSw1+U/R0MIL')

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(Timeout)

WebUI.delay(Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.waitForPageLoad(Timeout)

WebUI.delay(Delay)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Azure login'))

WebUI.waitForPageLoad(Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

WebUI.delay(Delay)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.delay(Delay)

WebUI.waitForPageLoad(Timeout)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/System Access Log'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/System Access Log'))

WebUI.delay(Delay)

WebUI.scrollToElement(findTestObject('HALO Front-End/Application management/Application Log/scroll bar'), Timeout)

WebUI.takeScreenshot('C:\\Users\\mitan\\Downloads\\Application Log\\SS7.jpg')

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log'))

WebUI.waitForPageLoad(Timeout)

WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Application Log/Audit Log'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Application management/Application Log/Audit Log'))

WebUI.scrollToElement(findTestObject('HALO Front-End/Application management/Application Log/scroll bar'), 3)

WebUI.delay(Delay)

WebUI.takeScreenshot('C:\\Users\\mitan\\Downloads\\Application Log\\SS8.jpg')

WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), Timeout)

WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))

WebUI.closeBrowser()

