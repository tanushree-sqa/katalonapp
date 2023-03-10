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

WebUI.callTestCase(findTestCase('PageModel/basic/tc_logIn'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'CashOut'
WebUI.callTestCase(findTestCase('tc_cashout/tc_CashOutSuccessful'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'MerchantPayment'
WebUI.callTestCase(findTestCase('tc_MerchantPayment/p_TransactionWithValidMerchant'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'SendMoney'
WebUI.callTestCase(findTestCase('tc_SendMoney/p_sendMoneyToValidUser'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('tc_fundTransfer/p_fundTransferWithValidAccount'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageModel/basic/tc_logOut'), [:], FailureHandling.CONTINUE_ON_FAILURE)

