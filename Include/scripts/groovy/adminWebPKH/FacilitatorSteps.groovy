package adminWebPKH
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

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



class FacilitatorSteps {
	//see list facilitator

	@Given("User already on page facilitator")
	def User_already_on_page_facilitator() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Facilitator page loaded succesfully"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click modul facilitator and input field search with (.*)")
	def User_click_modul_facilitator_and_input_field_search_with_name(String name) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Click modul facilitator"), [ ('name') : name ], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see data list facilitator that have (.*) and (.*)")
	def User_should_see_data_list_facilitator_that_have_email(String name, String email) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Assert list facilitator by search name"), [ ('name') : name, ('email') : email ], FailureHandling.STOP_ON_FAILURE)
	}
}