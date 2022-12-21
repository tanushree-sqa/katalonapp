package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object PackageIdTap
     
    /**
     * <p></p>
     */
    public static Object UserName
     
    /**
     * <p></p>
     */
    public static Object Pin
     
    /**
     * <p></p>
     */
    public static Object ValidUser
     
    /**
     * <p></p>
     */
    public static Object Merchant
     
    /**
     * <p></p>
     */
    public static Object Agent
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            G_Timeout = selectedVariables['G_Timeout']
            G_NotificationMessage = selectedVariables['G_NotificationMessage']
            G_AndroidApp = selectedVariables['G_AndroidApp']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            PackageIdTap = selectedVariables['PackageIdTap']
            UserName = selectedVariables['UserName']
            Pin = selectedVariables['Pin']
            ValidUser = selectedVariables['ValidUser']
            Merchant = selectedVariables['Merchant']
            Agent = selectedVariables['Agent']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
