package com.pages;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.NavigationViewActions;

import com.elements.NavigationDrawer;
import com.fastaccess.R;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class TrendingPage {

    private ViewInteraction trendingFragment;

    public TrendingPage(){
        trendingFragment = onView(withId(R.id.trendingFragment));
    }

    public void openPage(){

        NavigationDrawer navigationDrawer = new NavigationDrawer();
        navigationDrawer.openPage();

        navigationDrawer.getMenuNav()
                .perform(NavigationViewActions.navigateTo(R.id.trending));
    }

    public void isOpened(){
         trendingFragment
                 .check(matches(isDisplayed()));
    }
}
