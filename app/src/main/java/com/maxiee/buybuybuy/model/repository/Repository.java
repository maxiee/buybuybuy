package com.maxiee.buybuybuy.model.repository;

import com.maxiee.buybuybuy.model.entities.MostBuy;

import java.util.Map;

import rx.Observable;


/**
 * Created by maxiee on 15/11/25.
 */
public interface Repository {
    Observable<MostBuy> getMostBuy(Map<String, String> options);
}
