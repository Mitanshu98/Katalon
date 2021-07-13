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

public class Access_to_process_records {
	@Keyword
	public void Yes(){
		WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

		WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Process workflows'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/Application management/Process workflows'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.setText(findTestObject('Test Cases/Assign Electronic signature/Search Box'), 'Entities')

		WebUI.click(findTestObject('Test Cases/Assign Electronic signature/Search Button'))

		WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'),
				GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), 1)

		WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Advanced Settings'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Access to process records/Advanced Settings'))

		WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Product and compound Yes'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Access to process records/Product and compound Yes'))

		WebUI.click(findTestObject('Test Cases/Access to process records/Include territory Yes'))

		WebUI.click(findTestObject('Test Cases/Access to process records/Include study Yes'))

		WebUI.click(findTestObject('Test Cases/Access to process records/Include organizational study Yes'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.comment('This is a verify step where Workflows page shall be displayed.')

		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Test Cases/Entities and agreements/Save'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.click(findTestObject('Test Cases/Entities and agreements/Close'))

		WebUI.switchToDefaultContent()

		WebUI.waitForPageLoad(GlobalVariable.Timeout)
	}
	@Keyword
	public void No() {
		WebUI.click(findTestObject('HALO Front-End/Application management/Application management'))

		WebUI.waitForElementPresent(findTestObject('HALO Front-End/Application management/Process workflows'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/Application management/Process workflows'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.setText(findTestObject('Test Cases/Assign Electronic signature/Search Box'), 'Entities')

		WebUI.click(findTestObject('Test Cases/Assign Electronic signature/Search Button'))

		WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'),
				GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Access to process records/Process workflow-Entities(internal)'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.switchToFrame(findTestObject('HALO Front-End/Common Elements/Iframe(5)'), GlobalVariable.Timeout)

		WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Advanced Settings'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Access to process records/Advanced Settings'))

		WebUI.waitForElementVisible(findTestObject('Test Cases/Access to process records/Product and compound No'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Access to process records/Product and compound No'))

		WebUI.click(findTestObject('Test Cases/Access to process records/Include Territory No'))

		WebUI.click(findTestObject('Test Cases/Access to process records/Include Study No'))

		WebUI.click(findTestObject('Test Cases/Access to process records/Include organizationalstudy No'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.click(findTestObject('Test Cases/Entities and agreements/Save'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.comment('This is a verify step where Workflows page shall be displayed.')

		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Test Cases/Entities and agreements/Close'))

		WebUI.switchToDefaultContent()

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(GlobalVariable.Delay)
	}
}
