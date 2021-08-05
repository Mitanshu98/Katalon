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
import org.openqa.selenium.interactions.Action as Action
import org.openqa.selenium.interactions.Actions as Actions

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://halocodebase.insife.cloud:8080/ords/halo/r/halopv800/login_desktop?session=17274320227432', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Microsoft and HALO login/Page_Login Page/input_username_P101_USERNAME'), 
    'mitanshu.gupta@insife.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Login Page/div_HALOPV 3.0 Codebase        usernamepass_4c2775'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Microsoft and HALO login/Page_Login Page/input_password_P101_PASSWORD'), 
    'Wv5Ut/ecpITXmQiPI8SQjQJOQgOfhlZb', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Login Page/button_Log In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Task Scheduler Details/a_Data Collection Programs'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Core process overview/span_Data collection programs'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/a_DATACOL-2020'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/span_Data collection program form'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/label_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/span_External parties'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/button_Partner_P45_HANDLING_ORG_ADD_lov_btn'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/li_Joydeep committee'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/button_Role(s) in this program_P45_HANDLING_d59858'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/button_Role(s) in this program_P45_HANDLING_d59858'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/button_Partner_P45_HANDLING_ORG_ADD_lov_btn'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/button_Load More Rows'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/li_Partner'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/button_Role(s) in this program_P45_HANDLING_d59858'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/button_Role(s) in this program_P45_HANDLING_d59858'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/button_Add to program'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Microsoft and HALO login/Page_Process Master record list/a_External parties'), 
    FailureHandling.CONTINUE_ON_FAILURE)

