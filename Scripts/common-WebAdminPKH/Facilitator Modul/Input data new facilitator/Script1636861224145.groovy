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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

//Date now = new Date()
//DateTime dateTime = new DateTime()
//
//Calendar calendar = Calendar.getInstance()
//
//calendar.setTime(now)
//
//int yearNow = calendar.get(Calendar.YEAR)
//
//int monthNow = calendar.get(Calendar.MONTH)
//
//int dayNow = calendar.get(Calendar.DAY_OF_MONTH)
//String dateNow = getCurrentDateTime('GMT+7','dd-MM-yyyy hh:mm:ss')
def timestamp = new Date().format('YYYY-MM-dd HH:mm:ss')
def emailRandom = (email + timestamp) + '@gmail.com'

WebUI.setText(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/input_Nama Fasilitator_user_fullname'), name.toString())

WebUI.setText(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/input_Email_user_email'), emailRandom)

//GlobalVariable.tempEmail

WebUI.selectOptionByLabel(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/select_AktifNonaktif'), status.toString(), 
    false)

WebUI.setText(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/input_Password_user_password'), password.toString())

WebUI.selectOptionByLabel(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/select_Pilih Provinsi'), provinsi.toString(), 
    false)

WebUI.selectOptionByLabel(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/select_Pilih KotaKabupaten'), kota.toString(), 
    false)

WebUI.selectOptionByLabel(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/select_Pilih Kecamatan'), kecamatan.toString(), 
    false)

WebUI.setText(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/textarea_Alamat Lengkap_user_address'), alamat.toString())

WebUI.uploadFile(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/div_Foto Profil_drop-zone'), 
	'H:/Fadil/Dojobox/PKHDojobox-Katalon/Data Files/FC_Internazionale_Milano_2021.svg.png')

WebUI.click(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/label_Gunakan alamat domisili diatas sebagai alamat penugasan'))

WebUI.click(findTestObject('WebAdminPKH/Page_Admin PKH/Tambah page/button_Simpan'))

WebUI.delay(3)

