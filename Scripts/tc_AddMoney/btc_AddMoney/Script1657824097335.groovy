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

//WebUI.callTestCase(findTestCase('PageModel/basic/tc_logIn'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/AddMoney/MTB_AddMoneyRedurectrion/android.widget.TextView - Add Money'), 0)

Mobile.tap(findTestObject('Object Repository/AddMoney/MTB_AddMoneyRedurectrion/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/AddMoney/MTB_AddMoneyRedurectrion/android.widget.ImageView (1)'), 0)

//WebUI.callTestCase(findTestCase('PageModel/pm_InputAmount/pm_ValidAmount'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.switchToNative()
//
//Mobile.tap(findTestObject('Object Repository/AddMoney/MTB_AddMoneyRedurectrion/android.widget.Button - Confirm'), 0)
//
//WebUI.callTestCase(findTestCase('PageModel/basic/tc_Back3'), [:], FailureHandling.STOP_ON_FAILURE)

