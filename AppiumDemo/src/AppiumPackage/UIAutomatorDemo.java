package AppiumPackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver  = (AndroidDriver<AndroidElement>) Capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Syntax: driver.findElementByAndroidUIAutomator("attribute(\"value\")");

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	//	int h = driver.findElementsByAndroidUIAutomator("new UISelector().clickable(true)").size();
	//System.out.println(driver.findElementsByAndroidUIAutomator("new UIselector().clickable(true)").size());
			

	int h = driver.findElementById("android:id/content").findElements(MobileBy.AndroidUIAutomator("new UiSelector().clickable(true)")).size();
	System.out.println(h);
	
	
//List<AndroidElement> textfeilds=driver.findElementsByAndroidUIAutomator("new Uiselector().className(\"android.widget.EditText\")");
//System.out.println(textfeilds.size());
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3D Transition\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Lyon\")").click();
		

		

	}

	}























