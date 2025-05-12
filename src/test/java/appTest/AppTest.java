package appTest;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.AndroidKey;


public class AppTest {
    //static AppiumDriver driver;
    static AndroidDriver driver;
    // static AndroidDriver<MobileElement> driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        openmobileapp();
        System.out.println("Application Launched Successfulyy");
    }

    public static void openmobileapp() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();

//         options.setAppPackage("org.simple.clinic.staging");
        options.setAppPackage("com.chataak.app");
        //org.simple.clinic.main.SetupActivity
//       options.setAppActivity("org.simple.clinic.setup.SetupActivity");
        options.setAppActivity("com.chataak.app.MainActivity");

        options.setAutoGrantPermissions(true);
//        options.setDeviceName("sdk_gphone64_x86_64");
//        options.setUdid("emulator-5554");
//        options.setPlatformName("Android");
//        options.setPlatformVersion("14");


//        //for the real device
        options.setDeviceName("realme C3");
        options.setUdid("YSBEC689H6W8EM9H");
        options.setPlatformName("Android");
        options.setPlatformVersion("11");
        options.setIgnoreHiddenApiPolicyError(true);
        //options.setNoReset(true);
        options.setNoReset(true);
        //capabilities.setCapability("newCommandTimeout", 300);
        options.setCapability("newCommandtimeout", 300);


// Set adbExecTimeout in milliseconds (60 seconds here)
        options.setCapability("adbExecTimeout", 60000);
        URL url = new URL("http://127.0.0.1:4723/");


        // Clear app cache before launching
        clearAppCache("com.chataak.app");

        // driver = new AndroidDriver(url, options);
        driver = new AndroidDriver(url, options);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for first image/button and click (try only once, not three times)
        WebElement firstActionButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.ImageView[2]")));
        firstActionButton.click();


        // Wait for first image/button and click (try only once, not three times)
        WebElement secondActionButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.ImageView[2]")));
        secondActionButton.click();

        // Wait for first image/button and click (try only once, not three times)
        WebElement thirdActionButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.ImageView[2]")));
        thirdActionButton.click();


        // Wait and enter mobile number
        WebElement mobileInputField = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.widget.ImageView"))); // Adjust if this is incorrect
        mobileInputField.click();  // If necessary
        mobileInputField.sendKeys("8105914136");

        // Click on "Continue"
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.Button[@content-desc='Continue']")));
        continueButton.click();


        Thread.sleep(5000);

        WebElement otpPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//android.widget.EditText")));

        if (otpPage.isDisplayed()) {
            otpPage.click();
        } else {
            System.out.println("Element is Not Present");
        }

        // 141,741

        // 1️⃣ Tap using coordinates (replace x and y with actual values)
//        int x = 205;  // your x-coordinate
//        int y = 1090;  // your y-coordinate

        int x = 141;  // your x-coordinate
        int y = 741;  // your y-coordinate

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(tap));
//
//        Thread.sleep(3000); // wait for UI transition

// Cast driver to AndroidDriver
//        AndroidDriver driver = (AndroidDriver) this.driver;


// Input 1 2 3 4 5 using AndroidKey
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));


// Click on "verify Button"
        WebElement verifyButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.Button[@content-desc=\'Verify\']")));
        verifyButton.click();


        WebElement showStores = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\'Show Stores\']")));
        showStores.click();

        WebElement searchStoreTextbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
        searchStoreTextbox.click();
        searchStoreTextbox.click();
        searchStoreTextbox.sendKeys("pre");

        WebElement PreranaStoreBallary = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\'Prerana motors ballari (Bellary)\']")));
        PreranaStoreBallary.click();


        WebElement scanner = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//android.widget.ImageView)[last()-1]")));
        scanner.click();

        Thread.sleep(4000);

        WebElement increase = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View[12]")));

        for (int i = 1; i < 20; i++) { // starting from 1, click 19 times
            increase.click();
            Thread.sleep(300); // optional: small delay between clicks to avoid app lag
        }

        WebElement addtocartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\'Add to Cart\']")));
        addtocartButton.click();

        WebElement buynowButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\'Buy Now\']")));
        buynowButton.click();
//
//        WebElement singleRadioButton = wait
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadioButton[1]")));
//        singleRadioButton.click();

        // Wait for the radio buttons to be present
        List<WebElement> radioButtons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.xpath("//android.widget.RadioButton"))
        );

// Debug: Print the size of the list to see if it's empty
        System.out.println("Radio buttons found: " + radioButtons.size());

        if (!radioButtons.isEmpty()) {
            // Generate a random index between 0 and size-1
            int randomIndex = new Random().nextInt(radioButtons.size());

            // Click the randomly selected radio button
            radioButtons.get(randomIndex).click();
            System.out.println("Random radio button clicked.");
        } else {
            System.out.println("No radio buttons found.");
        }


        WebElement proceedtopayButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\'Proceed to Pay\']")));
        proceedtopayButton.click();


        WebElement gobacktohomeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\'Go back to Home\']")));
        gobacktohomeButton.click();

//            Thread.sleep(3000);
//            WebElement profile=driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\'android:id/content\']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View"));
//            profile.click();

        WebElement profileicon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\'android:id/content\']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View")));
        profileicon.click();

        WebElement myordersSideMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@content-desc=\'My Orders\']")));
        myordersSideMenu.click();

        // Wait for all items with 'Bought on' in content-desc
        List<WebElement> orderList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.xpath("//android.view.View[contains(@content-desc, 'Bought on')]"))
        );

// Print all order details
        System.out.println("Total orders found: " + orderList.size());
        for (WebElement order : orderList) {
            System.out.println("Order Details: " + order.getAttribute("content-desc"));
        }

// Click the first item if the list is not empty
        if (!orderList.isEmpty()) {
            orderList.get(0).click();
            System.out.println("Clicked the first order.");
        } else {
            System.out.println("No orders found.");
        }

        WebElement orderDetailspageBackButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\'android:id/content\']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView")));
        orderDetailspageBackButton.click();

        WebElement myorderspagebackButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\'android:id/content\']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView")));
        myorderspagebackButton.click();

        profileicon.click();



//        WebElement downloadInvoice = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//android.widget.ImageView[@content-desc=\'Download Invoice  \']")
//        ));
//        downloadInvoice.click();
//
//        Thread.sleep(5000); // Adjust based on download time
//
//
//// Step 2: Wait for the file to download
//        Thread.sleep(5000); // Adjust if needed
//
//// Step 3: Get the latest .pdf file from device using adb
//        String latestPdf = null;
//        try {
//            Process listFiles = Runtime.getRuntime().exec("adb shell ls -t /sdcard/Download");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(listFiles.getInputStream()));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                if (line.trim().endsWith(".pdf")) {
//                    latestPdf = line.trim(); // First PDF in -t order is the latest
//                    break;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//// Step 4: Pull the latest PDF file to project directory
//        if (latestPdf != null) {
//            String deviceFilePath = "/sdcard/Download/" + latestPdf;
//            String localDirectory = System.getProperty("user.dir") + "/downloads/";
//            String localFilePath = localDirectory + latestPdf;
//
//            File folder = new File(localDirectory);
//            if (!folder.exists()) folder.mkdir();
//
//            try {
//                Process pullFile = Runtime.getRuntime().exec("adb pull " + deviceFilePath + " " + localFilePath);
//                pullFile.waitFor();
//                System.out.println("Downloaded invoice: " + localFilePath);
//            } catch (IOException | InterruptedException e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println("No PDF invoice found in device's Download folder.");
//        }
//
//        WebElement chrome = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.ImageView[@resource-id=\'oplus:id/resolver_item_icon\'])[1]")));
//        chrome.click();
//
//       WebElement download=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id=\'com.android.chrome:id/positive_button\']")));
//        download.click();
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\'Logout\']")));
        logoutButton.click();
//
//        // Your test steps...
//        Thread.sleep(3000);

        // Close the app at the end
        closeApp();


    }


    public static void clearAppCache(String packageName) {
        try {
            // Make sure the driver is initialized before executing ADB commands
            if (driver != null) {
                driver.executeScript("mobile: shell", ImmutableMap.of("command", "pm clear " + packageName));
                System.out.println("Cache cleared for app: " + packageName);
            } else {
                System.out.println("Driver is not initialized, skipping cache clear.");
            }
        } catch (Exception e) {
            System.out.println("Error clearing app cache: " + e.getMessage());
        }
    }


    public static void closeApp() {
        try {
            // Execute ADB command to force-stop the app
            driver.executeScript("mobile: shell", ImmutableMap.of("command", "am force-stop " + "com.chataak.app"));
            System.out.println("Application Force Stopped Successfully");
        } catch (Exception e) {
            System.out.println("Error stopping the app: " + e.getMessage());
        } finally {
            // Quit the driver session
            driver.quit();
        }
    }


}

//
/// /import io.appium.java_client.AppiumDriver;
/// /import io.appium.java_client.android.AndroidDriver;
/// /import io.appium.java_client.android.options.UiAutomator2Options;
/// /import org.junit.jupiter.api.Test;
/// /
/// /import java.net.MalformedURLException;
/// /import java.net.URL;
/// /import static org.junit.jupiter.api.Assertions.assertNotNull;
/// /
/// /public class AppTest {
/// /    static AppiumDriver driver;
/// /
/// /    @Test
/// /    public void openMobileApp() throws MalformedURLException {
/// /        // Launch the app
/// /        driver = launchApp();
/// /        assertNotNull(driver, "The driver should be initialized and not null");
/// /        System.out.println("Application Launched Successfully");
/// /    }
/// /
/// /    public AppiumDriver launchApp() throws MalformedURLException {
/// /        UiAutomator2Options options = new UiAutomator2Options();
/// /        options.setAppPackage("org.simple.clinic.staging");  // Use your app package
/// /        options.setAppActivity("org.simple.clinic.setup.SetupActivity");  // Use your app activity
/// /        options.setAutoGrantPermissions(true);
/// /        options.setDeviceName("sdk_gphone64_x86_64");
/// /        options.setUdid("emulator-5554");
/// /        options.setPlatformName("Android");
/// /        options.setPlatformVersion("14");
/// /        options.setCapability("adbExecTimeout", 60000);  // Set timeout
/// /
/// /        URL url = new URL("http://127.0.0.1:4723/");  // Appium server URL
/// /        return new AndroidDriver(url, options);
/// /    }
/// /}
