package com.maxiee.buybuybuy.injector.components;

import com.maxiee.buybuybuy.BuyApplication;
import com.maxiee.buybuybuy.injector.modules.AppModule;
import com.maxiee.buybuybuy.model.repository.Repository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by maxiee on 15/11/25.
 */
@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
    BuyApplication app();
    Repository repository();
}
