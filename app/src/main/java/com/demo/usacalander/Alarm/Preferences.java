package com.demo.usacalander.Alarm;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.widget.RelativeLayout;

import com.demo.usacalander.AdAdmob;
import com.demo.usacalander.R;


public class Preferences extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.FullscreenAd_Counter(this);
    }
}
