package com.snsh.dev.shopping.rest;

import com.snsh.dev.shopping.model.BestDealModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by saingaungsenghein on 1/5/17.
 */

public interface RequestInterface {

    @GET("sh_best_deal.json")
    Call<List<BestDealModel>> getBestDeal();


}
