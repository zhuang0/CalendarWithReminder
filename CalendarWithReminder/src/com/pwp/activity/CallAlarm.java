package com.pwp.activity;

import android.content.BroadcastReceiver; 
import android.content.Context; 
import android.content.Intent; 
  
public class CallAlarm extends BroadcastReceiver { 
    @Override
    public void onReceive(Context context, Intent intent) { 
    	String content=intent.getExtras().getString("content");
    	intent.putExtra("content", content);
    	intent.putExtra("time", intent.getExtras().getLong("time"));
        intent.setClass(context,AlarmAlert.class); 
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
        context.startActivity(intent); 
    } 
}
