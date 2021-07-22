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

WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.comment('Step 4')

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), Test_User)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Password_User)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking the test user shall be able to login.')

WebUI.takeFullPageScreenshot()

//WebUI.click(findTestObject('HALO Front-End/Processes/Process_Dropdown'))
WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.comment('Step 5')

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 6')

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/old record external'), GlobalVariable.Timeout)

WebUI.comment('Step 7')

WebUI.click(findTestObject('Test Cases/create and modify light users/old record external'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 10)

WebUI.comment('Step 8')

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/External Partner Form'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/create and modify light users/External Partner Form'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/person'), GlobalVariable.Timeout)

WebUI.comment('Step 9')

WebUI.click(findTestObject('Test Cases/create and modify light users/person'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Create light user page shall be displayed with these fields - User emai,lFull name,Home region,Home territory,Office phone,Mobile,User Role(s),Date created,Email notifications and User Type.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Test Cases/create and modify light users/Add contact or responsible persons'))

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/User Full name'), GlobalVariable.Timeout)

WebUI.comment('Step 10')

WebUI.setText(findTestObject('Test Cases/create and modify light users/User Full name'), User_Name)

WebUI.setText(findTestObject('Test Cases/create and modify light users/User email'), User_Email)

WebUI.setText(findTestObject('Test Cases/create and modify light users/Phone number'), User_Phone)

WebUI.click(findTestObject('Test Cases/create and modify light users/email notifications'))

WebUI.selectOptionByLabel(findTestObject('Test Cases/create and modify light users/Home region'), User_Region, false)

WebUI.click(findTestObject('Test Cases/create and modify light users/home country'))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/search field'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/create and modify light users/search field'), 'Denmark')

WebUI.click(findTestObject('Test Cases/create and modify light users/Search button'))

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/Denmark DK'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/create and modify light users/Denmark DK'))

WebUI.delay(GlobalVariable.Delay)

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/create and modify light users/create'))

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking Light user shall be created')

WebUI.takeFullPageScreenshot()

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('Test Cases/Regression/Close ICSR'), GlobalVariable.Timeout)

WebUI.comment('Step 11')

WebUI.click(findTestObject('Test Cases/Regression/Close ICSR'))

CustomKeywords.'HALO.Logout'()

/*
WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/person'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/create and modify light users/person'))

WebUI.takeFullPageScreenshot()
*/
WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), GlobalVariable.HaloPass)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.comment('This is a verifying step for checking user shall be able to login.')

WebUI.takeFullPageScreenshot()

WebUI.waitForElementVisible(findTestObject('HALO Front-End/User administration/User administration'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/User administration/User administration'))

WebUI.click(findTestObject('HALO Front-End/User administration/Users'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(GlobalVariable.Delay)

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/Search_User'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/create and modify light users/Search_User'), Test_User)

WebUI.click(findTestObject('Test Cases/create and modify light users/Search_Button'))

WebUI.comment('Step 12')

WebUI.takeScreenshot()

CustomKeywords.'HALO.Logout'()

WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), Test_User)

WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), Password_User)

WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 13')

WebUI.waitForElementVisible(findTestObject('HALO Front-End/Processes/Entities and Agreement'), GlobalVariable.Timeout)

WebUI.click(findTestObject('HALO Front-End/Processes/Entities and Agreement'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 14')

WebUI.click(findTestObject('Test Cases/Access child form via Task option/Entites and agreement(External)'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 15')

WebUI.click(findTestObject('Test Cases/create and modify light users/old record external'))

WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.comment('Step 16')

WebUI.click(findTestObject('Test Cases/create and modify light users/External Partner Form'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/person'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/create and modify light users/person'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Test Cases/create and modify light users/Johntest'))

WebUI.waitForElementVisible(findTestObject('Test Cases/create and modify light users/Phone number'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Test Cases/create and modify light users/Phone number'), '7204635004')

WebUI.click(findTestObject('Test Cases/create and modify light users/Save'))

WebUI.comment('Step 17')

WebUI.closeBrowser()

