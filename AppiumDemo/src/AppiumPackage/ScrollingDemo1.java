package AppiumPackage;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class ScrollingDemo1 extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver  = (AndroidDriver<AndroidElement>) Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//TouchAction t = new TouchAction(driver);
driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0));");		
	}

}
