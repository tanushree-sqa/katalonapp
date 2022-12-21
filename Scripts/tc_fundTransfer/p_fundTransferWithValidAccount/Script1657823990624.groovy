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

WebUI.callTestCase(findTestCase('PageModel/basic/tc_logIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageModel/pm_Features/Bank/Transfer/Teansfer_EBL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('tc_fundTransfer/btc_FundTransferToNew'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/or_fundTransfer/NewValidAc/android.widget.EditText - Enter Bank Account Number (1)'), 
    '1041440464658', 0)

Mobile.setText(findTestObject('Object Repository/or_fundTransfer/NewValidAc/android.widget.EditText - Enter Account Holder Name'), 
    'Tanushree', 0)

Mobile.tap(findTestObject('or_fundTransfer/NewValidAc/android.widget.Button - NEXT'), 0)

WebUI.callTestCase(findTestCase('PageModel/pm_InputAmount/pm_ValidAmount'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageModel/pm_ConformationPage/pm_conformationPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageModel/pm_PIN/pm_ValidPIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageModel/pm_Success/pm_TrxSuccessResponse'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageModel/basic/tc_Back5'), [:], FailureHandling.CONTINUE_ON_FAILURE)

