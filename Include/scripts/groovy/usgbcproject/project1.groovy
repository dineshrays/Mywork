package usgbcproject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class project1 {
	
	@Given("User should see the details of project page")
	def User_should_see_the_details_of_project_page() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl("https://leedonline-stg.usgbc.org/")
		WebUI.delay(3)
		
		//WebUI.scrollToText(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/input_Log in to start a projec'))
		
		WebUI.setText(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/input_Log in to start a projec'),'jaypeejay@hotmail.com');
		
		WebUI.setText(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/input_Log in to start a projec_2'),'initpass')
		WebUI.delay(5)
		
		WebUI.scrollToElement(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/span_End User License Agreemen'), 2)
		WebUI.check(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/span_End User License Agreemen'))
		
		WebUI.click(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/button_Log In'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/a_v4.1 Interiors BP02'))
	}

	@When("User should click the download link")
	def User_should_click_the_download_link() {
		
		
		WebUI.click(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/a_Download'))
		WebUI.delay(5)
	}

	@When("User should navigate to agent authority page")
	def User_should_navigate_to_agent_authority_page() {

		WebUI.switchToWindowTitle('Confirmation of Agent\'s Authority | U.S. Green Building Council')
		
			}

	@When("User should click the download button")
	def User_should_click_the_download_button() {
		WebUI.click(findTestObject('Object Repository/DOWNLOAD TEST/Page_LEED Online/a_Download'))
		
	}

	@When("User should see the pdf link")
	def User_should_see_the_pdf_link() {
		WebUI.delay(2)
		WebUI.switchToWindowTitle('Confirmation of Agent\'s Authority Form | GBCI')
	}
	
	@When("User should click the pdf link")
	def User_should_click_the_pdf_link() {
		
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/agent autho/Page_Confirmation of Agents Authori/a_Confirmation-of-Agents-Autho'))
		
		
	}
	
	
	
	@Then("User should download pdf")
	def User_should_download_pdf(String status) {
	
	WebUI.click(findTestObject('Object Repository/agent autho/Page_Confirmation of Agents Authori/a_Confirmation-of-Agents-Autho'))
	
	WebUI.sendKeys(findTestObject('Object Repository/agent autho/Page_/embed_plugin'), Keys.chord(Keys.CONTROL,'s'))
	WebUI.delay(2)
	Robot r = new Robot()
	r.keyPress(KeyEvent.VK_ENTER)
	r.keyRelease(KeyEvent.VK_ENTER)
	}
	
	}

