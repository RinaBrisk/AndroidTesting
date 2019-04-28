package com.pages;

import android.support.test.espresso.ViewInteraction;

import com.fastaccess.R;
import com.fastaccess.ui.modules.main.pullrequests.pager.MyPullsPagerMvp;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class NavigationDrawer {

    private ViewInteraction driverLayout;
    private ViewInteraction menuNav;

    public NavigationDrawer(){
        driverLayout = onView(withId(R.id.drawer));
        menuNav = onView(withId(R.id.mainNav));
    }

    public ViewInteraction getDriverLayout() {
        return driverLayout;
    }

    public ViewInteraction getMenuNav() {
        return menuNav;
    }
}
