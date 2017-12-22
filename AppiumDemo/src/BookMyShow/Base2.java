package BookMyShow;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base2 {
	
		@Test
		public void BookMyShow() throws MalformedURLException {
		File f = new File("src");
		File fs = new File(f, "bookMyShow-ucb.apk");
		DesiredCapabilities cap2 = new DesiredCapabilities();
		//UD-Nexus_5X_API_27_x86
		cap2.setCapability(MobileCapabilityType.DEVICE_NAME, "UD-Nexus_5X_API_27_x86");
		cap2.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0"); 
		cap2.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
		cap2.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "bookMyShow-ucb.apk");
		//cap2.setCapability("newCommandTimeout", 120);
		
		cap2.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap2.setCapability("noReset", "false"); 
		cap2.setCapability(MobileCapabilityType.FULL_RESET,"False");
		@SuppressWarnings("unused")
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap2);

		
		}
		
	}


