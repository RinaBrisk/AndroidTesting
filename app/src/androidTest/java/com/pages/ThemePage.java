package com.pages;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.ViewPagerActions;

import com.fastaccess.R;
import com.fastaccess.helper.PrefGetter;
import com.matcher.ElementMatcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.fastaccess.helper.PrefGetter.AMLOD;
import static com.fastaccess.helper.PrefGetter.BLUISH;
import static com.fastaccess.helper.PrefGetter.DARK;
import static com.fastaccess.helper.PrefGetter.LIGHT;
import static com.fastaccess.helper.PrefGetter.MID_NIGHT_BLUE;
import static org.junit.Assert.assertEquals;

public class ThemePage {

    private ViewInteraction themePager;
    private ViewInteraction applyButton;

    public ThemePage(){
        themePager = onView(withId(R.id.pager));
        applyButton = onView(ElementMatcher.getElementFromMatchAtPosition(withId(R.id.apply), 1));
    }

    public void selectGreyTheme(){
        themePager.perform(ViewPagerActions.scrollToPage(1));
        applyButton.perform(click());
    }

    public void selectWhiteTheme(){
        themePager.perform(ViewPagerActions.scrollToPage(0));
        applyButton.perform(click());
    }

    public void checkGreyTheme(){
        assertEquals(PrefGetter.getThemeType(), DARK);
    }
}
