package com.sms_listener;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.centaurwarchief.smslistener.SmsListenerPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

//import com.rhaker.reactnativesmsandroid.RNSmsAndroidPackage;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      Log.d("MainApplication", "getUseDeveloperSupport");
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      Log.d("MainApplication", "getPackages");
      return Arrays.<ReactPackage>asList(
          //new RNSmsAndroidPackage(),
          new MainReactPackage(),
            new SmsListenerPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    Log.d("MainApplication", "getReactNativeHost");
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    Log.d("MainApplication", "onCreate");
    SoLoader.init(this, /* native exopackage */ false);
  }

}
