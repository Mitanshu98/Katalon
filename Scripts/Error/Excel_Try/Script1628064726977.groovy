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


data = findTestData('Test').getValue(11, 1)

String str1 = "Tutorialspoint";
String str2 = "Tutorielspoint";
String str3 = "Hi";
 
  // checking for equality
boolean retval1 = str1.equals(str1);
boolean retval2 = str2.equals(str3);
 
  // prints the return value
System.out.println("str2 is equal to str1 = " + retval1);
System.out.println("str2 is equal to str3 = " + retval2);
System.out.println(str1==str2)
WebUI.comment(System.out.println(str1==str3))

/*
WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut.katalon.com/')

String result = WebUI.getText(findTestObject('null'))

CustomKeywords.'excel.Export.demoKey'('D:\\\\demo.xlsx')

WebUI.closeBrowser()
*/
