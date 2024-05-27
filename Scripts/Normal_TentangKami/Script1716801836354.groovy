import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Tentang Kami'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Page_Metrodata Academy/span_Setelah lebih dari 40 tahun menjadi ba_02cdf8'), 5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_Latar Belakang Metrodata AcademyMetroda_9f4957'), 
    5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_PT Sinergi Transformasi Digital (SINERG_7d455f'), 
    5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/p_PT Metrodata Electronics Tbk (Perseroan) _ca2b74'), 
    5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_PT Mitra Integrasi Informatika (MII)PT _d21817'), 
    5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_PT Sinergi Transformasi Digital (SINERG_7d455f'), 
    5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_1996199920152020PT Mitra Integrasi Info_9a3da7'), 
    10)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/div_VisiMenempatkan trainer profesional seb_60e32e_1'), 
    10) 

WebUI.delay(5)

WebUI.closeBrowser()

