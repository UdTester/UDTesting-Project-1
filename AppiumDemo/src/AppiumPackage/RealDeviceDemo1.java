package AppiumPackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDeviceDemo1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		//Nexus5X_API_27_x86
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5X_API_27_x86"); 
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "1.6.5"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("noReset", "false"); 
		cap.setCapability(MobileCapabilityType.FULL_RESET,"False");

		@SuppressWarnings("unused")
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		
	}

}
