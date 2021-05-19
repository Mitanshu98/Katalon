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

//***********************************************STEP 1:**************************************************
 //Open the browser and enter application url
  //Open the browser and enter application url
 WebUI.openBrowser('www.google.com')
 
 WebUI.waitForPageLoad(Timeout)
 
 WebUI.navigateToUrl(GlobalVariable.Url)
 
 WebUI.waitForPageLoad(Timeout)
 
 WebUI.maximizeWindow()
 
 //Enter email id in textbox for microsoft login

 WebUI.setText(findTestObject('Object Repository/Microsoft and HALO login/Microsoft login/Enter_email'), GlobalVariable.Email1)
 
 //Click on next button
 WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Microsoft login/Next button'))
 
 //Enter password encrypted
 WebUI.setEncryptedText(findTestObject('Object Repository/Microsoft and HALO login/Microsoft login/Password'), 'IsWolea8KRV58STdLx4yMA==')
 
 //Click signin button
 WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Microsoft login/SignIn'))
 
 //wait for authentication
 WebUI.waitForPageLoad(Timeout)
 
 //Check checkbox for stay signed in
 WebUI.check(findTestObject('Object Repository/Microsoft and HALO login/Microsoft login/Checkbox stay signed in'))
 
 //Click Yes button
 WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Microsoft login/Stay signed in YES'))
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), Globalvariable.Timeout)
 
 //*******************************************STEP 2:*******************************************************
 //Login and Verify user subscriptions and the Organization of the user
 WebUI.setText(findTestObject('Object Repository/Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email1)
 
 WebUI.setEncryptedText(findTestObject('Object Repository/Microsoft and HALO login/HALO Login Page/HALO_Password'), 'MJ21vnksEk/pLmbHyc4MAw==')
 
 WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))
 
 //WebUI.waitForElementVisible(findTestObject('Generic/HALO Login Page/My Org Entity_link'), GlobalVariable.Timeout)
 
 //WebUI.click(findTestObject('Generic/HALO Login Page/My Org Entity_link'))
 WebUI.takeScreenshot("C:\\Users\\joyde\\Insife\\Product development - Documents\\Katalon\\Screenshots\\01.Step2.png")
 
 WebUI.click(findTestObject('Object Repository/HALO Front-End/My settings/My settings'))
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/HALO Front-End/My settings/My roles'), GlobalVariable.Timeout)
 
 WebUI.click(findTestObject('Object Repository/HALO Front-End/My settings/My roles'))
 WebUI.takeScreenshot("C:\\Users\\joyde\\Insife\\Product development - Documents\\Katalon\\Screenshots02.Step2.png")
 
 //********************************************STEP 3:**********************************************************
 WebUI.click(findTestObject('Object Repository/HALO Front-End/Application management/Application management'))
 WebUI.waitForElementVisible(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step3/List value metadata expert link'), GlobalVariable.Timeout)
 WebUI.click(findTestObject('Object Repository/Test Cases/All changes to LOVs shown in audit trial/Step3/List value metadata expert link'))
 
 
 //********************************************STEP 4:***********************************************************
 WebUI.click(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step4/Edit_Agreement location'))
 
 //********************************************STEP 5:***********************************************************
 WebUI.switchToFrame(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step5/iframe'), Timeout)
 WebUI.setText(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step5/NUMVAL2 T6'), 'REGIONS')
 WebUI.takeScreenshot("E:\\Katalon Scripts\\All changes to LOVs shown in audit trial\\01.Step5.png")
 WebUI.click(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step5/Save'))
 WebUI.waitForPageLoad(Timeout)
 //********************************************STEP 6:************************************************************
 WebUI.switchToDefaultContent()
 WebUI.click(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step6/Audit log button'))
 
 //*********************************************STEP 7************************************************************
 WebUI.takeFullPageScreenshot("E:\\Katalon Scripts\\All changes to LOVs shown in audit trial\\01.Step7.png")
 
 //*********************************************STEP 8************************************************************
 WebUI.click(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step8/Close page'))
 WebUI.waitForPageLoad(Timeout)
 //obj taken from step4
 WebUI.click(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step4/Edit_Agreement location'))
 WebUI.switchToFrame(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step5/iframe'), Timeout)
 WebUI.waitForPageLoad(Timeout)
 WebUI.click(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step8/Delete btn'))
 WebUI.switchToDefaultContent()
 WebUI.takeScreenshot("E:\\Katalon Scripts\\All changes to LOVs shown in audit trial\\01.Step8.png")
 WebUI.click(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step8/DeleteOK btn'))
 WebUI.takeScreenshot("E:\\Katalon Scripts\\All changes to LOVs shown in audit trial\\02.Step8.png")
 
 //**********************************************STEP 9************************************************************
 WebUI.switchToDefaultContent()
 WebUI.click(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step6/Audit log button'))
 
 //**********************************************STEP 10************************************************************
 WebUI.takeFullPageScreenshot("E:\\Katalon Scripts\\All changes to LOVs shown in audit trial\\02.Step8.png")
 
 //**********************************************STEP 11************************************************************
 WebUI.click(findTestObject('Object Repository/All changes to LOVs shown in audit trial/Step8/Close page'))
 WebUI.click(findTestObject('Object Repository/Step9/Logout_btn'))