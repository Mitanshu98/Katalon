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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://argus.insife.cloud/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Username_loginId'), 'mitanshu.gupta', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Password_password'), 'sNCdcjhfwHGCfby6dA8/rw==', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/td_Case Actions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Argus Safety 8.2.3/td_Case Actions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/li_New(CtrlAltN)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Argus Safety 8.2.3/li_New(CtrlAltN)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Report Type_search_init_rept_date'), '15-OCT-2020', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Report Type_search_central_receipt_date'), 
    '12-NOV-2020', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Report Type_search_country_text'), 'INDIA', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Report Type_TXT_search_report_type'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Report Type_TXT_search_report_type'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Report Type_TXT_search_report_type'), 'Spontaneous', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/td_Select'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Generic Name_search_product'), 'Pizer', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Onset DateTime_search_rpt_event'), 'Trend', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Title_chkSoundex'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/button_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Other_sc_non_serious'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/button_BookIn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Copy_btnOkYes (1)'), FailureHandling.STOP_ON_FAILURE)

data2 = WebUI.getText(findTestObject('Page_Argus Safety 8.2.3/record_id'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Argus Safety 8.2.3/input_Delete_HeaderimgRoute'), FailureHandling.CONTINUE_ON_FAILURE)

System.out.println(data)

System.out.println(data1)

System.out.println(data2)

