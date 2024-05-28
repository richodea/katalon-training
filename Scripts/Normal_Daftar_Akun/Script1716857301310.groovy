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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://metrodataacademy.id/')

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__name'), 'John Pantau')

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__email'), 'linda.123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Metrodata Academy/input__password'), '91fPDUXtYEteSfbq5cOxLA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Metrodata Academy/input__confirmPassword'), '91fPDUXtYEteSfbq5cOxLA==')

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/svg__h-5 w-5 text-gray-700'))

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/svg__h-5 w-5 text-gray-700'))

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/div_Dengan mendaftar, Anda dianggap telah m_3e03ff'))

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/input__termsCondition'))

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Daftar'))

WebUI.delay(5)

WebUI.closeBrowser()

