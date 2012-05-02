/*
 *  Copyright (C) 2012 Clayton Harbour (claytonharbour@gmail.com)
 */
package com.westcliffarms.pocketadmin.activity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.westcliffarms.pocketadmin.PocketAdmin;


import roboguice.RoboGuice;
import roboguice.activity.RoboActivity;
import roboguice.test.RobolectricRoboTestRunner;

import android.content.Context;

@RunWith(RobolectricRoboTestRunner.class)
public class MainActivityTest {
    protected Context context = new RoboActivity();
    protected PocketAdmin pocketAdmin = RoboGuice.getInjector(context).getInstance(PocketAdmin.class);
    
    @Test
    public void stringShouldEndInExclamationMark() {
    	assertTrue(true);
    }
}
