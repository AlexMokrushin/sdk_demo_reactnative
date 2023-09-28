package com.cuelive.rn.demo;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

import com.cueaudio.live.CUEActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

class RCTCUELiveModule extends ReactContextBaseJavaModule {

    RCTCUELiveModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "CUELive";
    }

    @ReactMethod
    public void launchLightShowGUI() {
        final Context context = getCurrentActivity();
        if (context == null) {
            return;
        }

        final Intent i = new Intent(context, CUEActivity.class);
        context.startActivity(i);
    }
}