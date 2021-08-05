import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

public class reports {
	@Keyword
	public void Report_Download(){
		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(GlobalVariable.Delay)

		WebUI.comment('This is a verify step for checking the HALO reports shall be displayed')

		WebUI.takeFullPageScreenshot()

		WebUI.switchToFrame(findTestObject('Test Cases/Reports/Tabular Reports/Iframe(2)'), 2)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Action'))

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Download'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/CSV'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/CSV'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download button'))

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Cancel Button'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.switchToDefaultContent()

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'))

		WebUI.delay(GlobalVariable.Delay)
	}
	@Keyword
	public void Record(){
		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(GlobalVariable.Delay)

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(GlobalVariable.Delay)

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Common Elements/1st Completed Task'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(GlobalVariable.Delay)

		WebUI.comment('This is a verify step for checking the workflow is completed')

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementClickable(findTestObject('HALO Front-End/Common Elements/Record Close'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/Common Elements/Record Close'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.switchToDefaultContent()

		WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Dashboards and reports'))

		WebUI.waitForElementClickable(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('HALO Front-End/Dashboards and reports/Tabular reports'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Requirements Dropdown'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Requirements Dropdown'))

		WebUI.delay(GlobalVariable.Delay)
	}
	@Keyword
	public void PSUR_Download(){
		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(GlobalVariable.Delay)

		WebUI.switchToFrame(findTestObject('Test Cases/Reports/Tabular Reports/Iframe(2)'), 2)

		WebUI.comment('This is a verify step for checking the HALO reports shall be displayed')

		WebUI.takeFullPageScreenshot()

		WebUI.scrollToElement(findTestObject('Test Cases/Reports/Tabular Reports/Scroll Element/PSUR'), GlobalVariable.Timeout)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Action'))

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Download'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/CSV'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/CSV'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download button'))

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Cancel Button'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.switchToDefaultContent()

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'))

		WebUI.delay(GlobalVariable.Delay)
	}
	@Keyword
	public void DSUR_Download(){
		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(GlobalVariable.Delay)

		WebUI.switchToFrame(findTestObject('Test Cases/Reports/Tabular Reports/Iframe(2)'), 2)

		WebUI.comment('This is a verify step for checking the HALO reports shall be displayed')

		WebUI.takeFullPageScreenshot()

		WebUI.scrollToElement(findTestObject('Test Cases/Reports/Tabular Reports/Scroll Element/DSUR_2'), GlobalVariable.Timeout)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Action'))

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Download'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/CSV'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/CSV'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download button'))

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Cancel Button'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.switchToDefaultContent()

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'))

		WebUI.delay(GlobalVariable.Delay)
	}
	@Keyword
	public void Signal_Download(){
		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(GlobalVariable.Delay)

		WebUI.switchToFrame(findTestObject('Test Cases/Reports/Tabular Reports/Iframe(2)'), 2)

		WebUI.comment('This is a verify step for checking the HALO reports shall be displayed')

		WebUI.takeFullPageScreenshot()

		WebUI.scrollToElement(findTestObject('Test Cases/Reports/Tabular Reports/Scroll Element/Signal_1'), GlobalVariable.Timeout)

		WebUI.takeFullPageScreenshot()

		WebUI.scrollToElement(findTestObject('Test Cases/Reports/Tabular Reports/Scroll Element/Signal_2'), GlobalVariable.Timeout)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Action'))

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Download'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/CSV'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/CSV'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download button'))

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Cancel Button'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.switchToDefaultContent()

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'))

		WebUI.delay(GlobalVariable.Delay)
	}
	@Keyword
	public void OEO_Download(){
		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.delay(GlobalVariable.Delay)

		WebUI.switchToFrame(findTestObject('Test Cases/Reports/Tabular Reports/Iframe(2)'), 2)

		WebUI.comment('This is a verify step for checking the HALO reports shall be displayed')

		WebUI.takeFullPageScreenshot()

		WebUI.scrollToElement(findTestObject('Test Cases/Reports/Tabular Reports/Scroll Element/OEO_1'), GlobalVariable.Timeout)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Action'))

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/Download'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.waitForElementVisible(findTestObject('Test Cases/Reports/Tabular Reports/CSV'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/CSV'))

		WebUI.delay(GlobalVariable.Delay)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Download button'))

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/Cancel Button'))

		WebUI.waitForPageLoad(GlobalVariable.Timeout)

		WebUI.switchToDefaultContent()

		WebUI.waitForElementClickable(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'), GlobalVariable.Timeout)

		WebUI.click(findTestObject('Test Cases/Reports/Tabular Reports/tabular record close'))

		WebUI.delay(GlobalVariable.Delay)
	}
}
