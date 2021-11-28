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

class CategorySteps {

	//see list category

	@Given("User already on page category")
	def User_already_on_page_category() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Category page loaded succesfully"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click modul category and input field search with (.*)")
	def User_click_modul_category_and_input_field_search_with_title(String title) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Click modul category"), [ ('title') : title ], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see data list category that have (.*)")
	def User_should_see_title(String title) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Assert list category by title"), [ ('title') : title ], FailureHandling.STOP_ON_FAILURE)
	}
	//add main category

	@When("User click button tambah category")
	def User_click_tambah_category() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Click tambah main category"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Input main category with (.*), (.*), (.*) and save")
	def Input_main_category(String icon, String judul, String deskripsi) {
		def timestamp = new Date().format('YYYY-MM-dd HH:mm:ss')
		judul = judul+' '+timestamp

		GlobalVariable.tempMainCat = judul

		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Input main category"), [('icon'): icon, ('judul'): judul,('deskripsi'): deskripsi], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Pop up success add main category appear")
	def Popup_success_appear() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Assert success add main category"), [ : ], FailureHandling.STOP_ON_FAILURE)
	}

	//	//edit new category

	@When("User click button edit category")
	def Click_edit_category() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Click edit main category"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Edit main category with (.*), (.*), (.*) and save")
	def Edit_main_category(String icon, String judul, String deskripsi) {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Edit main category"),
				[ ('icon'): icon, ('judul'): judul,('deskripsi'): deskripsi],
				FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Pop up success edit main category appear")
	def User_should_see_pop_up_success_edit() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Assert success edit main category"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//add sub category

	@When("User click button tambah sub category")
	def User_click_tambah_sub_category() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Click tambah sub category"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Input sub category with (.*), (.*) and save")
	def Input_sub_category(String category, String judul) {
		def timestamp = new Date().format('YYYY-MM-dd HH:mm:ss')
		judul = judul+' '+timestamp

		GlobalVariable.tempSubCat = judul

		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Input sub category"), [('category'): category, ('judul'): judul], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see data success add new sub category pop up")
	def Popup_success_add_sub_category_appear() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Assert success add sub category"), [ : ], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("See new sub category (.*) in list sub category")
	def Assert_can_see_sub_category_in_list(String judul) {
		judul = GlobalVariable.tempSubCat
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Assert succes add sub category search by title"), [ ('judul'): judul ], FailureHandling.STOP_ON_FAILURE)
	}

	//edit new sub category

	@When("User click button edit sub category")
	def Click_edit_sub_category() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Click edit sub category"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Edit sub category with (.*), (.*) and save")
	def Edit_sub_category(String category, String judul) {
		def timestamp = new Date().format('YYYY-MM-dd HH:mm:ss')
		judul = judul+' '+timestamp

		GlobalVariable.tempSubCat = judul
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Edit sub category"),
				[ ('category'): category, ('judul'): judul],
				FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see data success edit new sub category pop up")
	def success_edit_sub_category() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Assert success edit sub category"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	//delete sub category
	
	@When("User click button delete new sub category")
	def Delete_sub_category() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Click delete sub category"),
				[ :],
				FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see success delete new sub category pop up")
	def success_delete_sub_category() {
		WebUI.callTestCase(findTestCase("Test Cases/common-WebAdminPKH/Category modul/Assert success delete sub category"), [:], FailureHandling.STOP_ON_FAILURE)
	}
}