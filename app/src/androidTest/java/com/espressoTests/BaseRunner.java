package com.espressoTests;

import android.support.test.rule.ActivityTestRule;

import com.fastaccess.ui.modules.main.MainActivity;

import org.junit.Rule;

public class BaseRunner {

    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule
            = new ActivityTestRule<>(MainActivity.class);

}
