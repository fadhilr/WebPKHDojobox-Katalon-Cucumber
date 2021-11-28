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

WebUI.verifyElementText(findTestObject('WebAdminPKH/Page_Admin PKH/Category page/Sub category page/h5_Ubah Sub Kategori'), 
    'Ubah Sub Kategori')

WebUI.selectOptionByLabel(findTestObject('WebAdminPKH/Page_Admin PKH/Category page/Sub category page/select_category_edit'), 
    category.toString(), false)

WebUI.setText(findTestObject('WebAdminPKH/Page_Admin PKH/Category page/Sub category page/input_Judul (Sub Category)_category_sub_title'), 
    judul.toString())

WebUI.click(findTestObject('WebAdminPKH/Page_Admin PKH/Category page/Sub category page/button_Simpan'))

