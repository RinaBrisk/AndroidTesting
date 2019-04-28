package com.espressoTests;

import android.support.test.espresso.contrib.NavigationViewActions;
import android.support.test.espresso.contrib.ViewPagerActions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import com.fastaccess.App;
import com.fastaccess.R;
import com.fastaccess.data.dao.SettingsModel;
import com.fastaccess.helper.ViewHelper;
import com.pages.TrendingPage;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.contrib.DrawerActions.open;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.anything;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class OpeningTrendingTest extends BaseRunner{

    @Test
    public void openingTrending() {

        TrendingPage trendingPage = new TrendingPage();
        trendingPage.openPage();
        trendingPage.isOpened();
    }

    @Test
    public void changeTheme(){
        // Открыть меню
        onView(withId(R.id.drawer)) //driverLayout
                .perform(open());

        // Кликнуть на «Setting»
        onView(withId(R.id.mainNav)) //menuNav
                .perform(NavigationViewActions.navigateTo(R.id.settings));

        // Выбрать пункт «Theme»
        onData(anything()).inAdapterView(withId(R.id.settingsList)).atPosition(SettingsModel.THEME)
        .perform(click());

        // Свайпнуть вправо до 2й темы
        onView(withId(R.id.pager))
                .perform(ViewPagerActions.scrollRight());

        // Нажать на галочку ???
        onView(withId(R.id.apply))
                .perform(click());

        // Ожидаемый результат: тема сменираcь на черную ???
        int clor = ViewHelper.getPrimaryColor(App.getInstance().getBaseContext());
    }

  //  @Rule
  //  public IntentsTestRule<MainActivity> intentsTestRule =
   //         new IntentsTestRule<>(MainActivity.class);

    @Test
    public void restorePurchases(){
        // Открыть меню
        onView(withId(R.id.drawer)) //driverLayout
                .perform(open());

        // Кликнуть на «Restore Purchases»
        onView(withId(R.id.mainNav)) //menuNav
                .perform(NavigationViewActions.navigateTo(R.id.restorePurchase));

        // Ожидаемый результат: отправился Intent(activity, CheckPurchaseActivity::class.java) ??
        intended(toPackage("om.fastaccess.ui.modules.main.donation.CheckPurchaseActivity"));
    }

    @Test
    public void checkToast(){
        // Открыть меню
        onView(withId(R.id.drawer)) //driverLayout
                .perform(open());

        // Кликнуть на «Send feedback»
        onView(withId(R.id.mainNav)) //menuNav
                .perform(NavigationViewActions.navigateTo(R.id.reportBug));

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
