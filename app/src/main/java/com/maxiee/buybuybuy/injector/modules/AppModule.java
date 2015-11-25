package com.maxiee.buybuybuy.injector.modules;

import com.maxiee.buybuybuy.BuyApplication;
import com.maxiee.buybuybuy.model.repository.Repository;
import com.maxiee.buybuybuy.model.rest.BuyRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maxiee on 15/11/25.
 */
@Module
public class AppModule {

    private final BuyApplication mBuyApplication;

    public AppModule(BuyApplication buyApplication) {
        mBuyApplication = buyApplication;
    }

    @Provides @Singleton BuyApplication provideBuyApplicationContext() {return mBuyApplication;}

    @Provides @Singleton Repository provideRepository(BuyRepository repository) {return repository;}
}
