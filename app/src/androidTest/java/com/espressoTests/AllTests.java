package com.espressoTests;

import android.support.test.espresso.contrib.NavigationViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import com.fastaccess.App;
import com.fastaccess.R;
import com.elements.NavigationDrawer;
import com.fastaccess.helper.PrefGetter;
import com.fastaccess.helper.ViewHelper;
import com.pages.SendFeedbackPage;
import com.pages.SettingPage;
import com.pages.ThemePage;
import com.pages.TrendingPage;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AllTests extends BaseRunner{

    @Test
    public void openingTrending() {

        TrendingPage trendingPage = new TrendingPage();
        trendingPage.openPage();
        trendingPage.isOpened();
    }

    @Test
    public void changeTheme(){

        SettingPage settingPage = new SettingPage();
        settingPage.openPage();
        settingPage.isSelectTheme();

        ThemePage themePage = new ThemePage();
        themePage.selectGreyTheme();
        themePage.checkGreyTheme();
    }

    @Test
    public void restorePurchases(){
        NavigationDrawer.getNavigationDrawer().openPage();
        NavigationDrawer.getNavigationDrawer().getMenuNav()
                .perform(NavigationViewActions.navigateTo(R.id.restorePurchase));

        // Ожидаемый результат: отправился Intent(activity, CheckPurchaseActivity::class.java) ??
        // intended(toPackage("om.fastaccess.ui.modules.main.donation.CheckPurchaseActivity"));
    }

    @Test
    public void checkToast(){
        SendFeedbackPage sendFeedbackPage = new SendFeedbackPage();
        sendFeedbackPage.openPage();

        //onView(withId(R.id.button))
        //        .perform(click());

        // Ввести «hello» в поле Title
        onView(withId(R.id.title))
                .perform(typeText("hello"));

        // Нажать на Description
        onView(withId(R.id.description))
                .perform(click());

        // Проверить правильное отображение «Device Information» для конкретной модели телефона

        // Нажать FAB
        // Ожидаемый результат: Появился Toast с текстом «Сообщение отправлено»
    }

    @Test
    public void appearance(){
        // Открыть меню
        // Кликнуть на «About»
        // Прокрутить до блока «About»
        // Ожидаемый результат: На второй позиции отображается текст «Changelog». Иконка R.drawable.ic_track_changes
    }
}
