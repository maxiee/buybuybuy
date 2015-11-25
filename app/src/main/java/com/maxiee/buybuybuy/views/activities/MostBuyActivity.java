package com.maxiee.buybuybuy.views.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maxiee.buybuybuy.BuyApplication;
import com.maxiee.buybuybuy.R;
import com.maxiee.buybuybuy.injector.components.DaggerMostBuyComponent;
import com.maxiee.buybuybuy.injector.modules.ActivityModule;
import com.maxiee.buybuybuy.mvp.presenters.MostBuyPresenter;
import com.maxiee.buybuybuy.mvp.views.MostBuyView;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MostBuyActivity extends AppCompatActivity implements MostBuyView{

    @Inject MostBuyPresenter mMostBuyPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initializeDependencyInjector();
        initializePresenter();
    }

    @Override
    public void bindMostBuyList(java.util.List items) {

    }

    @Override
    public void showMostBuyList() {

    }

    public void initializeDependencyInjector() {
        BuyApplication application = (BuyApplication) getApplication();

        DaggerMostBuyComponent.builder()
                .activityModule(new ActivityModule(this))
                .appComponent(application.getAppComponent())
                .build().inject(this);
    }

    private void initializePresenter() {
        mMostBuyPresenter.attachView(this);
        mMostBuyPresenter.onCreate();
    }
}
