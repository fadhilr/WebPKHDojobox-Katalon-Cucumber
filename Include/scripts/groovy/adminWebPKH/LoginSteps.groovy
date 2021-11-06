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



class LoginSteps {
	@Given("User is on login page")
	def User_is_on_login_page() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Login/Login page is loaded successfully"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Input data (.*) and (.*)")
	def Input_data_username_and_password(String username, String password) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Login/Insert credentials and sign in"), [ ('username') : username, ('password') : password ], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can see admin page")
	def User_can_see_admin_page() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Login/Assert success login"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//negative scenario


	@When("Input data wrong (.*) with (.*)")
	def Input_data_wrong_username_with_password(String username, String password) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Login/Insert credentials and sign in"), [ ('username') : username, ('password') : password ], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can wrong credentials message")
	def User_can_wrong_credentials_message() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Login/Assert fail login"), [:], FailureHandling.STOP_ON_FAILURE)
	}

}