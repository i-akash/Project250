package sakkhat.com.p250.broadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import sakkhat.com.p250.services.FloatingWidget;

/**
 * Created by hp on 05-Oct-18.
 */

public class ServiceStopper extends BroadcastReceiver {

    public ServiceStopper(){

    }
    public void onReceive(Context context, Intent intent){
        String tag = intent.getExtras().getString("tag");
        Log.d(tag, "stopping");
        context.stopService(new Intent(context, FloatingWidget.class));
        Log.d(tag,"service closed");
    }
}
