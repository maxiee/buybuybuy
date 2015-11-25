package com.maxiee.buybuybuy.mvp.presenters;

import android.content.Intent;

import com.maxiee.buybuybuy.mvp.views.View;

/**
 * Created by maxiee on 15/11/25.
 */
public interface Presenter {

    void onStart();

    void onStop();

    void onPause();

    void attachView(View v);

    void attachIncomingIntent(Intent intent);

    void onCreate();
}
