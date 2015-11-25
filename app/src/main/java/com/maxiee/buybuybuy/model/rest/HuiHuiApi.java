package com.maxiee.buybuybuy.model.rest;

import com.maxiee.buybuybuy.model.entities.MostBuy;

import java.util.List;
import java.util.Map;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;
import rx.Observable;

/**
 * Created by maxiee on 15/11/25.
 */
public interface HuiHuiApi {
    String END_POINT = "http://zhushou.huihui.cn/";

    @GET("/api/zhushou/inlandreport")
    Observable<List<MostBuy>> getMostBuy(@QueryMap Map<String, String> options);
}
