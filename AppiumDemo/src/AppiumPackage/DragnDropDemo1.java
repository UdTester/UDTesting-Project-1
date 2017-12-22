package AppiumPackage;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragnDropDemo1 extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver  = (AndroidDriver<AndroidElement>) Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();

		TouchAction t = new TouchAction(driver);
		
		WebElement d1 = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement d2 = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		
		t.longPress(d1).moveTo(d2).release().perform();
		
		//t.longPress(driver.findElementById("io.appium.android.apis:id/drag_dot_1")).moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_3")).release().perform();
		
	}
}
