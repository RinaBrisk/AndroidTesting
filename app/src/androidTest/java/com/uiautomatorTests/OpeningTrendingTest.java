//package com.uiautomatorTests;
//
//import android.app.UiAutomation;
//import android.os.Build;
//import android.view.accessibility.AccessibilityEvent;
//
//import androidx.test.platform.app.InstrumentationRegistry;
//import androidx.test.uiautomator.UiObject;
//import androidx.test.uiautomator.UiObjectNotFoundException;
//import androidx.test.uiautomator.UiScrollable;
//import androidx.test.uiautomator.UiSelector;
//
//import junit.framework.Assert;
//import org.junit.Test;
//
//import static junit.framework.TestCase.assertTrue;
//import static org.junit.Assert.assertEquals;
//
//public class OpeningTrendingTest extends BaseRunner {
//
//    @Test
//    public void openingTrending() throws UiObjectNotFoundException {
//        //открыть меню
//        UiObject navButton = device.findObject(new UiSelector().descriptionContains("Navigate up"));
//        navButton.click();
//
//        //Кликнуть на «Trending»
//        UiObject trending = device.findObject(new UiSelector().text("Trending"));
//        trending.clickAndWaitForNewWindow();
//
//        //получение текста заголовка
//        UiObject trendingTitle = device.findObject(new UiSelector()
//                .resourceId("com.fastaccess.github.debug:id/drawer")
//                .instance(0)
//                .childSelector(new UiSelector()
//                        .className("android.widget.TextView")));
//
//        //Ожидаемый результат: открылось окно «Trending»
//        assertEquals("Trending", trendingTitle.getText());
//    }
//
//    @Test
//    public void changeOfTheme() throws UiObjectNotFoundException {
//        //открыть меню
//        UiObject navButton = device.findObject(new UiSelector().descriptionContains("Navigate up"));
//        navButton.click();
//
//        //Кликнуть на «Setting»
//        UiObject setting = device.findObject(new UiSelector().text("Settings"));
//        setting.clickAndWaitForNewWindow();
//
//        //Выбрать пункт «Theme»
//        UiObject theme = device.findObject(new UiSelector()
//                .className("android.widget.RelativeLayout")
//                .instance(0)
//                .childSelector(new UiSelector()
//                        .resourceId("com.fastaccess.github.debug:id/iconItemTitle")));
//        theme.clickAndWaitForNewWindow();
//
//        //Свайпнуть вправо до 2й темы
//        UiObject swipeToBlackTheme = device.findObject(new UiSelector()
//                .resourceId("com.fastaccess.github.debug:id/pager"));
//        swipeToBlackTheme.swipeLeft(20);
//
//        // Нажать на галочку
//        UiObject button = device.findObject(new UiSelector()
//                .resourceId("com.fastaccess.github.debug:id/apply"));
//        button.clickAndWaitForNewWindow();
//
//        // Ожидаемый результат: тема сменилась на черную
//        UiObject frameLayout = device.findObject(new UiSelector()
//                .className("android.widget.FrameLayout"));
//
//    }
//
//    @Test
//    public void restorePurchasesTest() throws UiObjectNotFoundException {
//        //Открыть меню
//        UiObject navButton = device.findObject(new UiSelector().descriptionContains("Navigate up"));
//        navButton.click();
//
//        //Кликнуть на «Restore Purchases»
//        UiScrollable recyclerViewMenu = new UiScrollable(new UiSelector().resourceId("com.fastaccess.github.debug:id/design_navigation_view"));
//        recyclerViewMenu.scrollTextIntoView("Restore Purchases");
//        UiObject restorePurchases = device.findObject(new UiSelector().text("Restore Purchases"));
//        restorePurchases.click();
//
//        //Ожидаемый результат: отправился Intent(activity, CheckPurchaseActivity::class.java)
//    }
//
//    @Test
//    public void checkToast() throws UiObjectNotFoundException {
////        Открыть меню
//        UiObject navButton = device.findObject(new UiSelector().descriptionContains("Navigate up"));
//        navButton.click();
//
////        Кликнуть на «Send feedback»
//        UiScrollable recyclerViewMenu = new UiScrollable(new UiSelector().resourceId("com.fastaccess.github.debug:id/design_navigation_view"));
//        recyclerViewMenu.scrollTextIntoView("Send feedback");
//        UiObject restorePurchases = device.findObject(new UiSelector().text("Send feedback"));
//        restorePurchases.click();
//
//        UiObject okButton = device.findObject(new UiSelector().resourceId("android:id/button1"));
//        okButton.click();
//
////        Ввести «hello» в поле Title
//        UiObject title = device.findObject(new UiSelector().className("android.widget.EditText"));
//        title.setText("hello");
////        Нажать на Description
//        UiObject description = device.findObject(new UiSelector().resourceId("com.fastaccess.github.debug:id/description"));
//        description.clickAndWaitForNewWindow();
//
////        Проверить правильное отображение «Device Information» для конкретной модели телефона
//        UiObject deviceInfo = device.findObject(new UiSelector().resourceId("com.fastaccess.github.debug:id/editText"));
//        String info = deviceInfo.getText();
//        assertTrue(info.contains(Build.MANUFACTURER));
//        assertTrue(info.contains(Build.BRAND));
//
////        Нажать FAB
//        UiObject acceptButton = device.findObject(new UiSelector().resourceId("com.fastaccess.github.debug:id/submit"));
//        acceptButton.click();
//
//        UiObject submitButton = device.findObject(new UiSelector().className("android.widget.ImageButton").resourceId("com.fastaccess.github.debug:id/submit"));
//        submitButton.click();
//
////        Ожидаемый результат: Появился Toast с текстом «Сообщение отправлено»
//
//        UiAutomation uiAutomation = InstrumentationRegistry.getInstrumentation().getUiAutomation();
//        uiAutomation.setOnAccessibilityEventListener(event -> {
//            Assert.assertEquals(event.getEventType(), AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED);
//            // if(event.getEventType() == AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED){
//           // String msg = "Message was sent";
//           // Assert.assertEquals(msg, getMessage(event));
//            //  }
//        });
//    }
//
////    private String getMessage(AccessibilityEvent event) {
////        String message = null;
////        Parcelable parcelable = event.getParcelableData();
////        if (!(parcelable instanceof Notification)) {
////            message = (String) event.getText().get(0);
////        }
////        return message;
////    }
//
//    public void appearance() throws UiObjectNotFoundException {
////        Открыть меню
//        UiObject navButton = device.findObject(new UiSelector().descriptionContains("Navigate up"));
//        navButton.click();
//
////        Кликнуть на «About»
//        UiScrollable recyclerViewMenu = new UiScrollable(new UiSelector().resourceId("com.fastaccess.github.debug:id/design_navigation_view"));
//        recyclerViewMenu.scrollTextIntoView("About");
//        UiObject restorePurchases = device.findObject(new UiSelector().text("About"));
//        restorePurchases.click();
//
////        Прокрутить до блока «About»
//        UiScrollable scrollToAbout = new UiScrollable(new UiSelector().resourceId("com.fastaccess.github.debug:id/mal_recyclerview"));
//        scrollToAbout.scrollTextIntoView("About");
//       // UiObject about = device.findObject(new UiSelector().text());
//       // restorePurchases.click();
//
//
//        //можем только текст получить. а картинку никак.
//        //по индексу 1 убеждаемся, что на второй позиции. затем сравниваем текст
//        //
////        Ожидаемый результат: На второй позиции отображается текст «Changelog». Иконка R.drawable.ic_track_changes
//    }
//}
//
