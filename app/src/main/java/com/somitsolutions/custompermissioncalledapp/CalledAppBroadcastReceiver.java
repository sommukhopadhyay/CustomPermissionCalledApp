package com.somitsolutions.custompermissioncalledapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by som on 21/11/15.
 */
public class CalledAppBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Its nice to receive the broadcast", Toast.LENGTH_LONG).show();
    }
}
