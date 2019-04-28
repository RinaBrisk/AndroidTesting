package com.pages;

import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.NavigationViewActions;

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

        NavigationDrawer navigationDrawer = new NavigationDrawer();
        navigationDrawer.openPage();

        navigationDrawer.getMenuNav()
                .perform(NavigationViewActions.navigateTo(R.id.settings));
    }

    public void isSelectTheme(){
        settingList.atPosition(SettingsModel.THEME)
                .perform(click());
    }
}
