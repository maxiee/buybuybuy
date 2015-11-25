package com.maxiee.buybuybuy;

import android.app.Application;

import com.maxiee.buybuybuy.injector.components.AppComponent;
import com.maxiee.buybuybuy.injector.components.DaggerAppComponent;
import com.maxiee.buybuybuy.injector.modules.AppModule;

/**
 * Created by maxiee on 15/11/25.
 */
public class BuyApplication extends Application{

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
