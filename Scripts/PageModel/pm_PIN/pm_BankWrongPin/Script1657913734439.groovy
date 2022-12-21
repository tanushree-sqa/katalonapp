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


Mobile.switchToNative()



Mobile.tap(findTestObject('Object Repository/or_baseRepo/wrongPin/android.widget.RelativeLayout'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/or_baseRepo/wrongPin/android.widget.Button - CONFIRM TRANSACTION'), 0)

Mobile.setText(findTestObject('Object Repository/or_baseRepo/wrongPin/android.widget.EditText (1)'), '1111', 0)

Mobile.tap(findTestObject('Object Repository/or_baseRepo/wrongPin/android.widget.Button - COMPLETE THE TRANSACTION'), 0)


Mobile.getText(findTestObject('Object Repository/or_fundTransfer/or_BankWrongPin/android.widget.TextView - Incorrect PIN If you have lost your PIN, please call 16733 for assistance'),
	0)
Mobile.comment('The text is correct')

Mobile.tap(findTestObject('Object Repository/or_fundTransfer/or_BankWrongPin/android.widget.LinearLayout'), 0)


Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()
//Mobile.pressBack()

