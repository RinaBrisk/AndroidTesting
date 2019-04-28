package com.pages;

import android.support.test.espresso.contrib.NavigationViewActions;

import com.fastaccess.R;

public class SendFeedbackPage {

    public void openPage(){
        NavigationDrawer navigationDrawer = new NavigationDrawer();
        navigationDrawer.openPage();

        navigationDrawer.getMenuNav()
                .perform(NavigationViewActions.navigateTo(R.id.reportBug));
    }
}
