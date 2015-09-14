package com.mmadapps.titanwatchbluetoothconnect.beaconPoC;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.mmadapps.titanwatchbluetoothconnect.R;

public class BeaconPoCPreferencesFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	addPreferencesFromResource(R.xml.preferences);
    }

}
