package AppiumPackage;

import java.net.MalformedURLException;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GesturesDemo1 extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver  = (AndroidDriver<AndroidElement>) Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		TouchAction t = new TouchAction(driver);
		//Click
		//driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();

		//just Tap
		t.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")).perform();
		
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		// Log press on a web element, long press for 3 seconds and then release it
		t.press(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).waitAction(3000).release().perform();
		
		// validate the text value on the menu
		System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']").getText());
		
		
	}

}
