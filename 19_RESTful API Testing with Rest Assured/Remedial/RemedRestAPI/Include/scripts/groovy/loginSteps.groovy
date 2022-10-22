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



class loginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Navigate to dasboard page")
	def NavigateToDasboardPage() {
		println("\n I am inside to dasboard");
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://www.bhinneka.com/')
	}

	@When("User click button login")
	def UserClickButtonLogin() {
		println ("\n I am inside enterDataLoginUSer")
		WebUI.setText(findTestObject('Login/block.txt'))
		WebUI.setText(findTestObject('Login/buttonLogin.txt'))
	}

	@And("User enter email (.*)")
	def UserEnterEmail(String email) {
		println ("Email : "+email) 
		WebUI.setText(findTestObject('Login/Page_Login/input_Silakan masuk ke akun Anda_email'), email)
	}

	@And("User click button selanjutnya")
	def UserClickButtonSelanjutnya() {
		WebUI.setText(findTestObject('Login/Page_Login/button_Selanjutnya'), next)
	}

	@And("User enter password (.*)")
	def UserEnterPassword(String password) {
		println ("Password : "+password)
		WebUI.setText(findTestObject('Login/Page_Login/input_Akun Personal_password'), password)
	}

	@Then("Click button Masuk")
	def ClickButtonMasuk() {
		WebUI.setText(findTestObject('Login/Page_Login/button_MASUK'), masuk)
	}
}