package com.pages;

import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.contrib.NavigationViewActions;

import com.elements.NavigationDrawer;
import com.fastaccess.R;
import com.fastaccess.data.dao.SettingsModel;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.anything;

public class SettingPage{

    private DataInteraction settingList;

    public SettingPage(){
        settingList = onData(anything()).inAdapterView(withId(R.id.settingsList));
    }

    public void openPage(){
        NavigationDrawer.getNavigationDrawer().openPage();

        NavigationDrawer.getNavigationDrawer().getMenuNav()
                .perform(NavigationViewActions.navigateTo(R.id.settings));
    }

    public void isSelectTheme(){
        settingList.atPosition(SettingsModel.THEME)
                .perform(click());
    }
}
