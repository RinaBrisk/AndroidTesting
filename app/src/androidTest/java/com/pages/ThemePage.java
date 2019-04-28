package com.pages;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.ViewPagerActions;

import com.fastaccess.App;
import com.fastaccess.R;
import com.fastaccess.helper.ViewHelper;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class ThemePage {

    private ViewInteraction themePager;

    public ThemePage(){
        themePager = onView(withId(R.id.pager));
    }

    public void selectGreyTheme(){
        themePager.perform(ViewPagerActions.scrollRight());
        onView(withId(R.id.apply))
                .perform(click());
        //добавить проверку на цвет фона, так определять цвет темы
    }

    public void checkGreyTheme(){
       // int color = ViewHelper.getPrimaryColor(App.getInstance().getBaseContext());
    }
}
