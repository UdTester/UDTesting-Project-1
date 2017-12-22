package AppiumPackage;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		//UD-Nexus_5X_API_27_x86
	//	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "UD-Nexus_5X_API_27_x86");
		//Nexus5X_API_27_x86
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5X_API_27_x86"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "ApiDemos-debug.apk");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		//cap.setCapability("newCommandTimeout", 120);
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("noReset", "false"); 
		cap.setCapability(MobileCapabilityType.FULL_RESET,"False");


//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://192.168.1.101:4723/wd/hub"), cap);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
		
	}

}
