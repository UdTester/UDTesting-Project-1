package AppiumPackage;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Misc1 extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver  = (AndroidDriver<AndroidElement>) Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		System.out.println(driver.currentActivity());
		System.out.println(driver.getOrientation());
		System.out.println(driver.getContext());
		System.out.println(driver.isLocked());
	//	driver.hideKeyboard();
		//driver.pressKeyCode(AndroidKeyCode.HOME);
		driver.pressKeyCode(AndroidKeyCode.BACK);

		
	
		

		
	}

}
