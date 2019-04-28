package com.pages;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.ViewPagerActions;

import com.fastaccess.App;
import com.fastaccess.R;
import com.fastaccess.helper.ViewHelper;
import com.matcher.ElementMatcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

public class ThemePage {

    private ViewInteraction themePager;
    private ViewInteraction applyButton;

    public ThemePage()
    {
        themePager = onView(withId(R.id.pager));
        applyButton = onView(ElementMatcher.getElementFromMatchAtPosition(withId(R.id.apply), 1));
    }

    public void selectGreyTheme(){
        themePager.perform(ViewPagerActions.scrollRight());
        applyButton.perform(click());
    }

    public void selectWhiteTheme(){
        themePager.perform(ViewPagerActions.scrollLeft());
        applyButton.perform(click());
    }

    public void checkGreyTheme(){
        //цвет определяется неверно, нужно изменить код
        int greyColor = -3355444;  //hex = #333334 - серый
        assertEquals(ViewHelper.getPrimaryColor(App.getInstance().getBaseContext()), greyColor);
    }
}
