import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class HALO {

	@Keyword
	public void HaloLogin() {
		//Open the browser and enter application URL
		WebUI.openBrowser(GlobalVariable.Url)

		//Maximize the browser window
		WebUI.maximizeWindow()

		if (WebUI.waitForElementVisible(findTestObject('Object Repository/Microsoft and HALO login/Microsoft login/Enter_email'),
		20)) {
			//Enter email id in textbox for microsoft login
			WebUI.setText(findTestObject('Microsoft and HALO login/Microsoft login/Enter_email'), GlobalVariable.Email)

			//Click on next button
			WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Next button'))

			//Enter password encrypted
			WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/Microsoft login/Password'), GlobalVariable.UserPass)

			//Click signin button
			WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/SignIn'))

			//wait for authentication
			WebUI.waitForPageLoad(GlobalVariable.Timeout)

			//Check checkbox for stay signed in
			WebUI.check(findTestObject('Microsoft and HALO login/Microsoft login/Checkbox stay signed in'))

			//Click Yes button
			WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Stay signed in YES'))
		}

		WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

		//*******************************************STEP 2:*******************************************************
		//Login and Verify user subscriptions and the Organization of the user
		WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), GlobalVariable.Email)

		WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), GlobalVariable.HaloPass)

		WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/My settings/My settings'))

		WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/My settings/My roles'))

		WebUI.delay(GlobalVariable.Delay)
	}

	@Keyword
	public void Logout(){
		WebUI.click(findTestObject('HALO Front-End/Common Elements/User_Dropdown'))

		WebUI.waitForElementVisible(findTestObject('HALO Front-End/Common Elements/Log Out'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/Common Elements/Log Out'))
	}

	@Keyword
	public void HaloMicrosoftLogin() {
		WebUI.openBrowser(GlobalVariable.Url)

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.maximizeWindow()
		if (WebUI.waitForElementVisible(findTestObject('Object Repository/Microsoft and HALO login/Microsoft login/Enter_email'),20)) {
			//Enter email id in textbox for microsoft login
			WebUI.setText(findTestObject('Microsoft and HALO login/Microsoft login/Enter_email'), GlobalVariable.Email)

			//Click on next button
			WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Next button'))

			//Enter password encrypted
			WebUI.setEncryptedText(findTestObject('Microsoft and HALO login/Microsoft login/Password'), GlobalVariable.UserPass)

			//Click signin button
			WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/SignIn'))

			//wait for authentication
			WebUI.waitForPageLoad(GlobalVariable.Timeout)

			//Check checkbox for stay signed in
			WebUI.check(findTestObject('Microsoft and HALO login/Microsoft login/Checkbox stay signed in'))

			//Click Yes button
			WebUI.click(findTestObject('Microsoft and HALO login/Microsoft login/Stay signed in YES'))
		}
	}
	@Keyword
	public void HaloUserLogin(String User,String password) {

		WebUI.waitForElementVisible(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'), GlobalVariable.Timeout)

		//*******************************************STEP 2:*******************************************************
		//Login and Verify user subscriptions and the Organization of the user
		WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Username'), User)

		WebUI.setText(findTestObject('Microsoft and HALO login/HALO Login Page/HALO_Password'), password)

		WebUI.click(findTestObject('Microsoft and HALO login/HALO Login Page/Halo_Login Btn'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/My settings/My settings'))

		WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/My settings/My roles'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.comment('Roles the user has subscribed')

		WebUI.takeFullPageScreenshot()
	}
	@Keyword
	public void Updatereadonly() {
		WebUI.click(findTestObject('HALO Front-End/My settings/My settings'))

		WebUI.waitForElementVisible(findTestObject('HALO Front-End/My settings/My roles'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/My settings/My roles'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.click(findTestObject('Test Cases/Drill down Page includes process/Generic organizational Entity Processing'))

		WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.waitForElementVisible(findTestObject('Test Cases/Assign user groups to users with read only attribute/Read only'),
				GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Assign user groups to users with read only attribute/Read only'))

		WebUI.click(findTestObject('Test Cases/Drill down Page includes process/Update Subscription'))

		WebUI.delay(GlobalVariable.Delay)
	}
}
