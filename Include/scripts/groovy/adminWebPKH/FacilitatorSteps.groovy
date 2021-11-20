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
	def User_click_modul_facilitator_and_input_field_search_with_name(String email) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Click modul facilitator"), [ ('email') : email ], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see data list facilitator that have (.*) and (.*)")
	def User_should_see_data_list_facilitator_that_have_email(String name, String email) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Assert list facilitator by search name"), [ ('name') : name, ('email') : email ], FailureHandling.STOP_ON_FAILURE)
	}
	//see detail facil

	@When("click detail button")
	def click_detail_button() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Click detail button"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see data detail facilitator that have (.*) and (.*)")
	def User_should_see_data_detail_facilitator_that_have_name_and_email(String name, String email) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Assert detail page"), [ ('name') : name, ('email') : email ], FailureHandling.STOP_ON_FAILURE)
	}
	//add new facilitator


	@When("User click button tambah facilitator")
	def User_click_button_tambah_facilitator() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Click tambah button"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	def timestamp = new Date().format('YYYY-MM-dd HH:mm:ss')
	def final email = ('tes' + timestamp) + '@gmail.com'

	@When("Input data facilitator with (.*), (.*), (.*), (.*), (.*), (.*), (.*) then save")
	def Input_data_facilitator(String name, String status, String password, String provinsi, String kota, String kecamatan, String alamat) {

		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Input data new facilitator"),
				[ ('name') : name, ('email') : email, ('status') : status, ('password') : password, ('provinsi') : provinsi, ('kota') : kota, ('kecamatan') : kecamatan, ('alamat') : alamat ],
				FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see data success add new facilitator pop up")
	def User_should_see_data_success_add_new_facilitator_pop_up() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Assert success add facilitator"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	//edit new facilitator


	@When("User search new facilitator by (.*)")
	def User_search_new_facilitator(String email) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Search new facilitator"), ['email':email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Edit data facilitator with (.*), (.*), (.*), (.*), (.*), (.*), (.*) then save")
	def Edit_data_facilitator(String name, String status, String password, String provinsi, String kota, String kecamatan, String alamat) {

		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Edit data new facilitator"),
				[ ('name') : name, ('status') : status, ('password') : password, ('provinsi') : provinsi, ('kota') : kota, ('kecamatan') : kecamatan, ('alamat') : alamat ],
				FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see pop up success edit data")
	def User_should_see_pop_up_success_edit() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Facilitator Modul/Assert success edit facilitator"), [:], FailureHandling.STOP_ON_FAILURE)
	}
}