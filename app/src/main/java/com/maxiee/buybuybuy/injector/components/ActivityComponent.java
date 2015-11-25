package com.maxiee.buybuybuy.injector.components;

import android.content.Context;

import com.maxiee.buybuybuy.injector.Activity;
import com.maxiee.buybuybuy.injector.modules.ActivityModule;

import dagger.Component;

/**
 * Created by maxiee on 15/11/25.
 */
@Activity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Context context();
}
