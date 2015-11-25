package com.maxiee.buybuybuy.mvp.views;

import com.maxiee.buybuybuy.model.entities.MostBuyItem;

import java.util.List;

/**
 * Created by maxiee on 15/11/25.
 */
public interface MostBuyView extends View{

    void bindMostBuyList(List<MostBuyItem> items);

    void showMostBuyList();
}
