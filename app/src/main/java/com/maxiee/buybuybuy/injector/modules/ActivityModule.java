package com.maxiee.buybuybuy.injector.modules;

import android.content.Context;

import com.maxiee.buybuybuy.injector.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maxiee on 15/11/25.
 */
@Module
public class ActivityModule {
    private final Context mContext;

    public ActivityModule(Context context) {
        mContext = context;
    }

    @Provides @Activity Context provideActivityContext() {return mContext;}
}
