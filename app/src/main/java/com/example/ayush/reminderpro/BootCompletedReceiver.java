package com.example.ayush.reminderpro;

/**
 * Created by Ayush on 25-03-2017.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompletedReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        new AlarmListAdapter(context);
    }
}


