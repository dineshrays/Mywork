import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://leedonline-stg.usgbc.org/')

WebUI.setText(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/input_Log in to start a projec'), 'jaypeejay@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/input_Log in to start a projec_1'), 
    'k35wbLuhoDOfiKYe0IaeNQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/input_Log in to start a projec_2'), 
    'k35wbLuhoDOfiKYe0IaeNQ==')

WebUI.click(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/span_End User License Agreemen'))

WebUI.click(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/button_Log In'))

WebUI.click(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/a_v4.1 Interiors BP02'))

WebUI.click(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/a_Download'))

WebUI.switchToWindowTitle('Confirmation of Agent\'s Authority | U.S. Green Building Council')

WebUI.click(findTestObject('null'))

WebUI.switchToWindowTitle('Confirmation of Agent\'s Authority | U.S. Green Building Council')

WebUI.click(findTestObject('null'))

