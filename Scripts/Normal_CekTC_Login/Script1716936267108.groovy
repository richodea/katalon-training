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

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_Metrodata Academy_bg-FEEBEB rounded-md p-4'), 
    5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_Jadwal Training dan Workshop Bersertifi_4f8bde'), 
    5)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/header_May 2024Previous weekTodayNext weekO_848220'), 
    5)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_May 2024Previous weekTodayNext weekOpen_46efcd'), 
    5)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_Bergabung dengan program unggulan kamiM_bb07e7'), 
    5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_Nikmati keuntunganbersama Metrodata Aca_8f9d17'), 
    5)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_Artikel TerbaruBerita, ilmu, dan pelati_9a18c6'), 
    5)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_Apa kata mereka tentang program kamiInt_94d5ba'), 
    5)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_Digital learning provider terbaik yang _521103'),

	5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Terms  Condition'))

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.closeBrowser()

