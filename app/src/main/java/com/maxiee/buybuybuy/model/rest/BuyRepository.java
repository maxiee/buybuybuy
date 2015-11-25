package com.maxiee.buybuybuy.model.rest;

import com.maxiee.buybuybuy.model.entities.MostBuy;
import com.maxiee.buybuybuy.model.repository.Repository;

import java.util.Map;

import javax.inject.Inject;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;

/**
 * Created by maxiee on 15/11/25.
 */
public class BuyRepository implements Repository{

    private final HuiHuiApi mHuiHuiApi;

    @Inject public BuyRepository() {
        Retrofit huiHuiApiAdapter = new Retrofit.Builder()
                .baseUrl(HuiHuiApi.END_POINT)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        mHuiHuiApi = huiHuiApiAdapter.create(HuiHuiApi.class);
    }

    @Override
    public Observable<MostBuy> getMostBuy(Map<String, String> options) {
        return mHuiHuiApi.getMostBuy(options)
                .flatMap(mostBuys -> Observable.from(mostBuys));
    }
}
