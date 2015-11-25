package com.maxiee.buybuybuy.mvp.presenters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.maxiee.buybuybuy.model.entities.MostBuy;
import com.maxiee.buybuybuy.model.rest.BuyRepository;
import com.maxiee.buybuybuy.mvp.views.View;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by maxiee on 15/11/25.
 */
public class MostBuyPresenter implements Presenter {

    private final Context mContext;
    private final BuyRepository mBuyRepository;

    private Subscription mMostBuySubscription;

    private MostBuy mMostBuyData;

    @Inject
    public MostBuyPresenter(Context context, BuyRepository repository) {
        mContext = context;
        mBuyRepository = repository;
    }


    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onPause() {
        mMostBuySubscription.unsubscribe();
    }

    @Override
    public void attachView(View v) {

    }

    @Override
    public void attachIncomingIntent(Intent intent) {

    }

    @Override
    public void onCreate() {
        askForMostBuyData();
    }

    private void askForMostBuyData() {
        Map<String, String> options = new HashMap<>();
        options.put("count", String.valueOf(1));
        options.put("_", String.valueOf(System.currentTimeMillis()));
        mMostBuySubscription = mBuyRepository.getMostBuy(options)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mostBuy -> {
                    mMostBuyData = mostBuy;
                    Log.d("maxiee", String.format(
                            "时间:%s,数目:%d",
                            mMostBuyData.getTitle(),
                            mMostBuyData.getList().size()));
                });
    }
}
