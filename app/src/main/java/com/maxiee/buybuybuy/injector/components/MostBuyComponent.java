package com.maxiee.buybuybuy.injector.components;

import com.maxiee.buybuybuy.injector.Activity;
import com.maxiee.buybuybuy.injector.modules.ActivityModule;
import com.maxiee.buybuybuy.views.activities.MostBuyActivity;

import dagger.Component;

/**
 * Created by maxiee on 15/11/25.
 */
@Activity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class})
public interface MostBuyComponent extends ActivityComponent {
    void inject(MostBuyActivity activity);
}
