package com.elements;

import android.support.test.espresso.ViewInteraction;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.contrib.DrawerActions.open;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class NavigationDrawer {

    private ViewInteraction driverLayout;
    private ViewInteraction menuNav;

    public NavigationDrawer(){
        driverLayout = onView(withId(R.id.drawer));
        menuNav = onView(withId(R.id.mainNav));
    }

    public ViewInteraction getMenuNav() {
        return menuNav;
    }

    public void openPage(){
        driverLayout.perform(open());
    }
}