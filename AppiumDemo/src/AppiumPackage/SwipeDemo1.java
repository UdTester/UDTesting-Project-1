package AppiumPackage;

import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo1 extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver  = (AndroidDriver<AndroidElement>) Capabilities();
		
		//syntax: ("attribute(\"value\")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();

		driver.findElementByAccessibilityId("4").click();
		
		TouchAction t1 = new TouchAction(driver);
		// swipe from 15 to 40
t1.press(driver.findElementByAccessibilityId("15")).waitAction(2000).moveTo(driver.findElementByAccessibilityId("40")).release().perform();
		
		
	}

}
