package AppiumPackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// The data type of the driver must be same as the base method's
			
	AndroidDriver<AndroidElement> driver  = (AndroidDriver<AndroidElement>) Capabilities();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	driver.findElementById("android:id/checkbox").click();
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	driver.findElementByClassName("android.widget.EditText").sendKeys("hellos");
	
	driver.findElementsByClassName("android.widget.Button").get(1).click();
	//driver.findElementById("android:id/button1").click();
	
	}
}



























