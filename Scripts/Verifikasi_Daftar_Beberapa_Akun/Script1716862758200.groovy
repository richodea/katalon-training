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

WebUI.takeScreenshot()

def userData = [['username1', '8SQVv/p9jVRYfSV/eMGvjg==', 'email1@example.com'], ['username2', '8SQVv/p9jVQz2gZTiSc0Fg=='
        , 'email2@example.com']]

for (def userDataEntry : userData) {
    // Extract user data
    def username = userDataEntry[0]

    def password = userDataEntry[1]

    def email = userDataEntry[2]

    // Navigate to registration page (Replace "navigateToRegistrationPage()" with actual method to navigate)

    // Fill registration form and submit (Replace with actual method calls)
    WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__name'), username)

    WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/input__email'), email)

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Metrodata Academy/input__password'), password)

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Metrodata Academy/input__confirmPassword'), password)
	
	WebUI.takeScreenshot()

	WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/div_Dengan mendaftar, Anda dianggap telah m_3e03ff'))
	
	WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/input__termsCondition'))
	
	WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Daftar'))
	
	WebUI.takeScreenshot()
}

