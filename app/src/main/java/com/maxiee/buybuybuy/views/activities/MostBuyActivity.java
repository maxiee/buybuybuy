package com.maxiee.buybuybuy.views.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.maxiee.buybuybuy.BuyApplication;
import com.maxiee.buybuybuy.R;
import com.maxiee.buybuybuy.injector.components.DaggerMostBuyComponent;
import com.maxiee.buybuybuy.injector.modules.ActivityModule;
import com.maxiee.buybuybuy.model.entities.MostBuyItem;
import com.maxiee.buybuybuy.mvp.presenters.MostBuyPresenter;
import com.maxiee.buybuybuy.mvp.views.MostBuyView;
import com.maxiee.buybuybuy.views.adapter.MostBuyAdapter;
import com.maxiee.buybuybuy.views.common.RecyclerInsetsDecoration;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MostBuyActivity extends AppCompatActivity implements MostBuyView{

    @Bind(R.id.recycler) RecyclerView mRecycler;

    private MostBuyAdapter mAdapter;

    @Inject MostBuyPresenter mMostBuyPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initializeRecyclerView();
        initializeDependencyInjector();
        initializePresenter();
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

    private void initializeRecyclerView() {
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRecycler.addItemDecoration(new RecyclerInsetsDecoration(this));
    }

    @Override
    public void bindMostBuyList(List<MostBuyItem> items) {
        mAdapter = new MostBuyAdapter(items, this, mMostBuyPresenter);
        mRecycler.setAdapter(mAdapter);
    }
}
