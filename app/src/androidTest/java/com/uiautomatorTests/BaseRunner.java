//package com.uiautomatorTests;
//
//import androidx.test.platform.app.InstrumentationRegistry;
//import androidx.test.uiautomator.UiDevice;
//import androidx.test.uiautomator.UiObject;
//import androidx.test.uiautomator.UiObjectNotFoundException;
//import androidx.test.uiautomator.UiScrollable;
//import androidx.test.uiautomator.UiSelector;
//
//import org.junit.Before;
//
//import static junit.framework.Assert.assertTrue;
//
//public class BaseRunner {
//    public UiDevice device;
//
//    @Before
//    public void setUp() throws UiObjectNotFoundException {
//
//        // Initialize UiDevice instance
//        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
//        device.pressHome();
//
//        //нажать на кнопку "Apps"
//        UiObject allAppsButton = device.findObject(new UiSelector().descriptionContains("Apps"));
//        try {
//            allAppsButton.clickAndWaitForNewWindow();
//        } catch (Throwable targetException) {
//            allAppsButton = device.findObject(new UiSelector().descriptionContains("Приложения"));
//            allAppsButton.clickAndWaitForNewWindow();
//        }
//
//        try {
//            // Simulate a user swiping until they come to the FastHub Debug
//            UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
//            appViews.setAsHorizontalList();
//
//            UiObject fastHubDebugApp = appViews.getChildByText(new UiSelector()
//                    .className(android.widget.TextView.class.getName()), "FastHub Debug");
//            fastHubDebugApp.clickAndWaitForNewWindow();
//        } catch (Throwable targetException) {
//            UiObject swipeToFastHub = device.findObject(new UiSelector()
//                    .className("android.view.View"));
//            UiObject fastHub;
//            while ((fastHub = device.findObject(new UiSelector().text("FastHub Debug"))) == null) {
//                swipeToFastHub.swipeLeft(20);
//            }
//            fastHub.clickAndWaitForNewWindow();
//        }
//
//        // Validate that the package name is the expected one
//        UiObject fastHubDebugValidation = device.findObject(new UiSelector()
//                .packageName("com.fastaccess.github.debug"));
//        assertTrue("Unable to detect FastHub Debug",
//                fastHubDebugValidation.exists());
//    }
//
//}
